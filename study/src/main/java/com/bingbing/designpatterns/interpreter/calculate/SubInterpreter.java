package com.bingbing.designpatterns.interpreter.calculate;

/**
 * @author bingbing
 */
public class SubInterpreter extends Interpreter {


    public SubInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() - this.right.interpret();
    }
}
