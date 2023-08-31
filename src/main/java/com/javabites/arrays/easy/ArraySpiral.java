package com.javabites.arrays.easy;

public class ArraySpiral {

    public static void main(String[] args) {
        //int[] array = {1, 10, 14, 20, 18, 12};
        int[] array = { 1, 10, 14, 20, 18, 12, 5 };
        int end = array.length - 1;
        int start = 0;
        while(start < end) {

            if(array[start] > array[end]) {
                System.out.println("No");
                return;
            }
            start++;

            if(array[end] > array[start]) {
                System.out.println("No");
                return;
            }
            end--;
        }
        System.out.println("Yes Yes Yes");
    }
}