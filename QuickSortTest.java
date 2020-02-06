package edu.touro.mco264;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    private QuickSort qSort = new QuickSort();

    @Test
    void quickSort(){
        Integer[] unsortedList = {8,34,6,5,3,4,5,2,12};

        qSort.quickSort(unsortedList);

        Integer[] sortedList = {8,34,6,5,3,4,5,2,12};
        Arrays.sort(sortedList);

        for(int i = 0; i < unsortedList.length; i++){
            assertEquals(unsortedList[i], sortedList[i]);
        }

        for(Integer i: unsortedList){
            System.out.println(i);
        }

    }
}
