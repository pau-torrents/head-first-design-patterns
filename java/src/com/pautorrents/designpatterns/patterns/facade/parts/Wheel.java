package com.pautorrents.designpatterns.patterns.facade.parts;

import com.pautorrents.designpatterns.patterns.facade.enums.WheelDirection;

public class Wheel {

    private WheelDirection direction = WheelDirection.Center;

    public WheelDirection getDirection() {
        return direction;
    }

    public void setDirection(WheelDirection direction) {
        this.direction = direction;
    }
}
