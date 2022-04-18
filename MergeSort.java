package com.company;

public class MergeSort {

    public static void merge(int[] array, int left, int mid, int right) {

        //  Find the sizes of 2 subarrays to be merged
        int l = mid - left + 1;
        int r = right - mid;

        //  Create temp arrays
        int[] subArr1 = new int[l];
        int[] subArr2 = new int[r];

        //  Insert elements into temp arrays
        for (int i = 0; i < l; i++) {
            subArr1[i] = array[left + i];
        }
        for (int j = 0; j < r; j++) {
            subArr2[j] = array[mid + 1 + j];
        }

        //  Initialize the indexes of the 1rst and 2nd subarrays
        int i = 0, j = 0;

        //  Initialize index of merged subarrays
        int k = left;
        while (i < l && j < r) {
            if (subArr1[i] <= subArr2[j]) {
                array[k] = subArr1[i];
                i++;
            } else {
                array[k] = subArr2[j];
                j++;
            }
            k++;
        }

        //  Copying remaining elements of subArray1[] if there is any
        while (i < l) {
            array[k] = subArr1[i];
            i++;
            k++;
        }

        //  Copying remaining elements of subArray2[] if there is any
        while (j < r) {
            array[k] = subArr2[j];
            j++;
            k++;
        }
    }

    //  Recursive call that sorts array[] using merge()
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            //  Find the mid point
            int mid = (left + right) / 2;

            //  Sort 1rst and 2nd halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            //  Merge the sorted halves
            merge(array, left, mid, right);
        }
    }
}
