package com.example.firstproject.components.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSerializable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstproject.ui.theme.Purple80

@Preview
@Composable
fun MyBox() {

    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        //aqui es el primer Box
        Box(
            modifier = Modifier
                .background(color = Purple80)
                .width(width = 10.dp)
                .height(height = 60.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(text = "Hola Golal gadsdgasg", textAlign = TextAlign.Center)
        }
    }
}