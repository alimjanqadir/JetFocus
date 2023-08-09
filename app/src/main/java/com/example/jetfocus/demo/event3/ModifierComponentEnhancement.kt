package com.example.jetfocus.demo.event3

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.R


@Preview
@Composable
private fun UserImage() {
    Column {
        Image(
            painter = painterResource(R.drawable.scenary_1), null,
            modifier = Modifier
                .clip(CircleShape)
                .border(4.dp, Color.Green, CircleShape)
        )
        androidx.compose.material3.Text("老王")
    }
}