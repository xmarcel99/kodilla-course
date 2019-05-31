package com.kodilla.sudoku;

public class SquareDTo {
    private int conditionLoopVariableA = 9;
    private int conditionLoopVariableB = 9;
    private int loopOperatingVariableA = 0;
    private int loopOperatingVariableB = 0;

    public SquareDTo(int conditionLoopVariableA, int conditionLoopVariableB, int loopOperatingVariableA, int loopOperatingVariableB) {
        this.conditionLoopVariableA = conditionLoopVariableA;
        this.conditionLoopVariableB = conditionLoopVariableB;
        this.loopOperatingVariableA = loopOperatingVariableA;
        this.loopOperatingVariableB = loopOperatingVariableB;
    }

    public int getConditionLoopVariableA() {
        return conditionLoopVariableA;
    }

    public int getConditionLoopVariableB() {
        return conditionLoopVariableB;
    }

    public int getLoopOperatingVariableA() {
        return loopOperatingVariableA;
    }

    public int getLoopOperatingVariableB() {
        return loopOperatingVariableB;
    }
}
