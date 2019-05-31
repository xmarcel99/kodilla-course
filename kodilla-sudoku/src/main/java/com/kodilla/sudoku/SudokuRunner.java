package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuRunner {
    public static void main(String[] args) throws  NotEnoughOptionsException{
        Scanner userInput = new Scanner(System.in);
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
                    SudokuGame.coordinatesFromRunner.add(number);
                }
                for (SudokuElement[] y : SudokuBoard.readyBoard) {
                    for(SudokuElement x : y) {

                        if (x.getX() + 1 == SudokuGame.coordinatesFromRunner.get(1) && x.getY() + 1 == SudokuGame.coordinatesFromRunner.get(0)) {
                            x.setValue(SudokuGame.coordinatesFromRunner.get(2));
                            x.getPossibleValues().clear();
                            for(SudokuElement g : y) {
                                g.getPossibleValues().remove(SudokuGame.coordinatesFromRunner.get(2));
                            }
                            for(int i = 0; i < 9; i ++) {
                                SudokuBoard.readyBoard[i][x.getX() ].getPossibleValues().remove(SudokuGame.coordinatesFromRunner.get(2));
                            }
                        }
                    }
                }
                SudokuGame.delateNotAllowedNumbersFromCellsAfterMove(SudokuBoard.readyBoard[SudokuGame.coordinatesFromRunner.get(0)][SudokuGame.coordinatesFromRunner.get(1)]);
                SudokuGame.coordinatesFromRunner.clear();
                System.out.println(sudokuBoard.toString());
            } else {
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
            //System.out.println(sudokuBoard.toString());
            gameFinished = sudokuGame.resolveSudoku();

        }
    }
}
