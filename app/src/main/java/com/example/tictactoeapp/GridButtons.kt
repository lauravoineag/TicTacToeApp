package com.example.tictactoeapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@Composable
fun GridButtons(button1:String,onButton1Change: (String) -> Unit) {

    var buttonText2 by remember { mutableStateOf("") }
    var buttonText3 by remember { mutableStateOf("") }

    Column{
        Row{
            Button(
                onClick =  {onButton1Change("X")}) {
                Text(text = button1)
            }
            Button(
                onClick = { buttonText2 = "x"}) {
                Text(text = buttonText2)
            }
            Button(
                onClick = { buttonText3 = "x"}) {
                Text(text = buttonText3)
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
