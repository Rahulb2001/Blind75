package org.example.Blind75;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] num, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {

            int targetsum = target - num[i];
            if (map.containsKey(targetsum)) {
                return new int[]{map.get(targetsum), i};

            } else {
                map.put(num[i], i);
            }
            
        }
        return null;

    }

}
