package com.pautorrents.designpatterns.patterns.factoryMethod.factory;

import com.pautorrents.designpatterns.patterns.factoryMethod.entities.PersonType;
import com.pautorrents.designpatterns.patterns.factoryMethod.entities.Person;

public interface IPersonFactory {
    Person getPerson(PersonType personType, String name);
}
