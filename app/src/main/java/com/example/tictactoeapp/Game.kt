package com.example.tictactoeapp


import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun Game() {
    var buttonText1 by remember { mutableStateOf("") }
    var buttonText2 by remember { mutableStateOf("") }
    var buttonText3 by remember { mutableStateOf("") }
    var playerTurn by remember { mutableStateOf("X") }

    fun checkPlayerTurn() {
        playerTurn = if (playerTurn == "X") {"O"} else "X"
    }

    Column {
        DisplayPlayerTurn(playerTurn)
        GridButtons(buttonText1,
            onButton1Change = {
                if (buttonText1 == "") {
                buttonText1 = playerTurn
                checkPlayerTurn()}
            },
            buttonText2, onButton2Change = {
                if (buttonText2 == ""){
                buttonText2 = playerTurn
                checkPlayerTurn()}
            },
            buttonText3, onButton3Change = {
                if (buttonText3 == ""){
                buttonText3 = playerTurn
                checkPlayerTurn()}
            }
        )
        StartGameButton()
    }
}
