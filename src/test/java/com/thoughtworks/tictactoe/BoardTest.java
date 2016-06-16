package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {

    private PrintStream printStream;
    private Board board;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldPrintBrandNewGameBoardWhenNewGameBoardIsCreated() {
        board.printGameBoard();

        verify(printStream).println("1|2|3\n" + "-----\n" + "4|5|6\n" + "-----\n" + "7|8|9");
    }

    @Test
    public void shouldPrintXInSquareWhenPlayerMakesFirstMove() {
        board.placeMarkInSquare("X", 4);

        verify(printStream).println("1|2|3\n" + "-----\n" + "X|5|6\n" + "-----\n" + "7|8|9");
    }

}