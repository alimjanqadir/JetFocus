package com.example.jetfocus.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity: ComponentActivity() {

    override fun onCreate(onSavedInstanceState: Bundle?) {
        super.onCreate(onSavedInstanceState)
        setContent {
            JetFocusApp()
        }
    }

}