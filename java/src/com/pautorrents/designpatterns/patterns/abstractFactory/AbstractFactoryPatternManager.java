package com.pautorrents.designpatterns.patterns.abstractFactory;

import com.pautorrents.designpatterns.helpers.OutputWriter;
import com.pautorrents.designpatterns.patterns.IPatternManager;
import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.buttons.Button;
import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.text.Text;
import com.pautorrents.designpatterns.patterns.abstractFactory.factory.AndroidComponentFactory;
import com.pautorrents.designpatterns.patterns.abstractFactory.factory.IComponentFactory;
import com.pautorrents.designpatterns.patterns.abstractFactory.factory.IosComponentFactory;

public class AbstractFactoryPatternManager implements IPatternManager {

    private OutputWriter outputWriter = new OutputWriter();

    @Override
    public void execute() {
        IComponentFactory iComponentFactory;

        outputWriter.printLn("Getting Android components...");

        iComponentFactory = new AndroidComponentFactory();

        Button androidButton = iComponentFactory.getButton("Hello Android!");
        androidButton.display();

        Text androidText = iComponentFactory.getText("So, as we are all from AndroidComponentFactory, whenever" +
                "someone wants to use the IComponent Factory will receive Android Components :)");
        androidText.display();


        outputWriter.printLn("\n");

        outputWriter.printLn("Getting iOS components...");

        iComponentFactory = new IosComponentFactory();

        Button iosButton = iComponentFactory.getButton("Hello iOS!");
        iosButton.display();

        Text iosText = iComponentFactory.getText("So, as we are all from IosComponentFactory, whenever" +
                "someone wants to use the IComponent Factory will receive Ios Components now :)");
        iosText.display();
    }
}
