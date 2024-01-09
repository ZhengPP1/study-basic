package com.bingbing.designpatterns.memento.editor;

import java.util.Stack;

/**
 * 备忘录管理角色
 * @author bingbing
 */
public class DraftsBox {
    private final Stack<ArticleMemento> stack=new Stack<>();
    public ArticleMemento getMemento(){
        ArticleMemento articleMemento=stack.pop();
        return articleMemento;
    }
    public void addMemento(ArticleMemento articleMemento){
        stack.push(articleMemento);
    }
}
