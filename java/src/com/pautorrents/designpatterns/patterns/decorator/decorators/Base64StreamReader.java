package com.pautorrents.designpatterns.patterns.decorator.decorators;

import com.pautorrents.designpatterns.patterns.decorator.StringStreamReader;

import java.util.Base64;

public class Base64StreamReader extends StringStreamReaderDecorator {
    public Base64StreamReader(StringStreamReader innerStreamReader) {
        super(innerStreamReader);
    }

    @Override
    public String read() throws Exception {
        StringStreamReader innerStreamReader = this.getInnerStreamReader();
        String innerResult = innerStreamReader.read();
        String result = new String(Base64.getDecoder().decode(innerResult));
        return result;
    }
}
