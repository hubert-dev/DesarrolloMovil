package com.example.firstproject.components.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun ParaCommit(modifier: Modifier = Modifier) {

    Box(modifier = Modifier.background(Color.Gray))
    {
        Text(
            "Esto es una prueba de commit para el laboratorio",
            modifier = Modifier.background(Color.Cyan)
        )

        ParaOtroCommit("Hola desde otro commit")

    }
}

