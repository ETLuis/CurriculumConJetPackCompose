package com.example.pruebasjetpackcompose

import  android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun App() {
    var counter by rememberSaveable { mutableStateOf(1) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        item {
            Image(
                modifier = Modifier
                    .height(500.dp)
                    .fillMaxWidth()
                    .padding(top = 0.dp)
                    .clip(RoundedCornerShape(16.dp)),
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Mi Currículum",
                color = Color.White,
                fontSize = 32.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp),
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
                        color = Color.White
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
                        color = Color.White
                    )
                    Text(
                        text = "Desarrollador Android",
                        color = Color.Green
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
                        color = Color.White
                    )
                    Text(
                        text = "HTML",
                        color = Color(0xFFFF5722)
                    )
                    Text(
                        text = ", ",
                        color = Color.White
                    )
                    Text(
                        text = "CSS",
                        color = Color(0xFF2196F3)
                    )
                    Text(
                        text = ", ",
                        color = Color.White
                    )
                    Text(
                        text = "JS",
                        color = Color(0xFFFFC107)
                    )
                    Text(
                        text = ", ",
                        color = Color.White
                    )
                    Text(
                        text = "Java",
                        color = Color.Red
                    )
                    Text(
                        text = " y ",
                        color = Color.White
                    )
                    Text(
                        text = "Kotlin",
                        color = Color(0xFF673AB7)
                    )
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Tecnologías: ",
                    color = Color.White
                )
                Text(
                    text = "Arquitectura MVVM, Clean Architecture, SOLID, Corrutinas, Dagger Hilt, Firebase, LiveData, Flows, StateFlow y Calidad de diseños con Layouts y Compose.",
                    color = Color.White
                )
            }
            Row(modifier = Modifier.padding(start = 350.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.img_corazon),
                    contentDescription = "Corazón",
                    colorFilter = ColorFilter.tint(Color(0xFF00FFA9)),
                    modifier = Modifier.clickable { counter++ }
                )
                Text(
                    text = counter.toString(),
                    color = Color(0xFF00FFA9),
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
        }
    }
}

