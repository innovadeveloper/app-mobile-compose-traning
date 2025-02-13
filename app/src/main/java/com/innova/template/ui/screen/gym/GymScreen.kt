package com.innova.template.ui.screen.gym

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class GymScreen {

    @Preview(showSystemUi = true, showBackground = true)
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

    @Composable
    fun body(){

    }

    @Composable
    fun footer(){

    }

}