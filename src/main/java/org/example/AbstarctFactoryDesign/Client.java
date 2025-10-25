package org.example.AbstarctFactoryDesign;

public class Client {

    public static void main(String[] args) {

        UIFactory uiFactory = new DarkthemeFactory();
        Button button = uiFactory.createButton();
        button.render();

        Radio radio = uiFactory.createRadio();
        radio.render();

        Checkbox checkbox = uiFactory.createCheckbox();
        checkbox.render();

    }
}
