package com.bingbing.designpatterns.interpreter.calculate;

/**
 * @author bingbing
 */
public class NumInterpreter implements IArithmeticInterpreter {
    private int value;

    public NumInterpreter(int value) {
        this.value = value;
    }


    @Override
    public int interpret() {
        return this.value;
    }
}
