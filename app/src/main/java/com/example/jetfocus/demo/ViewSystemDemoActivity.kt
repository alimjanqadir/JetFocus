package com.example.jetfocus.demo

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.example.jetfocus.R

class ViewSystemDemoActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_system_demo)

        var counter = 0
        val textview = findViewById<TextView>(R.id.textview)
        val button = findViewById<TextView>(R.id.button)

        button.setOnClickListener {
            counter += 1
            textview.setText("$counter")
        }
    }
}