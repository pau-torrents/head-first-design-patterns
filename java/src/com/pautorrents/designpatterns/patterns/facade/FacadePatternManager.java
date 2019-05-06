package com.pautorrents.designpatterns.patterns.facade;

import com.pautorrents.designpatterns.helpers.OutputWriter;
import com.pautorrents.designpatterns.patterns.IPatternManager;
import com.pautorrents.designpatterns.helpers.ICallback;

public class FacadePatternManager implements IPatternManager {

    OutputWriter outputWriter = new OutputWriter();

    @Override
    public void execute() {
        this.outputWriter.printSlowLn("Executing facade pattern in a car...", 20);

        CarFacade carFacade = new CarFacade();
        carFacade.displayState();

        this.executeAction(carFacade, carFacade::accelerate);
        this.executeAction(carFacade, carFacade::accelerate);
        this.executeAction(carFacade, carFacade::accelerate);
        this.executeAction(carFacade, carFacade::accelerate);

        this.executeAction(carFacade, carFacade::turnLeft);
        this.executeAction(carFacade, carFacade::resetDirection);
        this.executeAction(carFacade, carFacade::accelerate);

        this.executeAction(carFacade, carFacade::brake);
        this.executeAction(carFacade, carFacade::turnRight);
        this.executeAction(carFacade, carFacade::resetDirection);
        this.executeAction(carFacade, carFacade::accelerate);

        this.executeAction(carFacade, carFacade::accelerate);
        this.executeAction(carFacade, carFacade::brake);
        this.executeAction(carFacade, carFacade::brake);
    }

    private void executeAction(CarFacade carFacade, ICallback action) {
        action.invoke();
        carFacade.displayState();
    }
}
