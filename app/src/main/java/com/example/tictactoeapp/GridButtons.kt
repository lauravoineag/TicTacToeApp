package com.example.tictactoeapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun GameGrid() {
    Column {
        Row {
            Button(
                onClick = { /*TODO*/ }) {
                Text(text = "Column 1")
            }
            Button(
                onClick = { /*TODO*/ }) {
                Text(text = "Column 2")

            }
            Button(
                onClick = { /*TODO*/ }) {
                Text(text = "Column 3")
            }
        }
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Column 4")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Column 5")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Column 6")
            }
        }
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Column 7")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Column 8")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Column 9")
            }
        }
    }
}
