package com.pautorrents.designpatterns.patterns.command.commands;

import com.pautorrents.designpatterns.patterns.command.entities.Robot;
import com.pautorrents.designpatterns.patterns.command.enums.MovementDirection;

public class MoveBackwardCommand implements ICommand {

    private Robot robot;

    public MoveBackwardCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.move(MovementDirection.Backward);
    }

    @Override
    public void unexecute() {
        this.robot.move(MovementDirection.Forward);
    }
}
