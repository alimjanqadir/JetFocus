package com.example.jetfocus.ui

import android.R
import android.graphics.PixelFormat
import android.os.Bundle
import android.view.ViewGroup
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.core.view.WindowCompat


class MainActivity: ComponentActivity() {

    override fun onCreate(onSavedInstanceState: Bundle?) {
        super.onCreate(onSavedInstanceState)
        val decorView = window.decorView
        val windowManager = windowManager


        //set your status bar gone  Here
        //set your status bar gone  Here
        val params = WindowManager.LayoutParams(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.TYPE_SYSTEM_ALERT,
            WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN,
            PixelFormat.TRANSLUCENT
        )

//
//        val mTopView = layoutInflater.inflate(R.layout.inflator, null) as ViewGroup
//        window.attributes = params
//        windowManager.addView(mTopView, params)

        WindowCompat.setDecorFitsSystemWindows(window, false)


        setContent {
            Image(painter = painterResource(com.example.jetfocus.R.drawable.content),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                alignment = Alignment.TopCenter,
                modifier = Modifier.fillMaxSize())
        }
    }

}