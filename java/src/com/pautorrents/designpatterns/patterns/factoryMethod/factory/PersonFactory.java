package com.pautorrents.designpatterns.patterns.factoryMethod.factory;

import com.pautorrents.designpatterns.patterns.factoryMethod.entities.VillagePerson;
import com.pautorrents.designpatterns.patterns.factoryMethod.entities.CityPerson;
import com.pautorrents.designpatterns.patterns.factoryMethod.entities.Person;
import com.pautorrents.designpatterns.patterns.factoryMethod.entities.PersonType;

public class PersonFactory implements IPersonFactory {
    @Override
    public Person getPerson(PersonType personType, String name) {
        switch(personType) {
            case Urban:
                return new CityPerson(name);
            case Rural:
                return new VillagePerson(name);
            default:
                return null;
        }
    }
}
