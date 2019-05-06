package com.pautorrents.designpatterns.patterns.facade;

import com.pautorrents.designpatterns.helpers.OutputWriter;
import com.pautorrents.designpatterns.patterns.facade.parts.Engine;
import com.pautorrents.designpatterns.patterns.facade.enums.WheelDirection;
import com.pautorrents.designpatterns.patterns.facade.parts.DirectionWheels;

public class CarFacade {

    private OutputWriter outputWriter = new OutputWriter();

    private Engine engine = new Engine();

    private DirectionWheels directionWheels = new DirectionWheels();

    public void accelerate() {
        this.engine.accelerate();
    }

    public void brake() {
        this.engine.brake();
    }

    public void turnLeft() {
        this.directionWheels.setDirection(WheelDirection.Left);
    }

    public void turnRight() {
        this.directionWheels.setDirection(WheelDirection.Right);
    }

    public void resetDirection() {
        this.directionWheels.setDirection(WheelDirection.Center);
    }

    public void displayState() {
        outputWriter.printSlowLn("", 1000);
        outputWriter.printLn("CAR STATE");
        outputWriter.printLn("Speed: " + this.engine.getSpeed() + " Km/h");
        outputWriter.printLn("Direction: " + this.directionWheels.getDirection());
        outputWriter.printSlowLn("", 1000);
    }
}
