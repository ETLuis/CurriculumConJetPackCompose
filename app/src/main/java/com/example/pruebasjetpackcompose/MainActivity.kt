package com.example.pruebasjetpackcompose

import  android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            app()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun app() {
    var counter by rememberSaveable { mutableStateOf(1) }
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            Image(
                modifier = Modifier
                    .height(500.dp)
                    .fillMaxWidth(),
                painter = painterResource(id = R.drawable.splash_background),
                contentDescription = "background"
            )
            Text(
                text = "Mi Currículum",
                color = Color.Black,
                fontSize = 32.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                item {
                    Text(
                        text = "Nombre: ",
                        color = Color.Black
                    )
                    Text(
                        text = "Luis",
                        color = Color.Red
                    )
                }
            }
            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                item {
                    Text(
                        text = "Profesión: ",
                        color = Color.Black
                    )
                    Text(
                        text = "Desarrollador Android",
                        color = Color.DarkGray
                    )
                }
            }
            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                item {
                    Text(
                        text = "Lenguajes: ",
                        color = Color.Black
                    )
                    Text(
                        text = "Java ",
                        color = Color.Red
                    )
                    Text(
                        text = "y ",
                        color = Color.DarkGray
                    )
                    Text(
                        text = "Kotlin",
                        color = Color.Blue
                    )
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ){
                    Text(
                        text = "Tecnologías: ",
                        color = Color.Black
                    )
                    Text(
                        text = "Arquitectura MVVM, Clean Architecture, SOLID, Corrutinas, Dagger Hilt, Firebase, LiveData, Flows, StateFlow, Conocimiento amplio de layouts y Calidad de diseños.",
                        color = Color.Black
                    )
            }
            Row(modifier = Modifier.padding(start = 350.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.img_corazon),
                    contentDescription = "Corazón",
                    modifier = Modifier.clickable { counter++ }
                )
                Text(
                    text = counter.toString(),
                    color = Color.Red,
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
        }
    }
}

