package com.bingbing.designpatterns.command.player;

import java.util.ArrayList;
import java.util.List;

/**
 * invoker
 * @author bingbing
 */
public class Controller {

    private List<IAction> actions=new ArrayList<>();

    public void addAction(IAction action){
        actions.add(action);
    }

    public void execute(IAction action){
        action.execute();
    }
    public void executes(){
        for (IAction action : actions) {
            action.execute();
        }
        actions.clear();
    }

    public static void main(String[] args) {
        Controller controller=new Controller();
        controller.execute(new PlayAction(new GPlayer()));

        controller.addAction(new PauseAction(new GPlayer()));
        controller.addAction(new SpeedAction(new GPlayer()));

        controller.executes();
    }
}
