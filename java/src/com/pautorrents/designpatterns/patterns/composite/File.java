package com.pautorrents.designpatterns.patterns.composite;

public class File implements IComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls(int depth) {
        this.printPadding(depth);
        System.out.println(this.name);
    }

    private void printPadding(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
    }
}
