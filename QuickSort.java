package com.company;

public class QuickSort {

    public static int partition(int[] array, int low, int high) {

        //  Making the pivot the rightmost element
        int pivot = array[high];

        //  Making index of smaller element and the
        //  right position of the pivot
        int i = (low - 1);

        //  Loop comparing each element with pivot
        for (int j = low; j <= high - 1; j++) {

            //  If current element is smaller than the pivot
            if (array[j] <= pivot) {

                //  Increment index of smaller element
                i++;

                //  Swapping element i with j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        //  Swapping pivot element with the greater element i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        //  Return the position from where the partition is done
        return (i + 1);
    }

    public static void quickSort(int[] array, int low, int high) {
        //  If the starting index is smaller than the ending index
        if (low < high) {

            //  Find pivot element so that elements smaller than pivot
            //  are on the left and elements greater than pivot are on the right
            int pi = partition(array, low, high);

            //  Recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            //  Recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }
}
