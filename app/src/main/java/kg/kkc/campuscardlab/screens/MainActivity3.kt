package kg.kkc.campuscardlab.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Profile()
        }
    }

    @Composable
    fun ScheduleRow(time: String, title: String, room: String) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = time)
            Text(text = title)
            Text(text = room)
        }
    }

    @Composable
    fun ProfileHeader(name: String, status: String) {
        Column {
            Text(text = name)
            Text(text = status)
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun Profile() {
        Column(
            modifier = Modifier.padding(top = 50.dp, start = 10.dp)
        ) {
            ProfileHeader(
                name = "Анжелика Ли",
                status = "Android-разработчик"
            )

            Spacer(modifier = Modifier.height(16.dp))

            ScheduleRow(
                time = "09:00",
                title = "Kotlin",
                room = "Аудитория 1"
            )

            ScheduleRow(
                time = "11:00",
                title = "Jetpack Compose",
                room = "Аудитория 2"
            )
        }
    }
}