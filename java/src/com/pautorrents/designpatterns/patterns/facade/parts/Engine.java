package com.pautorrents.designpatterns.patterns.facade.parts;

public class Engine {

    private double speed = 0.0;

    public double getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (this.speed < 110) {
            this.speed += 10;
        } else {
            this.speed = 120;
        }
    }

    public void brake() {
        if (this.speed > 15) {
            this.speed -= 20;
        } else {
            this.speed = 0;
        }
    }
}
