package com.searchBinary;

/**
 *
 * @author Dinesh Nanda
 */

public class BinarySearch {

    public int search(int[] sequence, int element) {
        int low = 0;
        int high = sequence.length - 1;

        while (low <= high) {
            int lookup = (low + high) / 2;

            if (sequence[lookup] > element) {
                high = lookup - 1;
            } else if (sequence[lookup] < element) {
                low = lookup + 1;
            } else {
                return lookup;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 50, 70, 90, 100};
        int key = 90;

        BinarySearch binarySearch = new BinarySearch();

        int get_position = binarySearch.search(arr, key);
        
        if (get_position == -1) {
            
            System.out.println("The number is not in list");
        } 
        else {
            
            System.out.println("The number is at index: " + get_position);
        }
    }
    
}
