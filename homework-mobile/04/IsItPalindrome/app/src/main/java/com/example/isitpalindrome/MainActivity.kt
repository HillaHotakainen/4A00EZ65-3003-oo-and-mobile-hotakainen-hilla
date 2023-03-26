package com.example.isitpalindrome

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var editText: EditText? = null
    private var mybutton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate()")

        this.editText = findViewById(R.id.isPalindromeEditText)
        this.mybutton = findViewById(R.id.checkPalindromeButton)

        mybutton?.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val text = editText?.text.toString()
        val isPalindrome = isPalindrome(text)
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("isPalindrome", isPalindrome)
        startActivity(intent)

    }
    private fun isPalindrome(text: String): Boolean {
        var reversed = ""
        for(i in text.length - 1 downTo 0) {
            reversed += text[i]
        }
        if(reversed == text) {
            return true
        }
        return false
    }
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume()")
    }
    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop()")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy()")
    }


}