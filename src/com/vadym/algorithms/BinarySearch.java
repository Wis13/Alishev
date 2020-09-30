package com.vadym.algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 34, 56, 78, 84, 96,101,122,132,143,156,167};
        int key = 143;
        int low= a[0];
        int high = a.length-1;
        System.out.println(binarySearch(a, key));
        System.out.println(binarySearch(a, key, low, high));

    }

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low<= high){
            int mid = low + (high - low )/2;

            if (a[mid] > key)
                high = mid -1 ;
            else if (a[mid] < key)
                low = mid + 1;
            else return mid;
           }
       return -1;
    }
    public static int binarySearch(int [] a, int key, int low, int high){

        int mid = low + (high - low)/2;
        if (low > high){return -1;}
        if (a[mid] == key) {return mid;}
        else if (key < a[mid]){
            return binarySearch(a, key, low, mid - 1);
        }
        else {
            return binarySearch(a, key, mid + 1, high);
        }

    }
}
