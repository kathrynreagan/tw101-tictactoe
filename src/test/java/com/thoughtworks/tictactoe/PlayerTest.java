package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerTest {

    private BufferedReader bufferedReader;
    private Player playerX;

    @Before
    public void setUp() throws Exception {
        bufferedReader = mock(BufferedReader.class);
        playerX = new Player("X", bufferedReader);
    }

    @Test
    public void shouldReturnPlayersSymbol() {
        String symbol = playerX.symbol();

        assertThat(symbol, is("X"));
    }

    @Test
    public void shouldReturnNumberWhenPlayerEntersANumber() throws IOException {
        when(bufferedReader.readLine()).thenReturn("5");

        int moveLocation = playerX.makeMove();

        assertThat(moveLocation, is(5));
    }

}