package com.bingbing.designpatterns.command.player;

/**
 * @author bingbing
 */
public class StopAction implements IAction {

    private GPlayer gPlayer;

    public StopAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.stop();
    }
}
