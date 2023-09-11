package com.example.tictactoeapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun DisplayPlayerTurn(player: String) {
   Box(modifier = Modifier
       .fillMaxWidth())
    {
       Text(modifier = Modifier
           .background(Color.Yellow)
           .align(alignment = Alignment.Center)
           .padding(16.dp),
           text = "Player Turn: $player")
   }
}