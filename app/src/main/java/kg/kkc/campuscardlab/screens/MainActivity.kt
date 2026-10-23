package kg.kkc.campuscardlab.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kg.kkc.campuscardlab.ui.theme.Pink80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CampusCardScreen()
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun CampusCardScreen() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 64.dp, start = 12.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Campus Card",
                style = MaterialTheme.typography.headlineMedium,
                color = Pink80,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Name: Lee Angelika",
                style = MaterialTheme.typography.bodyMedium,
                color = Pink80,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Student Id: 05042007",
                style = MaterialTheme.typography.bodyMedium,
                color = Pink80,
                fontWeight = FontWeight.Bold
            )
        }
    }
}