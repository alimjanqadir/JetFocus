package com.example.jetfocus.ui

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class TimerKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun clicked() {
        composeTestRule.setContent {
            Click()
        }

        composeTestRule.onNodeWithText("Click").performClick()
        composeTestRule.onNodeWithText("Clicked").assertIsDisplayed()
    }
}