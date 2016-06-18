package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.PrintStream;

public class Game {
    private PrintStream printStream;
    private Board board;
    private Player playerX;
    private Player playerO;

    public Game(PrintStream printStream, Board board, Player playerX, Player playerO) {
        this.printStream = printStream;
        this.board = board;

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
