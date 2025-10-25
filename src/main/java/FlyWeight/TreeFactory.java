package FlyWeight;

import java.util.HashMap;

public class TreeFactory {

    public static HashMap<String,TreeType> trees = new HashMap<>();

    public static TreeType create_tree(String color, String name, int length){

        TreeType treeType = null;
        if(trees.containsKey(color)){
            treeType = trees.get(color);
        } else {
            treeType = new TreeType(color, name, length);
            trees.put(color, treeType);
        }

        return treeType;

    }
}
