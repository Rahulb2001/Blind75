package org.example.Blind75;

public class PairSumTwoPointer {

    public int[] paiSum(int[] a,int target){

        int i=0;
        int j=a.length-1;

        while(i<j) {
            if(a[i]+a[j] ==target){
                return new int[]{i,j};
            }
            if(a[i]+a[j] < target){
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        PairSumTwoPointer pairSumTwoPointer = new PairSumTwoPointer();

        int[] a = {1, 2, 3, 4, 6};
        int target = 10;

        int[] result = pairSumTwoPointer.paiSum(a, target);

        if (result != null) {
            System.out.println("Pair found at indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found with the given sum.");
        }
    }
}
