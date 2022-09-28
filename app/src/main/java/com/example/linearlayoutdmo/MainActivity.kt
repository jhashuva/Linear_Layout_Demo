package com.example.linearlayoutdmo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input:EditText = findViewById(R.id.input)
        var btn = findViewById<Button>(R.id.btn)
        var output: TextView = findViewById(R.id.output)
        btn.setOnClickListener(){
            output.text = input.text.toString()
        }

    }
}