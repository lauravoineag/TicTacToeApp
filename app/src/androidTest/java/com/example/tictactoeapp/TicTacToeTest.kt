package com.example.tictactoeapp

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class TicTacToeTest {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun startGame_displayText(){
        rule.setContent { Game() }
        rule.onNodeWithText("Player Turn: X").assertExists()
        rule.onNodeWithText("Start Game").assertExists()
    }
}