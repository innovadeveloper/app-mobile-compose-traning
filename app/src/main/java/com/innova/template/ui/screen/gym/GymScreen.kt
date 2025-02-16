package com.innova.template.ui.screen.gym

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class GymScreen {

    //    @Preview(showSystemUi = true, showBackground = true)
    @Composable
    fun Header() {
        Text(
            text = "Action",
            color = Color.Red,
            modifier = Modifier
                .padding(30.dp)
                .background(Color.White)
                .padding(16.dp) // Agregar padding para evitar que el texto se pegue a los bordes
        )
    }

    /**
     *  Ejercicio: Diseña una pantalla con un Column (vertical) que tenga un Row dentro con 3 elementos
     */
    @Preview(
        showSystemUi = true, showBackground = true,
        device = Devices.NEXUS_6
    )
    @Composable
    fun body() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red)
                .padding(10.dp)
        ) {
//            FIRST ROW
            Row(modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier
                        .background(Color.White)
                        .weight(1f)
                        .fillMaxHeight(),
                    contentAlignment = Alignment.Center
                ) {
                    Text("A", fontWeight = FontWeight.Bold)
                }
                Box(modifier = Modifier
                    .background(Color.Blue)
                    .weight(1f)
                    .fillMaxHeight(),
                    contentAlignment = Alignment.Center) {
                    Text("B", color = Color.White, fontWeight = FontWeight.Bold)
                }
                Box(modifier = Modifier
                    .background(Color.Green)
                    .weight(1f)
                    .fillMaxHeight(),
                    contentAlignment = Alignment.Center) {
                    Text("C", fontWeight = FontWeight.Bold)
                }
            }
//            SECOND ROW
            Row(modifier = Modifier.weight(1f)) {
                Box(modifier = Modifier
                    .background(Color.Black)
                    .weight(1f)
                    .fillMaxHeight())
                Box(modifier = Modifier
                    .background(Color.Cyan)
                    .weight(1f)
                    .fillMaxHeight())
                Box(modifier = Modifier
                    .background(Color.DarkGray)
                    .weight(1f)
                    .fillMaxHeight())
            }
//            THIRD ROW
            Row(modifier = Modifier.weight(1f)) {
                Box(modifier = Modifier
                    .background(Color.LightGray)
                    .weight(1f)
                    .fillMaxHeight())
                Box(modifier = Modifier
                    .background(Color.Magenta)
                    .weight(1f)
                    .fillMaxHeight())
                Box(modifier = Modifier
                    .background(Color.Yellow)
                    .weight(1f)
                    .fillMaxHeight())
            }
        }
    }

    @Composable
    fun footer() {

    }

}