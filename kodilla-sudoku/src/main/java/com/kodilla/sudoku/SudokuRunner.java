package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuRunner {
    public static void main(String[] args) throws NotEnoughOptionsException {
        Scanner userInput = new Scanner(System.in);
        boolean gameFinished = false;
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.createContent();
        FillingSudokuGap.fillingGap("1,2,3", sudokuBoard);
        FillingSudokuGap.fillingGap("1,6,4", sudokuBoard);
        FillingSudokuGap.fillingGap("1,9,7", sudokuBoard);
        FillingSudokuGap.fillingGap("2,1,1", sudokuBoard);
        FillingSudokuGap.fillingGap("2,2,5", sudokuBoard);
        FillingSudokuGap.fillingGap("2,4,8", sudokuBoard);
        FillingSudokuGap.fillingGap("2,7,4", sudokuBoard);
        FillingSudokuGap.fillingGap("3,2,6", sudokuBoard);
        FillingSudokuGap.fillingGap("3,4,3", sudokuBoard);
        FillingSudokuGap.fillingGap("3,6,5", sudokuBoard);
        FillingSudokuGap.fillingGap("3,7,2", sudokuBoard);
        FillingSudokuGap.fillingGap("3,9,9", sudokuBoard);
        FillingSudokuGap.fillingGap("4,1,6", sudokuBoard);
        FillingSudokuGap.fillingGap("4,1,6", sudokuBoard);
        FillingSudokuGap.fillingGap("4,4,2", sudokuBoard);
        FillingSudokuGap.fillingGap("4,7,5", sudokuBoard);
        FillingSudokuGap.fillingGap("4,9,4", sudokuBoard);
        FillingSudokuGap.fillingGap("5,3,5", sudokuBoard);
        FillingSudokuGap.fillingGap("5,4,6", sudokuBoard);
        FillingSudokuGap.fillingGap("5,6,7", sudokuBoard);
        FillingSudokuGap.fillingGap("5,7,3", sudokuBoard);
        FillingSudokuGap.fillingGap("6,1,4", sudokuBoard);
        FillingSudokuGap.fillingGap("6,3,3", sudokuBoard);
        FillingSudokuGap.fillingGap("6,6,8", sudokuBoard);
        FillingSudokuGap.fillingGap("6,9,2", sudokuBoard);
        FillingSudokuGap.fillingGap("7,1,3", sudokuBoard);
        FillingSudokuGap.fillingGap("7,3,6", sudokuBoard);
        FillingSudokuGap.fillingGap("7,4,4", sudokuBoard);
        FillingSudokuGap.fillingGap("7,6,2", sudokuBoard);
        FillingSudokuGap.fillingGap("7,8,7", sudokuBoard);
        FillingSudokuGap.fillingGap("8,3,9", sudokuBoard);
        FillingSudokuGap.fillingGap("8,6,6", sudokuBoard);
        FillingSudokuGap.fillingGap("8,8,2", sudokuBoard);
        FillingSudokuGap.fillingGap("8,9,8", sudokuBoard);
        FillingSudokuGap.fillingGap("9,1,7", sudokuBoard);
        FillingSudokuGap.fillingGap("9,4,9", sudokuBoard);
        FillingSudokuGap.fillingGap("9,8,4", sudokuBoard);
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
