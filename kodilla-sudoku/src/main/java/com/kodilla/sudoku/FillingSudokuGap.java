package com.kodilla.sudoku;

public class FillingSudokuGap {
    private static  void deletePossiblesValuesFromColumn(SudokuElement x) {
        for (int i = 0; i < 9; i++) {
            SudokuBoard.readyBoard[i][x.getX()].getPossibleValues().remove(SudokuGame.coordinatesFromRunner.get(2));
        }
    }
    private static void deletePossiblesValuesFromRow(SudokuElement[] y) {
        for (SudokuElement g : y) {
            g.getPossibleValues().remove(SudokuGame.coordinatesFromRunner.get(2));
        }
    }
    public static void fillingGap(String numberForSudoku, SudokuBoard sudokuBoard) {
        String[] sudokuNumberAndCoordinates = numberForSudoku.split(",");

        for (String x : sudokuNumberAndCoordinates) {
            Integer number = Integer.parseInt(x);
            SudokuGame.coordinatesFromRunner.add(number);
        }
        for (SudokuElement[] y : SudokuBoard.readyBoard) {
            for (SudokuElement x : y) {

                if (x.getX() + 1 == SudokuGame.coordinatesFromRunner.get(1) && x.getY() + 1 == SudokuGame.coordinatesFromRunner.get(0)) {
                    x.setValue(SudokuGame.coordinatesFromRunner.get(2));
                    x.getPossibleValues().clear();
                    deletePossiblesValuesFromRow(y);
                    deletePossiblesValuesFromColumn(x);
                }
            }
        }
        SudokuGame.delateNotAllowedNumbersFromCellsAfterMove(SudokuBoard.readyBoard[SudokuGame.coordinatesFromRunner.get(0) - 1][SudokuGame.coordinatesFromRunner.get(1) - 1]);
        SudokuGame.coordinatesFromRunner.clear();
        //System.out.println(sudokuBoard.toString());
    }

}
