package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.textView)
        text.setText("")
        val Button = findViewById<Button>(R.id.button2)
        Button.setOnClickListener()
        {
            if(text.text =="Hello world")
            {
                text.setText("")
            }else {
                text.setText("Hello world")
            }
        }
    }
}