package com.example.tictactoeapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable



@Composable
fun GridButtons(button1:String,onButton1Change: () -> Unit,
                button2:String, onButton2Change: () -> Unit,
                button3:String, onButton3Change: () -> Unit) {

    Column{
        Row{
            Button(
                onClick =  {onButton1Change()}) {
                Text(text = button1)
            }
            Button(
                onClick = { onButton2Change()}) {
                Text(text = button2)
            }
            Button(
                onClick = { onButton3Change()}) {
                Text(text = button3)
            }
        }
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "")
            }
        }
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "")
            }
        }
    }
}
