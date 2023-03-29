package com.example.threadsandstuff

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlin.concurrent.thread

class MyBackgroundService : Service() {
    private var run = false
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        run = true
        thread {
            var i = 1
            while (run) {
                println(i)
                i++
                Thread.sleep(1000)
            }
        }
        Log.d("exercise", "service started")
        return START_STICKY

    }

    override fun onDestroy() {
        run = false
        Thread.interrupted()
        Log.d("exercise", "service stopped")
        super.onDestroy()
    }
}