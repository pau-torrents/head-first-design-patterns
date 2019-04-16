package com.pautorrents.designpatterns.helpers;

public class OutputWriter {

    public void print(String s) {
        System.out.print(s);
    }

    public void printLn(String s) {
        System.out.println(s);
    }

    public void printSlow(String s, int millisecondInterval) {
        try {
            for(char c : s.toCharArray()) {
                System.out.print(c);
                Thread.sleep(millisecondInterval);
            }
        } catch (InterruptedException ex) {
            // Ignore
        }
    }

    public void printSlowLn(String s, int millisecondInterval) {
        try {
            this.printSlow(s, millisecondInterval);
            System.out.println();
            Thread.sleep(millisecondInterval);
        } catch (InterruptedException ex) {
            // Ignore
        }
    }
}
