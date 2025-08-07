package org.example.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeats {

    public static void main(String[] args) {
        Set<Character> seen=new HashSet<>();

        String s = "abcabcbb";
        int i=0;
        int maxLength = 0;

        for(int j=0;j<s.length();j++){
            char currentChar = s.charAt(j);

            while(seen.contains(currentChar)){
                seen.remove(currentChar);
                i++;
            }
            seen.add(currentChar);
            maxLength=Math.max(maxLength, j - i + 1);
            System.out.println(maxLength);



        }
    }
}
