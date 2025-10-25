package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFlyweightFactory {

    private final Map<String, CharacterFlyweight> flyweightMap=new HashMap<>();

    public CharacterFlyweight getchracter(char symbol, String font, int size,String color){

        String key=symbol+font+size+color;
        flyweightMap.putIfAbsent(key,new CharacterGlyph(symbol,font,size,color));

        return flyweightMap.get(key);
    }



}
