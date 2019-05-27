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

                for (SudokuElement x : SudokuBoard.elementsOfSudoku) {
                    if (x.getX() + 1 == coordinates.get(1) && x.getY() + 1 == coordinates.get(0)) {
                        x.setValue(coordinates.get(2));
                    }
                }
                coordinates.clear();
                System.out.println(sudokuBoard.toString());
            } else if (numberForSudoku.equals("SUDOKU")){
                sudokuGame.sudokuProcessor(SudokuGame.ROW);
                sudokuGame.sudokuProcessor(SudokuGame.COLUMN);
            }
            gameFinished = sudokuGame.resolveSudoku();
        }
    }
}
