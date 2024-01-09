package com.bingbing.designpatterns.interpreter.general;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author bingbing
 */
public class Client {
    /**
     * 上下文环境
     */
    static class Context extends HashMap {

    }

    /**
     * 抽象表达式
     */
    interface IExpression {
        // 对表达式进行解释
        Object interpret(Context context);
    }


    static class TerminalExpression implements IExpression {
        private Object value;

        @Override
        public Object interpret(Context context) {
            // 实现文法中与终结符有关的操作
            context.put("", "");
            return null;
        }
    }

    /**
     * 非终结者表达式
     */
    static class NonTerminalExpression implements IExpression {
        private IExpression[] expressions;

        public NonTerminalExpression(IExpression... expressions) {
            // 每个非终结者表达式都会对其他的表达式产生依赖
            this.expressions = expressions;
        }

        @Override
        public Object interpret(Context context) {
            // 实现文法中与终结符有关的操作
            context.put("", "");
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            Context context = new Context();
            // 定义一个语法容器，用于存储一个具体表达式
            Stack<IExpression> stack = new Stack<IExpression>();
//            for (; ; ) {
//                // 进行语法解析，并产生递归调用
//            }
            // 获取得到最终的解析表达式：完整语法树
            IExpression expression = stack.pop();
            // 递归调用获取结果
            expression.interpret(context);

            //    1 + 2
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
