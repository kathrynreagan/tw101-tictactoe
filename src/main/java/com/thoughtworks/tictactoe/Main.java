package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(new PrintStream(System.out));
        game.start();
    }
}
