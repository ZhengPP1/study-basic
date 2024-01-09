package com.bingbing.designpatterns.interpreter.calculate;

import java.util.Stack;

/**
 * @author bingbing
 */
public class GPCalculator {
    private Stack<IArithmeticInterpreter> stack = new Stack<IArithmeticInterpreter>();

    public GPCalculator(String expression) {
        this.parse(expression);
    }

    private void parse(String expression) {
        String[] elements = expression.split(" ");
        IArithmeticInterpreter left, right;
        for (int i = 0; i < elements.length; i++) {
            String element = elements[i];
            if (OperatorUtil.isOperator(element)) {
                left = this.stack.pop();
                right = new NumInterpreter(Integer.valueOf(elements[++i]));
                System.out.println("出栈" + left.interpret() + "和" + right.interpret());
                this.stack.push(OperatorUtil.getInterpreter(left, right, element));
                System.out.println("运算符" + element);

            } else {
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(element));
                this.stack.push(numInterpreter);
                System.out.println("入栈：" + numInterpreter.interpret());
            }
        }

    }

    public int calculate() {
        return this.stack.pop().interpret();
    }
}
