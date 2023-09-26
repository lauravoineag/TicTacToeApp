package com.example.tictactoeapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

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
    button9: String, onButton9Change: () -> Unit
) {
    Column {
        Row {
            Button(onClick = { onButton1Change() }) {
                Text(text = button1)
            }
            Button(onClick = { onButton2Change() }) {
                Text(text = button2)
            }
            Button(onClick = { onButton3Change() }) {
                Text(text = button3)
            }
        }
        Row {
            Button(onClick = { onButton4Change() }) {
                Text(text = button4)
            }
            Button(onClick = { onButton5Change() }) {
                Text(text = button5)
            }
            Button(onClick = { onButton6Change() }) {
                Text(text = button6)
            }
        }
        Row {
            Button(onClick = { onButton7Change() }) {
                Text(text = button7)
            }
            Button(onClick = { onButton8Change() }) {
                Text(text = button8)
            }
            Button(onClick = { onButton9Change() }) {
                Text(text = button9)
            }
        }
    }
}
