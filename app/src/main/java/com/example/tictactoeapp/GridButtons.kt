package com.example.tictactoeapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.example.tictactoeapp.ui.theme.TicTacToeButton

@Composable
fun GridButtons(
    button1: String, onButton1Change: () -> Unit,
    button2: String, onButton2Change: () -> Unit,
    button3: String, onButton3Change: () -> Unit,
    button4: String, onButton4Change: () -> Unit,
    button5: String, onButton5Change: () -> Unit,
    button6: String, onButton6Change: () -> Unit,
    button7: String, onButton7Change: () -> Unit,
    button8: String, onButton8Change: () -> Unit,
    button9: String, onButton9Change: () -> Unit,
) {
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .padding(8.dp))
    {
        Row(horizontalArrangement = Arrangement.Center) {
            TicTacToeButton(button1, onButton1Change,Modifier.weight(1f).testTag("Button 1"))
            TicTacToeButton(button2, onButton2Change,Modifier.weight(1f).testTag("Button 2"))
            TicTacToeButton(button3, onButton3Change,Modifier.weight(1f).testTag("Button 3"))
        }
        Row {
            TicTacToeButton(button4, onButton4Change,Modifier.weight(1f).testTag("Button 4"))
            TicTacToeButton(button5, onButton5Change,Modifier.weight(1f).testTag("Button 5"))
            TicTacToeButton(button6, onButton6Change,Modifier.weight(1f).testTag("Button 6"))
        }
        Row {
            TicTacToeButton(button7, onButton7Change,Modifier.weight(1f).testTag("Button 7"))
            TicTacToeButton(button8, onButton8Change,Modifier.weight(1f).testTag("Button 8"))
            TicTacToeButton(button9, onButton9Change,Modifier.weight(1f).testTag("Button 9"))
        }
    }
}
