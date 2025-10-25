package org.example.Array;

public class RainWaterTrapping {

    public int trap(int[] a) {

        if (a == null || a.length == 0) {
            return 0;
        }

        int n = a.length;

        int[] leftMax = new int[n];
        int[] rightmax = new int[n];

        leftMax[0] = a[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], a[i]);
        }

        rightmax[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], a[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(leftMax[i], rightmax[i]) - a[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 3, 4}; // Expected output: 3

        System.out.println(new RainWaterTrapping().trap(a));
    }
}
