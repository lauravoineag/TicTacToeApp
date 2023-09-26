package com.example.tictactoeapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun DisplayPlayerTurn(player: String, winPlayer:String) {
   Row(modifier = Modifier
       .fillMaxWidth())
    {
       Text(modifier = Modifier
           .background(Color.Yellow)
           .padding(16.dp),
           text = "Player Turn: $player")
        Text(modifier = Modifier
            .background(Color.Green)
            .padding(16.dp),
            text = winPlayer)
   }
}