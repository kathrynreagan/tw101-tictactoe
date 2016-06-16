package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Game {
    private PrintStream printStream;

    public Game(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void start() {
        printStream.println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }
}
