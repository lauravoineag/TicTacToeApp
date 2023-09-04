package com.example.tictactoeapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun DisplayPlayerTurn() {
   Box(modifier = Modifier
       .fillMaxWidth())
    {
       Text(modifier = Modifier
           .align(alignment = Alignment.Center)
           .padding(16.dp),
           text = "Player Turn")
   }
}