package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var startTime : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeTextView = findViewById<TextView>(R.id.timeTextView)
        startTime = findViewById(R.id.startTimeTextView)

        startTime.text = Calendar.getInstance().time.toString()
        title = startTime.text.toString()

        val showTime = Calendar.getInstance().time.toString()
        timeTextView.text = showTime

        val openSecondActivityButton = findViewById<Button>(R.id.openSecondActivityButton)
        openSecondActivityButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("startTime", startTime.text.toString())

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        startTime.text = savedInstanceState.getString("startTime")

    }
}