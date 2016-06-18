package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Board board = new Board(printStream);
        Player playerX = new Player("X", bufferedReader);
        Player playerO = new Player("O", bufferedReader);
        new Game(printStream, board, playerX, playerO).start();
    }
}
