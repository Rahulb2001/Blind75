package org.example;

public class firstmissing {

    public static void main(String[] args) {

        int[] nums = {3, 1, 4, 6, 2};
        int result = firstMissingPositive(nums);
        System.out.println("The first missing positive integer is: " + result);

    }

    private static int firstMissingPositive(int[] nums) {


        int n = nums.length;

        int[] arr = new int[n + 1];


        for (int i = 0; i < n; i++) {

            if (nums[i] < 0 || nums[i] > n) {
                nums[i]=n+1;
            } else {
                arr[nums[i]] = 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }

        return n + 1;

    }
}
