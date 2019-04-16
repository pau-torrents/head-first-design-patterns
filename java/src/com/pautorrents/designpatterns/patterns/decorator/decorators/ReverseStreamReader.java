package com.pautorrents.designpatterns.patterns.decorator.decorators;

import com.pautorrents.designpatterns.patterns.decorator.StringStreamReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStreamReader extends StringStreamReaderDecorator {
    public ReverseStreamReader(StringStreamReader innerStreamReader) {
        super(innerStreamReader);
    }

    @Override
    public String read() throws Exception {
        StringStreamReader innerStreamReader = this.getInnerStreamReader();
        String innerResult = innerStreamReader.read();
        List<Character> characters = this.convertToCharacterList(innerResult);
        Collections.reverse(characters);
        String result = this.convertToString(characters);
        return result;
    }

    private List<Character> convertToCharacterList(String source) {
        ArrayList<Character> result = new ArrayList<>();

        for (char c : source.toCharArray()) {
            result.add(c);
        }

        return result;
    }

    private String convertToString(List<Character> source) {
        StringBuilder result = new StringBuilder();

        for (char c : source) {
            result.append(c);
        }

        return result.toString();
    }
}
