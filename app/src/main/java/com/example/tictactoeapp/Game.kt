package com.example.tictactoeapp


import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun Game()
{
    var buttonText1 by remember { mutableStateOf("") }
    var playerTurn by remember { mutableStateOf("") }

    Column {
        DisplayPlayerTurn(playerTurn)
        GridButtons(buttonText1, onButton1Change = {
            buttonText1 = it
            playerTurn = "O"
        })
        StartGameButton()
    }
}