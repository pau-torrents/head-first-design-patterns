package com.pautorrents.designpatterns.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IComponent {

    private String name;
    private List<IComponent> components;

    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void add(IComponent component) {
        this.components.add(component);
    }

    @Override
    public void ls(int depth) {
        this.printPadding(depth);
        System.out.println(this.name.toUpperCase());

        for(IComponent component : this.components) {
            component.ls(depth + 1);
        }
    }

    public void ls() { this.ls(0); }

    private void printPadding(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
    }
}
