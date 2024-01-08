package com.bingbing.designpatterns.command.player;

/**
 * @author bingbing
 */
public class PauseAction implements IAction {

    private GPlayer gPlayer;

    public PauseAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.pause();
    }
}
