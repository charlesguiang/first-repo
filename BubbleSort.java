package com.company;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int array[]) {
        int arr = array.length;

        //  outer for loop to check each element in the array
        for (int i = 0; i < arr - 1; i++) {

            //  inner for loop to compare array elements
            for (int j = 0; j < arr - i - 1; j++) {

                //  if statement to compare the adjacent elements
                if (array[j] > array[j + 1]) {

                    //  swap happens if elements are not in the correct order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
