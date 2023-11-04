package me.pr3.api.impl.example;


import me.pr3.api.component.Application;

public class Main {
    public static void main(String[] args) {
        Application example = new Application();
        example.setRootPanel(new BasicPanel(
                new InfoPanel(),
                new SettingsPanel())
        );

    }
}