package com.example.tictactoeapp

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun StartGameButton() {
    Button(
        modifier = Modifier
        .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Green, contentColor = Color.Black),
        onClick = { /*TODO*/ }) {
        Text(text = "Start Game")

    }
}