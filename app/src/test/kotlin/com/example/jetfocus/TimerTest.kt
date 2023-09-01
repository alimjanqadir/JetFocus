package com.example.jetfocus

import com.example.jetfocus.ui.calculateHighLightPosition
import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.time.Duration.Companion.minutes

class TimerTest {
    @Test
    fun calculateHighLightPosition_CountDownAt10_ReturnTrue() {
        val highLightPosition = calculateHighLightPosition(24.minutes, 14.minutes)
        assertEquals(10,highLightPosition)
    }
}
