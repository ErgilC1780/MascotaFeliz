package com.example.mascotafelizz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mascotafelizz.ui.theme.MascotaFelizzTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MascotaFelizzTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    Elementos()
                }
            }
        }
    }
}

@Composable
fun Elementos () {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.maxresdefault),
            contentDescription = "perroBaki"
        )
        Text(
            "Mascota Feliz",
            color = Color.Blue,
            fontSize = 40.sp

        )
        Text("Bienvenido Usuario ")
        Row() {
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text("Tu mascota")
            }
            Spacer(modifier = Modifier.width(10.dp))
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text ("Contenidos")
            }

        }

    }
}
@Preview (showBackground = true)
@Composable
fun ElementosPreview () {
    MascotaFelizzTheme {
        Elementos()
    }
}
/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MascotaFelizzTheme {
        Greeting("Android")
    }
}

 */
