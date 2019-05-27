package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuRunner {
    public static void main(String[] args) throws  NotEnoughOptionsException{
        Scanner userInput = new Scanner(System.in);
        List<Integer> coordinates = new ArrayList<>();
        boolean gameFinished = false;
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.createContent();
        System.out.println(sudokuBoard.toString());
        while (!gameFinished) {
            SudokuGame sudokuGame = new SudokuGame();
            String numberForSudoku = userInput.nextLine();
            if (!numberForSudoku.equals("SUDOKU")) {
                String[] sudokuNumberAndCoordinates = numberForSudoku.split(",");

                for (String x : sudokuNumberAndCoordinates) {
                    Integer number = Integer.parseInt(x);
                    coordinates.add(number);
                }

                for (SudokuElement[] y : SudokuBoard.readyBoard) {
                    for(SudokuElement x : y) {
                        if (x.getX() + 1 == coordinates.get(1) && x.getY() + 1 == coordinates.get(0)) {
                            x.setValue(coordinates.get(2));
                        }
                    }
                }
                coordinates.clear();
                System.out.println(sudokuBoard.toString());
            } else if (numberForSudoku.equals("SUDOKU")){
                    sudokuGame.sudokuProcessor(SudokuGame.ROW, 0, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.COLUMN, 0, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.ROW, 1, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.COLUMN, 1, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.ROW, 2, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.COLUMN, 2, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.ROW, 3, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.COLUMN, 3, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.ROW, 4, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.COLUMN, 4, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.ROW, 5, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.COLUMN, 5, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.ROW, 6, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.COLUMN, 6, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.ROW, 7, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.COLUMN, 7, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.ROW, 8, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.COLUMN, 8, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.ROW, 9, SudokuBoard.readyBoard);
                    sudokuGame.sudokuProcessor(SudokuGame.COLUMN, 9, SudokuBoard.readyBoard);
            }
            gameFinished = sudokuGame.resolveSudoku();

        }
    }
}
