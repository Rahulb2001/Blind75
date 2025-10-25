package org.example.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static Map<String, TreeType> treeTypes = new HashMap<>();


    public static TreeType getTreeTyoe(String name,String color,String texture){

        String nameKey = name + color + texture;

        if (!treeTypes.containsKey(nameKey)) {
            TreeType treeType = new TreeType(name, color, texture);
            treeTypes.put(nameKey, treeType);
        }
        return treeTypes.get(nameKey);
    }
}
