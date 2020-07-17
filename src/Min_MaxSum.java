import java.util.Arrays;

/**
 * Given five positive integers,
 * find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 * For example, arr[]={1,3,5,7,9} Our minimum sum is 1+3+5+7=16 and our maximum sum is 3+5+7+9=24
 * We would print
 * 16 24
 *
 * Sample Input
 * 1 2 3 4 5
 *
 * Sample Output
 * 10 14
 */

public class Min_MaxSum {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        double range=arr.length-1;
        Arrays.sort(arr);
        double max=0,min=0;
        for(int i=0;i<range;i++){
            min=min+arr[i];
        }
        for (int i=arr.length-1;i>0;i--){
            max=max+arr[i];
        }
        System.out.format("%.0f",min);System.out.print(" ");System.out.format("%.0f",max);
    }
}
