package com.kodilla.sudoku;

public class SudokuGame {
    public static String ROW = "ROW";
    public static String COLUMN = "COLUMN";
    public static String SECTION = "SECTION";

    public boolean resolveSudoku() {
        return true;
    }

    public void sudokuProcessor(String rowOrColumn) throws NotEnoughOptionsException {
        int variableA = 0;
        int varaibleB = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (rowOrColumn.equals(ROW)) {
                    variableA = i;
                    varaibleB = j;
                } else if (rowOrColumn.equals(COLUMN)) {
                    variableA = j;
                    varaibleB = i;
                }
                if (SudokuBoard.readyBoard[variableA][varaibleB].getValue() == SudokuElement.EMPTY) {
                    for (Integer number : SudokuBoard.readyBoard[variableA][varaibleB].getPossibleValues()) {
                        if (SudokuBoard.boardRow.get(variableA).getRow().contains(number)) {
                            SudokuBoard.readyBoard[variableA][varaibleB].getPossibleValues().remove(number);
                            if (SudokuBoard.readyBoard[variableA][varaibleB].getPossibleValues().size() == 1) {
                                SudokuBoard.readyBoard[variableA][varaibleB].setValue(SudokuBoard.readyBoard[variableA][varaibleB].getPossibleValues().get(0));
                            }
                        } else if (!SudokuBoard.boardRow.get(variableA).getRow().contains(number)) {
                            for (SudokuElement element : SudokuBoard.boardRow.get(variableA).getRow()) {
                                if (!element.getPossibleValues().contains(number)) {
                                    SudokuBoard.readyBoard[variableA][varaibleB].setValue(SudokuBoard.readyBoard[variableA][varaibleB].getPossibleValues().get(number));
                                }
                            }
                        } else if (SudokuBoard.boardRow.get(variableA).getRow().contains(number) && SudokuBoard.readyBoard[variableA][varaibleB].getPossibleValues().size() == 1) {
                            throw new NotEnoughOptionsException();
                        }
                    }
                }
            }
        }
    }
}
