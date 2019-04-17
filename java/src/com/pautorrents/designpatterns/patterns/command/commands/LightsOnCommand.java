package com.pautorrents.designpatterns.patterns.command.commands;

import com.pautorrents.designpatterns.patterns.command.entities.Robot;

public class LightsOnCommand implements ICommand {

    private Robot robot;

    public LightsOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.turnLightsOn();
    }

    @Override
    public void unexecute() {
        this.robot.turnLightsOff();
    }
}
