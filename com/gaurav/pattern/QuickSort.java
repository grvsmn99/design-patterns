package com.gaurav.pattern;

public class QuickSort {

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the QuickSort algorithm
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};

        System.out.println("Given Array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    private static void quickSort(int[] array, int low, int high) {
        if(low < high){
            int partition = partition(array, low, high);
            quickSort(array, low, partition-1);
            quickSort(array, partition+1, high);
        }


    }

    private static int partition(int[] array, int low, int high) {

        int pivot = array[high];
        int i = low-1;

        for(int j=low ; j < high; j++ ){
            if(array[j] < pivot){
                i++;
                swap(array, i,j);
            }
        }
        swap(array, i+1, high);
        return i+1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
