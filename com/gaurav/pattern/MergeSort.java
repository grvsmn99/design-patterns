package com.gaurav.pattern;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    private static void mergeSort(int[] array, int l, int r) {
        if(l<r) {
            int m = (l + r) / 2;
            mergeSort(array, l, m);
            mergeSort(array, m + 1, r);
            merge(array, l, m, r);
        }

    }

    private static void merge(int[] array, int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i=0;i<n1;i++){
            leftArray[i] = array[l+i];
        }
        for(int j=0; j<n2;j++){
            rightArray[j] = array[m+j+1];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(leftArray[i] < rightArray[j]){
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            array[k] = leftArray[i];
            i++;k++;
        }
        while(j<n2){
            array[k] = rightArray[j];
            j++;k++;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
