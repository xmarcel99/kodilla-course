package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuElement {

    public static int EMPTY = -1;
    private  int value;
    private int x;
    private int y;
    private List<Integer> possibleValues = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

    public SudokuElement(int value,int x, int y) {
        this.value = value;
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        String sudokuElement;
        if(value == EMPTY) {
            sudokuElement = " ";
            return sudokuElement;
        } else {
            sudokuElement = Integer.toString(value);
            return sudokuElement;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }
}
