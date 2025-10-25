package Decorator;

abstract class TextDecorator implements Textview {

    final Textview textview;

    public TextDecorator(Textview textview) {
        this.textview = textview;
    }
}
