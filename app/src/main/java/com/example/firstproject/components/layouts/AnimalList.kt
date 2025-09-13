package com.example.firstproject.components.layouts


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AnimalList(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    var animalName by rememberSaveable { mutableStateOf("") }
    var animals by rememberSaveable { mutableStateOf(listOf<String>()) }

    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = if (count == 0) "Aún no tienes animales."
            else "Has agregado $count animales."
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = animalName,
            onValueChange = { animalName = it },
            label = { Text("Nombre del animal") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            if (animalName.isNotBlank()) {
                animals = animals + animalName
                count++
                animalName = ""
            }
        }) {
            Text("Agregar Animal")
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Mostrar la lista de animales agregados
        animals.forEachIndexed { index, animal ->
            Text(text = "${index + 1}. 🐾 $animal")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAnimalList() {
    AnimalList()
}
