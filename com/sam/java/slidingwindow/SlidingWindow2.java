package com.sam.java.slidingwindow;

/**
 * Finds the length of the smallest subarray of size S
 */
class SlidingWindow2 {
    private static int findMinSubArray(int s, int[] array) {
        int n = array.length;
        int windowSum =0;
        int windowStart =0;
        int lengthOfSubArray =Integer.MAX_VALUE;

        for (int windowEnd =0; windowEnd < n; windowEnd++) {
            windowSum +=array[windowEnd];

            while(windowSum >= s) {
                lengthOfSubArray = Math.min(lengthOfSubArray, windowEnd-windowStart+1);
                windowSum -= array[windowStart];
                windowStart++;
            }
        }
        return lengthOfSubArray == Integer.MAX_VALUE ? 0 : lengthOfSubArray;
    }

    public static void main(String args[]) {
        int result = SlidingWindow2.findMinSubArray(888, new int[] {3, 5, 6, 1, 3, 5});
        System.out.println("Result " + result);
    }
}