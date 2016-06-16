package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {

    private PrintStream printStream;
    private Game game;
    private BufferedReader bufferedReader;
    private Board board;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        game = new Game(printStream, bufferedReader, board);
    }

    @Test
    public void shouldDrawTicTacToeBoardWhenGameStarts() throws IOException {
        when(bufferedReader.readLine()).thenReturn("5"); // not necessary -- fix this later

        game.start();

        verify(board).printGameBoard();
    }

    @Test
    public void shouldPromptPlayerXToMakeTheFirstMove() throws IOException {
        when(bufferedReader.readLine()).thenReturn("5"); // not necessary -- fix this later

        game.start();

        verify(printStream).println("Player X, where would you like to make your move?");
    }


    @Test
    public void shouldPlaceXInCorrespondingSquareWhenPlayerXEntersAnyNumber() throws IOException {
        int randomNumberBetween1And9 = (new Random().nextInt(9)) + 1;
        when(bufferedReader.readLine()).thenReturn(Integer.toString(randomNumberBetween1And9));

        game.start();


        verify(board).placeMarkInSquare("X", randomNumberBetween1And9);
    }

    @Test
    public void shouldPromptPlayerOToMakeNextMoveAndPlaceAnOInThatSquareAfterPlayerXGoes() throws IOException {
        when(bufferedReader.readLine()).thenReturn("9", "7");

        game.start();

        verify(printStream).println("Player O, where would you like to make your move?");
        verify(board).placeMarkInSquare("X", 9);
        verify(board).placeMarkInSquare("O", 7);



    }

}