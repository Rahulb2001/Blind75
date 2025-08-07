package org.example;

import java.util.Arrays;

public class multiple_Queries_from_i_to_last_index {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] queries = {
                {0, 2, 2}, // Query from index 0 to 2
                {3, 5, 4}, // Query from index 3 to 5
                {6, 9, 7}  // Query from index 6 to 9
        };

        int[] results = new int[num.length];
        Arrays.fill(results, 0);


        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            int endIndex = num.length;

            int value = queries[i][2];


            for (int j = start; j <= endIndex-1; j++) {
                results[j] += value;
            }

        }

        System.out.println("Results after processing queries: " + Arrays.toString(results));
    }
}
