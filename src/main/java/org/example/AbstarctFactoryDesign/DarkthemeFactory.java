package org.example.AbstarctFactoryDesign;

public class DarkthemeFactory implements UIFactory {


    @Override
    public Button createButton() {
        return new DarkthemeButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkThemeCheckbox();
    }

    @Override
    public Radio createRadio() {
        return new DarkThemeRadio();
    }

}
