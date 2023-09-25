package com.example.tictactoeapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable



@Composable
fun GridButtons(button1:String,onButton1Change: (String) -> Unit,
                button2:String, onButton2Change: (String) -> Unit,
                button3:String, onButton3Change: (String) -> Unit) {

    Column{
        Row{
            Button(
                onClick =  {onButton1Change("x")}) {
                Text(text = button1)
            }
            Button(
                onClick = { onButton2Change("x")}) {
                Text(text = button2)
            }
            Button(
                onClick = { onButton3Change("x")}) {
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
