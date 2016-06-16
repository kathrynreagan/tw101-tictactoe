package com.thoughtworks.tictactoe;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {

    @Test
    public void shouldDrawTicTacToeBoardWhenGameStarts() {
        PrintStream printStream = mock(PrintStream.class);
        Game game = new Game(printStream);

        game.start();

        verify(printStream).println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }
}