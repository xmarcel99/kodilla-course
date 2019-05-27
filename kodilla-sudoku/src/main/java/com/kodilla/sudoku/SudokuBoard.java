package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    public static  List<SudokuRow> boardRow = new ArrayList<>();
    public static List<SudokuElement> elementsOfSudoku = new ArrayList<>();
    public static  SudokuElement[][] readyBoard = new SudokuElement[9][9];

    public  List<SudokuElement> createContent() {
        for (int i = 0; i < 9; i++) {
            boardRow.add(new SudokuRow());
            for (int j = 0; j < 9; j++) {
                SudokuElement sudokuElement = new SudokuElement(SudokuElement.EMPTY, i, j);
                elementsOfSudoku.add(sudokuElement);
                boardRow.get(i).getRow().add(sudokuElement);
                readyBoard[i][j] = sudokuElement;
            }
        }
        return  elementsOfSudoku;
    }

    @Override
    public String toString() {
        int counter = 0;
        String readyBoard = "|---|---|---|---|---|---|---|---|---|\n";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (elementsOfSudoku.get(counter).getValue() == SudokuElement.EMPTY) {
                    readyBoard += "| " + elementsOfSudoku.get(counter) + " ";
                } else {
                    readyBoard += "| " + elementsOfSudoku.get(counter).getValue() + " ";
                }
                counter++;
            }
            readyBoard += "|\n" + "|---|---|---|---|---|---|---|---|---|\n";
        }
        return readyBoard;
    }
}
