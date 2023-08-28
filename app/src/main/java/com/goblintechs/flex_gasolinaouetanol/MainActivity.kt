package com.goblintechs.flex_gasolinaouetanol

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.goblintechs.flex_gasolinaouetanol.ui.theme.FlexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlexTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Welcome() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Bem-vindo(a), Bruno de Souza Bezerra",
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun Home() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Gasolina",
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = "Etanol",
            style = MaterialTheme.typography.titleMedium
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = "Calcular",
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f),
                fontWeight = FontWeight.Bold
            )
        }
    }
}
