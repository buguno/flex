package com.goblintechs.flex_gasolinaouetanol

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
fun Home() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = stringResource(R.string.gasoline),
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.paddingFromBaseline(bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.ethanol),
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.paddingFromBaseline(bottom = 8.dp)
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = stringResource(R.string.calculate),
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f),
                fontWeight = FontWeight.Bold
            )
        }
    }
}
