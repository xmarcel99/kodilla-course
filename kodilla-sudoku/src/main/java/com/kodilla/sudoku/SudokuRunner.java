package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuRunner {
    public static void main(String[] args) throws NotEnoughOptionsException {
        Scanner userInput = new Scanner(System.in);
        boolean gameFinished = false;
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.createContent();
        System.out.println(sudokuBoard.toString());
        while (!gameFinished) {
            SudokuGame sudokuGame = new SudokuGame();
            String numberForSudoku = userInput.nextLine();
            if (!numberForSudoku.equals("SUDOKU")) {
                FillingSudokuGap.fillingGap(numberForSudoku, sudokuBoard);
            } else {
                for (int i = 0; i < 10; i++) {
                    sudokuGame.sudokuProcessor(SudokuGame.ROW, i, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.COLUMN, i, SudokuBoard.readyBoard);
                }
                System.out.println(sudokuBoard.toString());
            }
            gameFinished = sudokuGame.isSudokuResolved();
        }
    }
}
