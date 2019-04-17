package com.pautorrents.designpatterns.patterns.command.commands;

import com.pautorrents.designpatterns.patterns.command.entities.Robot;
import com.pautorrents.designpatterns.patterns.command.enums.MovementDirection;

public class MoveForwardCommand implements ICommand {

    private Robot robot;

    public MoveForwardCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.move(MovementDirection.Forward);
    }

    @Override
    public void unexecute() {
        this.robot.move(MovementDirection.Backward);
    }
}
