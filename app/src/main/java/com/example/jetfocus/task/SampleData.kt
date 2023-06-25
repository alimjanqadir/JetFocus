package com.example.jetfocus.task

import com.example.jetfocus.R

data class User(val imageId: Int, val name: String, val title: String, val intro: String)

val users = listOf(
    User(R.drawable.jetpack_compose, "Andy", "Programmer", "Test"),
)