package com.example.jetfocus.demo.event3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.jetfocus.R

@Preview
@Composable
private fun UserImage() {
    Border(4.dp, Color.Green, CircleShape) {
        Clip(CircleShape) {
            Column {
                Image(
                    painter = painterResource(R.drawable.scenary_1), null
                )
                Text("老王")
            }
        }
    }
}

@Composable
fun Border(dp: Dp, green: Color, circleShape: RoundedCornerShape, content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}


@Composable
fun Clip(shape: Shape, content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}
