package com.pautorrents.designpatterns.patterns.facade.parts;

import com.pautorrents.designpatterns.patterns.facade.enums.WheelDirection;

public class DirectionWheels {

    private WheelDirection direction = WheelDirection.Center;

    private Wheel frontLeftWheel = new Wheel();
    private Wheel frontRightWheel = new Wheel();

    public void setDirection(WheelDirection wheelDirection) {
        this.direction = wheelDirection;
    }

    public WheelDirection getDirection() {
        return this.direction;
    }

    public void turnLeft() {
        this.direction = WheelDirection.Left;
        this.frontLeftWheel.setDirection(WheelDirection.Left);
        this.frontRightWheel.setDirection(WheelDirection.Left);
    }

    public void turnRight() {
        this.direction = WheelDirection.Right;
        this.frontLeftWheel.setDirection(WheelDirection.Right);
        this.frontRightWheel.setDirection(WheelDirection.Right);
    }

    public void resetDirection() {
        this.direction = WheelDirection.Center;
        this.frontLeftWheel.setDirection(WheelDirection.Center);
        this.frontRightWheel.setDirection(WheelDirection.Center);
    }
}
