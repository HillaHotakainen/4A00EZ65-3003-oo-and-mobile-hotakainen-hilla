package com.example.threadsandstuff

import android.app.Service
import android.content.Intent
import android.content.Intent.ACTION_TIME_TICK
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private val receiver = MyBroadCastReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.mystartbutton)
        val stopButton = findViewById<Button>(R.id.mystopbutton)
        val textView = findViewById<TextView>(R.id.mytextview)
        startButton.setOnClickListener {
            //Log.d("exercise", "button clicked")
            startService(Intent(this, MyBackgroundService::class.java))
//            thread {
//                Log.d("exercise", Thread.currentThread().name)
//                for (i in 1 .. 10) {
//                    println(i)
//                    Thread.sleep(1000)
//                    Log.d("exercise", Thread.currentThread().name)
//                    runOnUiThread{
//                        textView.text = "" + i
//                    }
//                }
//            }
        }
        stopButton.setOnClickListener {
            stopService(Intent(this, MyBackgroundService::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        registerReceiver(receiver, IntentFilter(ACTION_TIME_TICK))
        Log.d("MyBroadCastReceiver", "Broadcast continue")
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(receiver)
        Log.d("MyBroadCastReceiver", "Broadcast stop")
    }
}
