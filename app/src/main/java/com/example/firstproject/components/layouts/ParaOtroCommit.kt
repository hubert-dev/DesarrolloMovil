package com.example.firstproject.components.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable

fun ParaOtroCommit(texto : String) {
    Box(modifier =  Modifier.background(Color.Cyan)) {
        Text("$texto")

    }
}