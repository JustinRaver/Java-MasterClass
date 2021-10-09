package exercises.SortedArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortedArray {
    public int[] getIntegers(int size){
        int[] array = new int[size];

        Scanner scan = new Scanner(System.in);

        for(int i=0;i<size;i++){
            array[i] = scan.nextInt();
        }
        return array;
    }

    public void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        Arrays.sort(array);
        int[] ret = new int[array.length];

        for(int i=0, j= array.length-1;i<array.length;i++,j--) {
            ret[i] = array[j];
        }

        return ret;
    }
}
