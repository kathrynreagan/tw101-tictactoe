package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;

public class Player {
    private String symbol;
    private BufferedReader bufferedReader;

    public Player(String symbol, BufferedReader bufferedReader) {
        this.symbol = symbol;
        this.bufferedReader = bufferedReader;
    }

    public int makeMove() {
        String input;
        try {
            input = bufferedReader.readLine();
            return Integer.parseInt(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String symbol() {
        return symbol;
    }
}
