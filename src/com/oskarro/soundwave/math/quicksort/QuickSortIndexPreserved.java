package com.oskarro.soundwave.math.quicksort;

/**
 * Here description
 *
 * @author Oskar Slyk
 */

public class QuickSortIndexPreserved {

    private QuickSort quickSort;

    public QuickSortIndexPreserved(int[] array){
        quickSort=new QuickSortInteger(array);
    }

    public QuickSortIndexPreserved(double[] array){
        quickSort=new QuickSortDouble(array);
    }

    public QuickSortIndexPreserved(short[] array){
        quickSort=new QuickSortShort(array);
    }

    public int[] getSortIndexes(){
        return quickSort.getSortIndexes();
    }

}