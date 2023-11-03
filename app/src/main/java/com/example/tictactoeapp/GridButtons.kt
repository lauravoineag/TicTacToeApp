package com.example.tictactoeapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp

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
            .background(Color.Cyan)
            .padding(8.dp))
    {
        Row(horizontalArrangement = Arrangement.Center) {
            Button(
                modifier = Modifier
                    .weight(1f)
                    .testTag("Button 1"),
                onClick = { onButton1Change() }) {
                Text(text = button1)
            }
            Button(
                modifier = Modifier
                    .weight(1f)
                    .testTag("Button 2"),
                onClick = { onButton2Change() }) {
                Text(text = button2)
            }
            Button(
                modifier = Modifier
                    .weight(1f)
                    .testTag("Button 3"),
                onClick = { onButton3Change() }) {
                Text(text = button3)
            }
        }
        Row {
            Button(
                modifier = Modifier
                    .weight(1f)
                    .testTag("Button 4"),
                onClick = { onButton4Change() }) {
                Text(text = button4)
            }
            Button(
                modifier = Modifier
                    .weight(1f)
                    .testTag("Button 5"),
                onClick = { onButton5Change() }) {
                Text(text = button5)
            }
            Button(
                modifier = Modifier
                    .weight(1f)
                    .testTag("Button 6"),
                onClick = { onButton6Change() }) {
                Text(text = button6)
            }
        }
        Row {
            Button(
                modifier = Modifier
                    .weight(1f)
                    .testTag("Button 7"),
                onClick = { onButton7Change() }) {
                Text(text = button7)
            }
            Button(
                modifier = Modifier
                    .weight(1f)
                    .testTag("Button 8"),
                onClick = { onButton8Change() }) {
                Text(text = button8)
            }
            Button(
                modifier = Modifier
                    .weight(1f)
                    .testTag("Button 9"),
                onClick = { onButton9Change() }) {
                Text(text = button9)
            }
        }
    }
}
