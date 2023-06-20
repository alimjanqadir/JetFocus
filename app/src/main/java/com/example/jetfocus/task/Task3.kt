import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfocus.R

/*熟悉布局：Row。*/
class Task3 {
    /*
    * TODO(1. 在现在的基础上，往图片右方加两个文字；一个显示用户工作另一个显示简介)
    * TODO(2. 用户工作为："Android Developer", 简介是："Andy 是相当有经验的安卓开发者，他参与了Google的各类大型项目，他喜欢游泳和烘培。")
    */

    @Composable
    fun UserInfoCard() {
        Column {
            Image(
                painter = painterResource(R.drawable.andy),
                contentDescription = null
            )
            Text("Andy Holloway")
        }
    }

    @Composable
    @Preview
    fun Preview() {
        UserInfoCard()
    }
}

