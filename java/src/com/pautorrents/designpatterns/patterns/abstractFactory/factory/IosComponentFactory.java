package com.pautorrents.designpatterns.patterns.abstractFactory.factory;

import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.buttons.Button;
import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.buttons.IosButton;
import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.text.IosText;
import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.text.Text;

public class IosComponentFactory implements IComponentFactory {

    @Override
    public Button getButton(String text) {
        IosButton result = new IosButton(text);
        return result;
    }

    @Override
    public Text getText(String text) {
        IosText result = new IosText(text);
        return result;
    }
}
