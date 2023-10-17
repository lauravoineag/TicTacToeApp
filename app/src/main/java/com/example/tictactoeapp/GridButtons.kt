package com.example.tictactoeapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

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
    Column{
        Row {
            Button(
                modifier = Modifier.testTag("Button 1"),
                onClick = { onButton1Change() }) {
                Text(text = button1)
            }
            Button(
                modifier = Modifier.testTag("Button 2"),
                onClick = { onButton2Change() }) {
                Text(text = button2)
            }
            Button(
                modifier = Modifier.testTag("Button 3"),
                onClick = { onButton3Change() }) {
                Text(text = button3)
            }
        }
        Row {
            Button(
                modifier = Modifier.testTag("Button 4"),
                onClick = { onButton4Change() }) {
                Text(text = button4)
            }
            Button(
                modifier = Modifier.testTag("Button 5"),
                onClick = { onButton5Change() }) {
                Text(text = button5)
            }
            Button(
                modifier = Modifier.testTag("Button 6"),
                onClick = { onButton6Change() }) {
                Text(text = button6)
            }
        }
        Row {
            Button(
                modifier = Modifier.testTag("Button 7"),
                onClick = { onButton7Change() }) {
                Text(text = button7)
            }
            Button(
                modifier = Modifier.testTag("Button 8"),
                onClick = { onButton8Change() }) {
                Text(text = button8)
            }
            Button(
                modifier = Modifier.testTag("Button 9"),
                onClick = { onButton9Change() }) {
                Text(text = button9)
            }
        }
    }
}
