package com.example.jetfocus.demo.event1

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.jetfocus.R

class ViewSystemCounterDemoActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_system_counter_demo)

        var counter = 0
        val textview = findViewById<TextView>(R.id.counterTextview)
        val addButton = findViewById<Button>(R.id.addButton)
        val removeButton = findViewById<Button>(R.id.removeButton)

        addButton.setOnClickListener {
            counter += 1
            textview.setText("$counter")
        }
        removeButton.setOnClickListener {
            counter += 1
            textview.setText("$counter")
        }
    }
}



