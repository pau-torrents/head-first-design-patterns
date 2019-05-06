package com.pautorrents.designpatterns.patterns.abstractFactory.factory;

import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.text.Text;
import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.buttons.Button;

public interface IComponentFactory {
    Button getButton(String text);
    Text getText(String text);
}
