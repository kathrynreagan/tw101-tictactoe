package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Board {
    private PrintStream printStream;
    private String[] squares;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
        squares = new String[10];
        for(int i = 0; i < 10; i++){
            squares[i] = Integer.toString(i);
        }
    }

    public void printGameBoard() {
        StringBuilder boardRepresentation = new StringBuilder("");

        int row = 1;
        while(row <= 3){
            int leftSquare = 3*row - 2;
            int i = leftSquare;
            while(i < leftSquare+2){
                boardRepresentation.append(squares[i]);
                i++;
                boardRepresentation.append("|");
            }
            boardRepresentation.append(squares[i]);
            if(row==3) break;
            boardRepresentation.append("\n");
            row++;
            boardRepresentation.append("-----\n");
        }
        printStream.println(boardRepresentation.toString());
    }

    public void placeMarkInSquare(String player, int spaceToMark) {
        squares[spaceToMark] = player;
        printGameBoard();
    }
}
