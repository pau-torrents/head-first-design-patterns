package com.pautorrents.designpatterns;

import com.pautorrents.designpatterns.manager.ProgramManager;

public class Main {
    public static void main(String[] args) {
        ProgramManager manager = new ProgramManager();
        manager.execute();
    }
}
