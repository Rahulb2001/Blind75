package Flyweight;

public class TextEditorClient {

    public static void main(String[] args) {

        CharacterFlyweightFactory factory = new CharacterFlyweightFactory();

        String document = "HELLOWORLD";
        for (char c : document.toCharArray()) {
            CharacterFlyweight characterFlyweight = factory.getchracter(c, "Arial", 12, "Black");
            int positionX = (int) (Math.random() * 100);
            int positionY = (int) (Math.random() * 100);
            Render render = new Render(characterFlyweight, positionX, positionY);
            render.draw();
        }
    }

    public static class Render {

        private CharacterFlyweight characterGlyph;
        private int positionX;
        private int positionY;

        public Render(CharacterFlyweight characterGlyph, int positionX, int positionY) {
            this.characterGlyph = characterGlyph;
            this.positionX = positionX;
            this.positionY = positionY;
        }

        public void draw() {
            characterGlyph.draw(positionX, positionY);
        }


    }


}
