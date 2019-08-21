package com.macky.designpattern.adapterpattern;

/**
 * @author Macky
 * @Title class TargetAdapter
 * @Description: TODO
 * @date 2019/8/20 11:45
 */
public class TargetAdapter implements Target{

    private BinarySearch search;
    private QuickSort quickSort;

    public TargetAdapter(){
        search = new BinarySearch();
        quickSort = new QuickSort();
    }
    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return search.binarySearch(array, key);
    }
}
