package com.example.isitpalindrome

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private var resultTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val myIntent = intent
        val isPalindrome = myIntent.getBooleanExtra("isPalindrome", false)

        this.resultTextView = findViewById(R.id.resultTextView)
        resultTextView?.text = if (isPalindrome) "It is a palindrome" else "It's not a palindrome"
    }
}