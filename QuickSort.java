package edu.touro.mco264;

public class QuickSort {

    private int counter = 0;

    < T extends Comparable<T> > void quickSort(T[] list){

        if(counter < list.length){

            int firstIndex = 0;                // First index in the list
            T pivot = list[counter];           // Middle index in the list
            int lastIndex = list.length - 1;   // Last index in the list.


            for(int i = 0; i < list.length; i++) {

                if (firstIndex >= lastIndex) {
                    break;
                }

                if (list[firstIndex].compareTo(pivot) >= 0 && list[lastIndex].compareTo(pivot) <= 0) {
                    T temp = list[firstIndex];
                    list[firstIndex] = list[lastIndex];
                    list[lastIndex] = temp;

                    firstIndex++;
                    lastIndex--;
                }
                else if (list[firstIndex].compareTo(pivot) < 0) {
                    firstIndex++;
                }
                else {
                    lastIndex--;
                }
            }
            counter++;
            quickSort(list);
        }
    }
}
