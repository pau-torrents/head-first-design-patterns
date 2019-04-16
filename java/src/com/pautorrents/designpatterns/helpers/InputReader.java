package com.pautorrents.designpatterns.helpers;

import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {
    public String getAnswer(String question) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(question);
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        return result;
    }

    public Object getOption(String question, ArrayList<Pair<String, Object>> options) {
        String optionsList = this.getAnswerOptions(options);
        String answer = this.getAnswer(question + " " + optionsList);

        Object result = null;
        for(Pair<String, Object> option : options) {
            if (option.getFirst().equals(answer)) {
                result = option.getSecond();
            }
        }

        return result;
    }

    private String getAnswerOptions(ArrayList<Pair<String, Object>> options) {
        StringBuilder sb = new StringBuilder();

        sb.append("(");

        for(int i = 0; i < options.size(); i++) {
            String option = options.get(i).getFirst();
            if (i > 0) {
                sb.append("|");
            }
            sb.append(option);
        }

        sb.append(")");

        return sb.toString();
    }
}
