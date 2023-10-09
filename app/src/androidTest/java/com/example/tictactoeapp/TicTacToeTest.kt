package com.example.tictactoeapp

import androidx.compose.ui.test.hasClickAction
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test


class TicTacToeTest {

    @get:Rule
    val rule = createComposeRule()

    @Before
    fun setUp() { rule.setContent { Game() } }

    @Test
    fun startGame_displayText(){
        rule.onNodeWithText("Player Turn: X").assertExists()
        rule.onNode(
            hasText("Start Game") and hasClickAction()).assertExists()
    }

    @Test
    fun startGame_displayEmptyGrid(){
        rule.onNode(hasTestTag("Button 1")and hasText("") and hasClickAction()).assertExists()
    //to do - to test the remainder 8 buttons
    }
    @Test
    fun pressButton_displayText(){
        rule.onNode(hasTestTag("Button 1")).performClick()
        rule.onNode(hasTestTag("Button 1") and hasText("X")).assertExists()
        runBlocking {delay(2000)}
    }

    @Test
    fun pressStartButton_displayEmptyGrid(){
        rule.onNode(hasTestTag("Button 1")).performClick()
        rule.onNode(hasTestTag("Button 1") and hasText("X")).assertExists()
        runBlocking {delay(2000)}
        rule.onNodeWithText("Start Game").performClick()
        rule.onNode(hasTestTag("Button 1")and hasText("")).assertExists()
        runBlocking {delay(2000)}
    }

}