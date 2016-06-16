package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;
    private boolean playerXIsPlaying;

    public Game(PrintStream printStream, BufferedReader bufferedReader, Board board) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.board = board;
        playerXIsPlaying = true;
    }

    public void start() {
        board.printGameBoard();

        promptUserToPlay();
        promptUserToPlay();
    }

    private void promptUserToPlay() {
        String player;
        if (playerXIsPlaying) player = "X";
        else player = "O";


        printStream.println("Player " + player + ", where would you like to make your move?");
        try {
            int selectedSquare = Integer.parseInt(bufferedReader.readLine());
            board.placeMarkInSquare(player, selectedSquare);
            playerXIsPlaying = !playerXIsPlaying;
        } catch (IOException e) {
            printStream.println(e.getMessage());
        }
    }

}
