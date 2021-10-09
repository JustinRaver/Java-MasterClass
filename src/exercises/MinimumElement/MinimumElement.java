package exercises.MinimumElement;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner scan = new Scanner(System.in);

        return scan.nextInt();
    }

    private static int[] readElements(int n){
        Scanner scan = new Scanner(System.in);

        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        scan.close();

        return a;
    }

    private static int findMin(int[] a){
        int min = Integer.MAX_VALUE;

        for(int i:a){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
}
