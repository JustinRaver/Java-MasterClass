package exercises.ReverseArray;

import java.util.Arrays;

public class ReverseArray {
    private static void reverseArray(int[] a) {
        System.out.println("Array = " + Arrays.toString(a));

        for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
            swap(a, i, j);
        }

        System.out.println("Reversed array = " + Arrays.toString(a));
    }

    public static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}
