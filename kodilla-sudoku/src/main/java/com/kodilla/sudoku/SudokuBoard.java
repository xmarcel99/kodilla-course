package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    public static  List<SudokuRow> boardRow = new ArrayList<>();
    public static  SudokuElement[][] readyBoard = new SudokuElement[9][9];

    public  SudokuElement[][] createContent() {
        for (int i = 0; i < 9; i++) {
            boardRow.add(new SudokuRow());
            for (int j = 0; j < 9; j++) {
                SudokuElement sudokuElement = new SudokuElement(SudokuElement.EMPTY, i, j);
                boardRow.get(i).getRow().add(sudokuElement);
                readyBoard[i][j] = sudokuElement;
            }
        }
        return  readyBoard;
    }

    @Override
    public String toString() {
        String readyBoardASCII = "|---|---|---|---|---|---|---|---|---|\n";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (readyBoard[i][j].getValue() == SudokuElement.EMPTY) {
                    readyBoardASCII += "| " + readyBoard[i][j] + " ";
                } else {
                    readyBoardASCII += "| " + readyBoard[i][j].getValue() + " ";
                }
            }
            readyBoardASCII += "|\n" + "|---|---|---|---|---|---|---|---|---|\n";
        }
        return readyBoardASCII;
    }
}
