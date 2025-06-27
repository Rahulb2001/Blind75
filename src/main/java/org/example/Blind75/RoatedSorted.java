package org.example.Blind75;

public class RoatedSorted {

    public boolean sorted(int[] nums, int target) {

        int mid = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (nums[mid] >= nums[left]) {

                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {

                if (target < nums[right] && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
        }

        return false;
    }

    public static void main(String[] args) {
        RoatedSorted roatedSorted = new RoatedSorted();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        boolean result = roatedSorted.sorted(nums, target);
        System.out.println("Is target " + target + " present in the rotated sorted array? " + result);
    }

}