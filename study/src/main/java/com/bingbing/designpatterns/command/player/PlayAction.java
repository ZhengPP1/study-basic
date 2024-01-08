package com.bingbing.designpatterns.command.player;

/**
 * @author bingbing
 */
public class PlayAction implements IAction {

    private GPlayer gPlayer;

    public PlayAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.play();
    }
}
