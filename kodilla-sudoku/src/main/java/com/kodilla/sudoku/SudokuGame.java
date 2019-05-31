package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuGame {
    public static String ROW = "ROW";
    public static String COLUMN = "COLUMN";
    public static List<Integer> coordinatesFromRunner = new ArrayList<>();

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
        if (squareNumber != 0) {
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
        int counterOfEmptyCells = 0;
        int counterOfTheSameNumber = 0;
        int loopNumber = 0;
        for (int i = loopOperatingVariableA; i < conditionLoopVariableA; i++) {
            for (int j = loopOperatingVariableB; j < conditionLoopVariableB; j++) {
                if (rowOrColumn.equals(ROW)) {
                    xTable = i;
                    yTable = j;
                } else if (rowOrColumn.equals(COLUMN)) {
                    xTable = j;
                    yTable = i;
                }
                if (table[xTable][yTable].getValue() == SudokuElement.EMPTY) {
                    for (Integer number : SudokuBoard.readyBoard[xTable][yTable].getPossibleValues()) {
                        loopNumber = number;
                        for (SudokuElement x : SudokuBoard.boardRow.get(xTable).getRow()) {
                            if (x.hashCode() != table[xTable][yTable].hashCode()) {
                                counterOfEmptyCells++;
                                if (table[xTable][yTable].getPossibleValues().size() == 1) {
                                    table[xTable][yTable].setValue(table[xTable][yTable].getPossibleValues().get(0));
                                }
                                if(!x.getPossibleValues().contains(number)) {
                                    counterOfTheSameNumber ++;
                                }
                                if (SudokuBoard.boardRow.get(xTable).getRow().contains(number) && table[xTable][yTable].getPossibleValues().size() == 1) {
                                    throw new NotEnoughOptionsException();
                                }
                            }
                        }

                    }
                }
            }
            if(counterOfEmptyCells == counterOfTheSameNumber) {
                table[xTable][yTable].setValue(loopNumber);
            }
        }
    }

    public static void delateNotAllowedNumbersFromCellsAfterMove(SudokuElement sudokuElement) {
        int squareNumber = 50;
        int conditionLoopVariableA = 9;
        int conditionLoopVariableB = 9;
        int loopOperatingVariableA = 0;
        int loopOperatingVariableB = 0;

        int x =sudokuElement.getY()-1;
        int y = sudokuElement.getX()-1;
        if (x >= 0 && x < 3 && y >= 0 && y < 3) {
            squareNumber = 1;
        } else if (x >= 3 && x < 6 && y >= 0 && y < 3) {
            squareNumber = 2;
        } else if (x >= 6 && x < 8 && y >= 0 && y < 3) {
            squareNumber = 3;
        } else if (x >= 0 && x < 3 && y >= 3 && y < 6) {
            squareNumber = 4;
        } else if (x >= 3 && x < 6 && y >= 3 && y < 6) {
            squareNumber = 5;
        } else if (x >= 6 && x < 8 && y >= 3 && y < 6) {
            squareNumber = 6;
        } else if (x >= 0 && x < 3 && y >= 6 && y < 9) {
            squareNumber = 7;
        } else if (x >= 3 && x < 6 && y >= 6 && y < 9) {
            squareNumber = 8;
        } else if (x >= 6 && x < 8 && y >= 6 && y < 9) {
            squareNumber = 9;
        }

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
        for (int i = loopOperatingVariableA; i < conditionLoopVariableA; i++) {
            for (int j = loopOperatingVariableB; j < conditionLoopVariableB; j++) {
                SudokuBoard.readyBoard[i][j].getPossibleValues().remove(coordinatesFromRunner.get(2));
            }
        }
    }

}

