package com.company;

public class MainClass {

    public static void main(String[] args) {
        int[] arr = {1,2,5,1,2,1};
        int maxIndex = 0;
        maxIndex = getMaxIndex(arr, maxIndex);
        System.out.println(maxIndex);
    }

    private static int getMaxIndex(int[] arr, int maxIndex) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }


}
