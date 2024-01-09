package com.bingbing.designpatterns.interpreter.calculate;

/**
 * 终结表达式
 * @author bingbing
 */
public abstract class Interpreter implements IArithmeticInterpreter{
    protected IArithmeticInterpreter left;

    protected IArithmeticInterpreter right;

    public Interpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        this.left = left;
        this.right = right;
    }
}
