package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.PrintStream;

public class Game {
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;
    private boolean playerXIsPlaying;
    private boolean[] taken;
    private Player playerX;
    private Player playerO;

    public Game(PrintStream printStream, BufferedReader bufferedReader, Board board, Player playerX, Player playerO) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.board = board;
        playerXIsPlaying = true;
        taken = new boolean[10];
        this.playerX = playerX;
        this.playerO = playerO;
    }

    public void start() {
        board.printGameBoard();

        printStream.println("Player X, where would you like to make your move?");
        int xMoveLocation = playerX.makeMove();
        board.placeMarkInSquare(playerX.symbol(), xMoveLocation);

        printStream.println("Player O, where would you like to make your move?");
        int oMoveLocation = playerO.makeMove();
        board.placeMarkInSquare(playerO.symbol(), oMoveLocation);

    }



}
