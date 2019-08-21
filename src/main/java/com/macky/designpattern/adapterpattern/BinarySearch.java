package com.macky.designpattern.adapterpattern;

/**
 * @author Macky
 * @Title class BinarySearch
 * @Description: TODO
 * @date 2019/8/20 13:43
 */

public class BinarySearch {
    public int binarySearch(int array[], int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = array[mid];
            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return 1;
            }
        }
        return -1;
    }
}

