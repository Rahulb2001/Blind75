package org.example.AbstarctFactoryDesign;

public interface UIFactory {

    Button createButton();
    Checkbox createCheckbox();
    Radio createRadio();
}
