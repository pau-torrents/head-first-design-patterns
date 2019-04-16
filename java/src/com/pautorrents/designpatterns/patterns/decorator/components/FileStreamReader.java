package com.pautorrents.designpatterns.patterns.decorator.components;

import com.pautorrents.designpatterns.patterns.decorator.StringStreamReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileStreamReader extends StringStreamReader {

    @Override
    public String read() throws Exception {
        String fileName = "encoded-input.txt";

        String line;

        StringBuilder result = new StringBuilder();

        File file = new File(getClass().getResource(fileName).getFile());
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int i = 0;
        while((line = bufferedReader.readLine()) != null) {
            if (i != 0)
                result.append("\n");
            result.append(line);

            i++;
        }

        bufferedReader.close();

        return result.toString();
    }
}
