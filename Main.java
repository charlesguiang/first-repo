package com.company;

//  Charles Mathew Guiang
//  Student ID 261063854

import java.util.Arrays;
import java.util.Random;

public class Main {

    //  Creating variables to call algorithm methods
    public static BubbleSort bSort;
    public static MergeSort mSort;
    public static QuickSort qSort;

    //  Driver method
    public static void main(String[] args) {

        Random rd = new Random(); // creating Random object
        int[] arr = new int[100];    //  Initializing new array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100); // storing random integers in an array
//            System.out.print(arr[i] + " "); //  Printing out array before sorting
        }

        /** Comment/Uncomment sorting algorithms with timers to run the methods **/

        /** ============ Bubble Sort ============ **/

        double startTime = System.nanoTime();
        bSort.bubbleSort(arr);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        //  Average time of 10 tests = 1.0417 ms

        /** ============ Merge Sort ============ **/

//        double startTime = System.nanoTime();
//        mSort.mergeSort(arr, 0, arr.length - 1);
//        double endTime = System.nanoTime();
//        double duration = (endTime - startTime) / 1000000;
        //  Average time of 10 tests = 0.454 ms

        /** ============ Quick Sort ============ **/

//        double startTime = System.nanoTime();
//        qSort.quickSort(arr, 0, arr.length - 1);
//        double endTime = System.nanoTime();
//        double duration = (endTime - startTime) / 1000000;
        //  Average time of 10 tests = 0.677 ms

        /** ========== Printing array ========== **/

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));   //  Prints sorted array
        System.out.println("Sorting took " + duration + " milliseconds.");
    }
}
