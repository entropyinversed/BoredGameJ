package org.example;

import java.util.Arrays;

public class TicTacToeBoard implements Board {
    private static final byte BOARD_LENGTH = 3;
    private static final char EMPTY = '_';

    private final char[][] cells = new char[BOARD_LENGTH][BOARD_LENGTH];

    public char[][] getCells() {
        return cells;
    }

    public void setup() {
        for (int row = 0; row < BOARD_LENGTH; row++) {
            Arrays.fill(cells[row], EMPTY);
        }
    }

    public void display() {
        System.out.println();
        System.out.println("=======");
        System.out.println();
    }
}
