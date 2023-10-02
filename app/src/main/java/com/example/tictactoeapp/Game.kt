package com.example.tictactoeapp


import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@Composable
fun Game() {
    val buttonText1: MutableState<String> = remember { mutableStateOf("") }
    val buttonText2: MutableState<String> = remember { mutableStateOf("") }
    val buttonText3: MutableState<String> = remember { mutableStateOf("") }
    val buttonText4: MutableState<String> = remember { mutableStateOf("") }
    val buttonText5: MutableState<String> = remember { mutableStateOf("") }
    val buttonText6: MutableState<String> = remember { mutableStateOf("") }
    val buttonText7: MutableState<String> = remember { mutableStateOf("") }
    val buttonText8: MutableState<String> = remember { mutableStateOf("") }
    val buttonText9: MutableState<String> = remember { mutableStateOf("") }
    var playerTurn by remember { mutableStateOf("X") }
    var playerWin by remember { mutableStateOf("") }

    fun checkPlayerTurn() {
        playerTurn = if (playerTurn == "X") {"O"} else "X"
    }

    fun allButtonsClicked(): Boolean {
        return (buttonText1.value != "" && buttonText2.value != "" && buttonText3.value != "" &&
                buttonText4.value != "" && buttonText5.value != "" && buttonText6.value != "" &&
                buttonText7.value != "" && buttonText8.value != "" && buttonText9.value != "")
    }

    fun checkWin(player: String): Boolean {
        return (player == buttonText1.value && player == buttonText2.value && player == buttonText3.value) ||
                (player == buttonText4.value && player == buttonText5.value && player == buttonText6.value) ||
                (player == buttonText7.value && player == buttonText8.value && player == buttonText9.value) ||
                (player == buttonText1.value && player == buttonText5.value && player == buttonText9.value) ||
                (player == buttonText3.value && player == buttonText5.value && player == buttonText7.value) ||
                (player == buttonText1.value && player == buttonText4.value && player == buttonText7.value) ||
                (player == buttonText2.value && player == buttonText5.value && player == buttonText8.value) ||
                (player == buttonText3.value && player == buttonText6.value && player == buttonText9.value)
    }

    fun playerTakesTurn(buttonText: MutableState<String>){
        if (buttonText.value == "" && playerWin == ""){
            buttonText.value = playerTurn
        if (checkWin(playerTurn)) { playerWin = "$playerTurn won" }
        else if (allButtonsClicked()) {playerWin = ":( nobody won"}
        else checkPlayerTurn()
    }}

    fun startGame(){
        buttonText1.value = ""
        buttonText2.value = ""
        buttonText3.value = ""
        buttonText4.value = ""
        buttonText5.value = ""
        buttonText6.value = ""
        buttonText7.value = ""
        buttonText8.value = ""
        buttonText9.value = ""
        playerTurn = "X"
        playerWin = ""
    }

    Column {
        DisplayPlayerTurn(playerTurn,playerWin)
        GridButtons(
            buttonText1.value, onButton1Change = { playerTakesTurn(buttonText1) },
            buttonText2.value, onButton2Change = { playerTakesTurn(buttonText2) },
            buttonText3.value, onButton3Change = { playerTakesTurn(buttonText3) },
            buttonText4.value, onButton4Change = { playerTakesTurn(buttonText4) },
            buttonText5.value, onButton5Change = { playerTakesTurn(buttonText5) },
            buttonText6.value, onButton6Change = { playerTakesTurn(buttonText6) },
            buttonText7.value, onButton7Change = { playerTakesTurn(buttonText7) },
            buttonText8.value, onButton8Change = { playerTakesTurn(buttonText8) },
            buttonText9.value, onButton9Change = { playerTakesTurn(buttonText9) }
        )
        StartGameButton(::startGame)
    }
}

