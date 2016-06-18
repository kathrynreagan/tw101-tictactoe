package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Board {
    private PrintStream printStream;
    private String[] squares;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
        squares = new String[9];
        for(int i = 0; i < 9; i++){
            squares[i] = Integer.toString(i+1);
        }
    }

    public void printGameBoard() {
        String boardRepresentation = String.format
                        ("%s|%s|%s\n" +
                        "-----\n" +
                        "%s|%s|%s\n" +
                        "-----\n" +
                        "%s|%s|%s", (Object[]) squares);
        printStream.println(boardRepresentation);
    }

    public boolean placeMarkInSquare(String player, int spaceToMark) {
        if(squares[spaceToMark-1] == "X" || squares[spaceToMark-1] == "O"){
            printStream.println("Location already taken");
            return false;
        }
        squares[spaceToMark-1] = player;
        printGameBoard();
        return true;
    }
}
