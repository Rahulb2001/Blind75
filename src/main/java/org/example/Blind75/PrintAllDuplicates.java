package org.example.Blind75;

import java.util.HashSet;

public class PrintAllDuplicates {

    public void printDuplicates(String str){


        HashSet<String> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(set.contains(String.valueOf(str.charAt(i)))){
                System.out.println("Duplicate character: " + str.charAt(i));
            }
            set.add(String.valueOf(str.charAt(i)));

        }
    }

    public static void main(String[] args) {

        PrintAllDuplicates duplicates = new PrintAllDuplicates();
        String str = "programming";
        duplicates.printDuplicates(str);
    }
}
