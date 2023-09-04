package com.example.tictactoeapp


import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun Game()
{
    Column {
        DisplayPlayerTurn()
        GameGrid()
        StartGameButton()
    }
}