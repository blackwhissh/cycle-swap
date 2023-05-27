package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length <= 1){
            return;
        }

        int lastElement = array[array.length - 1];
        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = lastElement;
    }

    public static void cycleSwap(int[] array, int shift) {
        if (array.length <= 1) {
            return;
        }

        if (shift <= 0 || shift > array.length) {
            return;
        }

        reverse(array, 0, array.length - 1);
        reverse(array, 0, shift - 1);
        reverse(array, shift, array.length - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args){
        int[] array = new int[]{1, 3, 2, 7, 4};
        CycleSwap.cycleSwap(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[]{1, 3, 2, 7, 4};
        CycleSwap.cycleSwap(array2, 2);
        System.out.println(Arrays.toString(array2));


    }
}
