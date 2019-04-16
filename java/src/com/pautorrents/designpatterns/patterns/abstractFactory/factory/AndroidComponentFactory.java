package com.pautorrents.designpatterns.patterns.abstractFactory.factory;

import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.buttons.AndroidButton;
import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.buttons.Button;
import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.text.AndroidText;
import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.text.Text;

public class AndroidComponentFactory implements IComponentFactory {

    @Override
    public Button getButton(String text) {
        AndroidButton result = new AndroidButton(text);
        return result;
    }

    @Override
    public Text getText(String text) {
        AndroidText result = new AndroidText(text);
        return result;
    }
}
