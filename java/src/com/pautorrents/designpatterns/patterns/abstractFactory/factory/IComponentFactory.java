package com.pautorrents.designpatterns.patterns.abstractFactory.factory;

import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.buttons.Button;
import com.pautorrents.designpatterns.patterns.abstractFactory.entitites.text.Text;

public interface IComponentFactory {
    Button getButton(String text);
    Text getText(String text);
}
