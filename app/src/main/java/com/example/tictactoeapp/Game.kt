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
    var buttonText4 by remember { mutableStateOf("") }
    var buttonText5 by remember { mutableStateOf("") }
    var buttonText6 by remember { mutableStateOf("") }
    var buttonText7 by remember { mutableStateOf("") }
    var buttonText8 by remember { mutableStateOf("") }
    var buttonText9 by remember { mutableStateOf("") }
    var playerTurn by remember { mutableStateOf("X") }

    fun checkPlayerTurn() {
        playerTurn = if (playerTurn == "X") {"O"} else "X"
    }

    fun startGame(){
        buttonText1 = ""
        buttonText2 = ""
        buttonText3 = ""
        buttonText4 = ""
        buttonText5 = ""
        buttonText6 = ""
        buttonText7 = ""
        buttonText8 = ""
        buttonText9 = ""
        playerTurn = "X"
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
            },
            buttonText4, onButton4Change = {
                if (buttonText4 == ""){
                    buttonText4 = playerTurn
                    checkPlayerTurn()}
            },
            buttonText5, onButton5Change = {
                if (buttonText5 == ""){
                    buttonText5 = playerTurn
                    checkPlayerTurn()}
            },
            buttonText6, onButton6Change = {
                if (buttonText6 == ""){
                    buttonText6 = playerTurn
                    checkPlayerTurn()}
            },
            buttonText7, onButton7Change = {
                if (buttonText7 == ""){
                    buttonText7 = playerTurn
                    checkPlayerTurn()}
            },
            buttonText8, onButton8Change = {
                if (buttonText8 == ""){
                    buttonText8 = playerTurn
                    checkPlayerTurn()}
            },
            buttonText9, onButton9Change = {
                if (buttonText9 == ""){
                    buttonText9 = playerTurn
                    checkPlayerTurn()}
            }

        )
        StartGameButton(::startGame)
    }
}
