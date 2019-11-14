package Moderate;

import java.util.Arrays;

public class smallestDifference {
//To reduce difference between two values, we will move array with smaller value.
    public int smallestDiff(int[] A, int[] B){
        Arrays.sort(A);
        Arrays.sort(B);

        int min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        while(a < A.length && b < B.length){
            if(Math.abs(A[a] - B[b]) < min){
                min = Math.abs(A[a] - B[b]);
            }
            if(A[a] < B[b]){
                a++;
            }
            else{
                b++;
            }
        }
        return min;
    }
}
