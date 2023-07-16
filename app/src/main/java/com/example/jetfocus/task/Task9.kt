@file:Suppress("unused")
@file:OptIn(ExperimentalFoundationApi::class)

package com.example.jetfocus.task

import android.content.res.Configuration
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.ui.theme.TaskTheme

// Grids
class Task9 {
    @Composable
    fun Ui() {
        LazyVerticalGrid(columns = GridCells.Fixed(3)) {
            items(users) {
                UserAvatar(it)
            }
        }
    }

    @Composable
    fun Ui1() {
        LazyVerticalGrid(columns = GridCells.Adaptive(80.dp)) {
            items(users) {
                UserAvatar(it)
            }
        }
    }

    @Composable
    fun Ui2() {
        LazyVerticalGrid(columns = GridCells.Fixed(3)) {
            items(users) {
                UserAvatar(it)
            }
        }
    }

    @Composable
    fun Ui3() {
        LazyVerticalStaggeredGrid(columns = StaggeredGridCells.Fixed(3)) {
            items(users) {
                UserAvatar(it)
            }
        }
    }

    @Composable
    fun Ui4() {
        LazyVerticalStaggeredGrid(columns = StaggeredGridCells.Fixed(3)) {
            items(users) {
                UserAvatar(it)
            }
        }
    }


    @Composable
    fun Ui5() {
        LazyVerticalStaggeredGrid(columns = StaggeredGridCells.Adaptive(80.dp)) {
            items(users) {
                UserAvatar(it)
            }
        }
    }

    @Composable
    fun UserAvatar(
        user: User,
        modifier: Modifier = Modifier,
        contentScale: ContentScale = ContentScale.Fit
    ) {
        Image(
            modifier = modifier,
            contentScale = contentScale,
            painter = painterResource(user.imageId),
            contentDescription = null
        )
    }

    @Composable
    @Preview(
        name = "Light Mode",
    )
    @Preview(
        uiMode = Configuration.UI_MODE_NIGHT_YES,
        name = "Dark Mode",
    )
    @Preview(
        name = "Tablet Portrait",
        device = "spec:width=1280dp,height=800dp,dpi=480,orientation=portrait",
    )
    @Preview(
        name = "Tablet",
        device = "spec:width=1280dp,height=800dp,dpi=480",
    )
    fun Preview() {
        TaskTheme {
            Surface {
                Ui()
            }
        }
    }
}