package com.kodilla.sudoku;

public class SudokuGame {
    public static String ROW = "ROW";
    public static String COLUMN = "COLUMN";
    public static String SQUARE = "SQUARE";

    public boolean resolveSudoku() {
        int counter = 0;
        for (SudokuElement[] x : SudokuBoard.readyBoard) {
            for (SudokuElement y : x) {
                if (y.getValue() == SudokuElement.EMPTY) {
                    counter++;
                }
            }
        }
        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void sudokuProcessor(String rowOrColumn, int squareNumber, SudokuElement[][] table) throws NotEnoughOptionsException {
        int conditionLoopVariableA = 9;
        int conditionLoopVariableB = 9;
        int loopOperatingVariableA = 0;
        int loopOperatingVariableB = 0;
        int xTable = 0;
        int yTable = 0;
        if (rowOrColumn.equals(SQUARE)) {
            if (squareNumber == 1 || squareNumber == 4 || squareNumber == 7) {
                loopOperatingVariableA = 0;
                conditionLoopVariableA = 3;
            } else if (squareNumber == 2 || squareNumber == 5 || squareNumber == 8) {
                loopOperatingVariableA = 3;
                conditionLoopVariableA = 6;
            } else if (squareNumber == 3 || squareNumber == 6 | squareNumber == 9) {
                loopOperatingVariableA = 6;
                conditionLoopVariableA = 9;
            }
            if (squareNumber == 1 || squareNumber == 2 || squareNumber == 3) {
                loopOperatingVariableB = 0;
                conditionLoopVariableB = 3;
            } else if (squareNumber == 4 || squareNumber == 5 || squareNumber == 6) {
                loopOperatingVariableB = 3;
                conditionLoopVariableB = 6;
            } else if (squareNumber == 7 || squareNumber == 8 || squareNumber == 9) {
                loopOperatingVariableB = 6;
                conditionLoopVariableB = 9;
            }
        }
        for (int i = loopOperatingVariableA; i < conditionLoopVariableA; i++) {
            for (int j = loopOperatingVariableB; j < conditionLoopVariableB; j++) {
                if (rowOrColumn.equals(ROW)) {
                    xTable = j;
                    yTable = i;
                } else if (rowOrColumn.equals(COLUMN)) {
                    xTable = i;
                    yTable = j;
                }
            }
            if (table[xTable][yTable].getValue() == SudokuElement.EMPTY) {
                for (Integer number : SudokuBoard.readyBoard[xTable][yTable].getPossibleValues()) {
                    if (SudokuBoard.boardRow.get(xTable).getRow().contains(number)) {
                        table[xTable][yTable].getPossibleValues().remove(number);
                        if (table[xTable][yTable].getPossibleValues().size() == 1) {
                            table[xTable][yTable].setValue(table[xTable][yTable].getPossibleValues().get(0));
                        }
                    } else if (!SudokuBoard.boardRow.get(xTable).getRow().contains(number)) {
                        for (SudokuElement element : SudokuBoard.boardRow.get(xTable).getRow()) {
                            if (!element.getPossibleValues().contains(number)) {
                                table[xTable][yTable].setValue(table[xTable][yTable].getPossibleValues().get(number));
                            }
                        }
                    } else if (SudokuBoard.boardRow.get(xTable).getRow().contains(number) && table[xTable][yTable].getPossibleValues().size() == 1) {
                        throw new NotEnoughOptionsException();
                    }
                }
            }
        }


    }

    public static int countOfEmptyPlaces() {
        int counter = 0;
        for (SudokuElement[] x : SudokuBoard.readyBoard) {
            for (SudokuElement y : x) {
                if (y.getValue() == SudokuElement.EMPTY) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
