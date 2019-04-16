package com.pautorrents.designpatterns.patterns.decorator.decorators;

import com.pautorrents.designpatterns.patterns.decorator.StringStreamReader;

public abstract class StringStreamReaderDecorator extends StringStreamReader {

    private StringStreamReader innerStreamReader;

    public StringStreamReaderDecorator(StringStreamReader innerStreamReader) {
        this.innerStreamReader = innerStreamReader;
    }

    protected StringStreamReader getInnerStreamReader() {
        return this.innerStreamReader;
    }
}
