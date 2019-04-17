package com.pautorrents.designpatterns.patterns.command.commands;

import com.pautorrents.designpatterns.patterns.command.entities.Robot;

public class LightsOffCommand implements ICommand {

    private Robot robot;

    public LightsOffCommand(Robot light) {
        this.robot = light;
    }

    @Override
    public void execute() {
        this.robot.turnLightsOff();
    }

    @Override
    public void unexecute() {
        this.robot.turnLightsOn();
    }
}
