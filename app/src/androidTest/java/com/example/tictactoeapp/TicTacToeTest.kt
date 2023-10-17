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
    fun setUp() { rule.setContent { Game(true) } }

    @Test
    fun startGame_displayText(){
        rule.onNodeWithText("Player Turn: X").assertExists()
        rule.onNode(
            hasText("Start Game") and hasClickAction()).assertExists()
    }

    //onNode- finder(look for item "Button1" that is empty and is clickable) then assert that the item exists
    //every item in the UI is a node
    @Test
    fun startGame_displayEmptyGrid(){
        rule.onNode(hasTestTag("Button 1")and hasText("") and hasClickAction()).assertExists()
    //to do - to test the remainder 8 buttons
    }
    @Test
    fun pressButton_displayButtonTextAndPlayerTurn(){
        rule.onNode(hasTestTag("Button 1")).performClick()
        rule.onNode(hasTestTag("Button 1") and hasText("X")).assertExists()
        rule.onNodeWithText("Player Turn: O").assertExists()

        rule.onNode(hasTestTag("Button 2")).performClick()
        rule.onNode(hasTestTag("Button 2") and hasText("O")).assertExists()
        rule.onNodeWithText("Player Turn: X").assertExists()

        runBlocking {delay(2000)}
    }

    @Test
    fun pressAllXesOnTopRow_winsGame() {
        rule.onNode(hasTestTag("Button 1")).performClick()
        rule.onNode(hasTestTag("Button 4")).performClick()
        rule.onNode(hasTestTag("Button 2")).performClick()
        rule.onNode(hasTestTag("Button 5")).performClick()
        rule.onNode(hasTestTag("Button 3")).performClick()

        rule.onNode(hasTestTag("Button 1") and hasText("X")).assertExists()
        rule.onNode(hasTestTag("Button 2") and hasText("X")).assertExists()
        rule.onNode(hasTestTag("Button 3") and hasText("X")).assertExists()
        rule.onNodeWithText("X won").assertExists()

        rule.onNode(hasTestTag("Button 6")).performClick()
        rule.onNode(hasTestTag("Button 7")).performClick()
        rule.onNode(hasTestTag("Button 8")).performClick()
        rule.onNode(hasTestTag("Button 9")).performClick()
        rule.onNode(hasTestTag("Button 6")and hasText("")).assertExists()
        rule.onNode(hasTestTag("Button 7")and hasText("")).assertExists()
        rule.onNode(hasTestTag("Button 8")and hasText("")).assertExists()
        rule.onNode(hasTestTag("Button 9")and hasText("")).assertExists()
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