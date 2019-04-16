package com.pautorrents.designpatterns.patterns.factoryMethod;

import com.pautorrents.designpatterns.helpers.Pair;
import com.pautorrents.designpatterns.patterns.IPatternManager;
import com.pautorrents.designpatterns.patterns.factoryMethod.entities.Person;
import com.pautorrents.designpatterns.patterns.factoryMethod.entities.PersonType;
import com.pautorrents.designpatterns.patterns.factoryMethod.factory.IPersonFactory;
import com.pautorrents.designpatterns.patterns.factoryMethod.factory.PersonFactory;

import java.util.Arrays;
import java.util.List;

public class FactoryMethodPatternManager implements IPatternManager {

    private IPersonFactory iPersonFactory = new PersonFactory();

    @Override
    public void execute() {
        List<Pair<PersonType, String>> options = Arrays.asList(
                new Pair<>(PersonType.Urban, "Lory"),
                new Pair<>(PersonType.Urban, "Irene"),
                new Pair<>(PersonType.Urban, "Lewie"),
                new Pair<>(PersonType.Rural, "Filipe")
        );

        for (Pair<PersonType, String> personOptions : options) {
            PersonType personType = personOptions.getFirst();
            String name = personOptions.getSecond();
            Person person = this.iPersonFactory.getPerson(personType, name);
            person.display();
        }
    }
}
