package com.example.starwarsapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.fasterxml.jackson.databind.ObjectMapper
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private lateinit var lv : ListView
    private lateinit var adapter : ArrayAdapter<Person>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv = findViewById<ListView>(R.id.listView)
        adapter = ArrayAdapter<Person>(this, R.layout.item, R.id.myTextView, mutableListOf<Person>())
        lv.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        thread {
            val data : String? = getUrl("https://swapi.dev/api/people/")
//            if (data != null) {
//                val jsonObject = JSONObject(data)
//                val resultsArray = jsonObject.getJSONArray("results")
//                val person = resultsArray.getJSONObject(0)
//                val name = person.getString("name")
//                runOnUiThread {
//                    val textView = findViewById<TextView>(R.id.textView1)
//                    textView.text = name
//                }
//            }

            val mp = ObjectMapper()
            val myObject: StarWarsJsonObject = mp.readValue(data, StarWarsJsonObject::class.java)
            var persons: MutableList<Person>? = myObject.results
            persons?.forEach {
                runOnUiThread {
                    adapter.add(it)

                }
            }
        }
    }

    fun getUrl(url: String) : String? {
        var result: String? = null
        val myUrl = URL(url)
        val sb = StringBuffer()
        val conn = myUrl.openConnection() as HttpURLConnection
        val inputstream = conn.getInputStream()
        val reader = BufferedReader(InputStreamReader(conn.getInputStream()));

        reader.use {
            var line: String? = null
            do {
                line = it.readLine()
                sb.append(line)
            } while (line != null)
            result = sb.toString()

        }
        return result
        reader.close()
    }
}