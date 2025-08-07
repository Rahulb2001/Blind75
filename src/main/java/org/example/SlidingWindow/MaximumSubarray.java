package org.example.SlidingWindow;

public class MaximumSubarray {

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int k=3;
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums,k));
    }

    private static String maxSubArray(int[] nums,int k) {

        int sum=0;
        for(int i=0;i<k;i++) {
            sum+=nums[i];
        }

        int maxSum = sum;

        for(int i=k;i<nums.length;i++ ) {
            sum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }

        return "Maximum Subarray Sum is: " + maxSum;

    }


}
