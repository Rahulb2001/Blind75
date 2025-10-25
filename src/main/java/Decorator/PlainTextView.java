package Decorator;

public class PlainTextView implements Textview{


    private String text;

    public PlainTextView(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println(text);

    }


}
