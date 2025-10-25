package Flyweight;

public class CharacterGlyph implements CharacterFlyweight{

    private final char symbol;
    private final String fontFamily;
    private final int fontSize;
    private final String color;

    public CharacterGlyph(char symbol, String fontFamily, int fontSize, String color) {
        this.symbol = symbol;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing character '" + symbol
                + "' at (" + x + ", " + y + ") with font: " + fontFamily
                + ", size: " + fontSize + ", color: " + color);

    }
}
