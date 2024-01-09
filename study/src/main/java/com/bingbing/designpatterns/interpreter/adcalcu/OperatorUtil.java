package com.bingbing.designpatterns.interpreter.adcalcu;

import com.bingbing.designpatterns.interpreter.calculate.AddInterpreter;
import com.bingbing.designpatterns.interpreter.calculate.DivInterpreter;
import com.bingbing.designpatterns.interpreter.calculate.IArithmeticInterpreter;
import com.bingbing.designpatterns.interpreter.calculate.Interpreter;
import com.bingbing.designpatterns.interpreter.calculate.MultiInterpreter;
import com.bingbing.designpatterns.interpreter.calculate.SubInterpreter;

import java.util.Stack;

/**
 * @author bingbing
 */
public class OperatorUtil {

    public static Interpreter getInterpreter(Stack<IArithmeticInterpreter> numStack, Stack<String> operatorStack) {
        IArithmeticInterpreter right = numStack.pop();
        IArithmeticInterpreter left = numStack.pop();
        String symbol = operatorStack.pop();
        System.out.println("数字出栈：" + right.interpret() + "," + left.interpret() + ",操作符出栈:" + symbol);
        if (symbol.equals("+")) {
            return new AddInterpreter(left, right);
        } else if (symbol.equals("-")) {
            return new SubInterpreter(left, right);
        } else if (symbol.equals("*")) {
            return new MultiInterpreter(left, right);
        } else if (symbol.equals("/")) {
            return new DivInterpreter(left, right);
        }
        return null;

    }

}
