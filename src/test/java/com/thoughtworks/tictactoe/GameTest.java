package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class GameTest {

    private PrintStream printStream;
    private Game game;
    private BufferedReader bufferedReader;
    private Board board;
    private Player playerX;
    private Player playerO;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        playerX = mock(Player.class);
        playerO = mock(Player.class);
        game = new Game(printStream, bufferedReader, board, playerX, playerO);
    }

    @Test
    public void shouldDrawTicTacToeBoardWhenGameStarts() throws IOException {
        game.start();

        verify(board).printGameBoard();
    }

    @Test
    public void shouldPromptPlayerXToMakeTheFirstMove() throws IOException {
        game.start();

        verify(printStream).println("Player X, where would you like to make your move?");
    }


    @Test
    public void playerXShouldMakeFirstMoveAfterGameBoardIsDrawn() throws IOException {
        game.start();

        verify(playerX).makeMove();
    }

    @Test
    public void playerOShouldMakeSecondMove() throws IOException {
        game.start();

        verify(playerO).makeMove();
    }


}