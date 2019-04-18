package com.pautorrents.designpatterns.patterns.command;

import com.pautorrents.designpatterns.helpers.ICallback;
import com.pautorrents.designpatterns.patterns.IPatternManager;
import com.pautorrents.designpatterns.patterns.command.commands.LightsOffCommand;
import com.pautorrents.designpatterns.patterns.command.commands.LightsOnCommand;
import com.pautorrents.designpatterns.patterns.command.commands.MoveBackwardCommand;
import com.pautorrents.designpatterns.patterns.command.commands.MoveForwardCommand;
import com.pautorrents.designpatterns.patterns.command.entities.Controller;
import com.pautorrents.designpatterns.patterns.command.entities.Robot;

public class CommandPatternManager implements IPatternManager {

    @Override
    public void execute() {

        Robot robot = new Robot();

        LightsOnCommand lightsOnCommand = new LightsOnCommand(robot);
        LightsOffCommand lightsOffCommand = new LightsOffCommand(robot);
        MoveForwardCommand moveForwardCommand = new MoveForwardCommand(robot);
        MoveBackwardCommand moveBackwardCommand = new MoveBackwardCommand(robot);

        Controller controller = new Controller(lightsOnCommand, lightsOffCommand, moveForwardCommand, moveBackwardCommand);

        // Turn on lights
        this.executeAction(robot, controller::pressFirstButton);

        // Move forward 3 times
        this.executeAction(robot, controller::pressThirdButton);
        this.executeAction(robot, controller::pressThirdButton);
        this.executeAction(robot, controller::pressThirdButton);

        // Move backward 1 time
        this.executeAction(robot, controller::pressFourthButton);

        // Turn off lights
        this.executeAction(robot, controller::pressSecondButton);


        // Undo turn off lights
        this.executeAction(robot, controller::pressUndoButton);

        // Undo move backward 1 time
        this.executeAction(robot, controller::pressUndoButton);


        // Move forward 1 time
        this.executeAction(robot, controller::pressThirdButton);

        // Turn off lights
        this.executeAction(robot, controller::pressSecondButton);
    }

    private void executeAction(Robot robot, ICallback action) {
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            // ignore
        }
        action.invoke();
        robot.render();
    }
}
