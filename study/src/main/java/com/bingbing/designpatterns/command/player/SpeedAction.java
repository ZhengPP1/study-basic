package com.bingbing.designpatterns.command.player;

/**
 * @author bingbing
 */
public class SpeedAction implements IAction {

    private GPlayer gPlayer;

    public SpeedAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.speed();
    }
}
