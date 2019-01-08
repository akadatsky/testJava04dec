package com.company;

public class MainClass {

    public static void main(String[] args) {
        int[] arr = {1,2,5,1,2,1};

        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);

    }


}
