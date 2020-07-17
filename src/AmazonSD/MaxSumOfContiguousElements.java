package AmazonSD;

import java.util.Arrays;

public class MaxSumOfContiguousElements {
    public static int method(int input1,int[]input2){
        int sum=0;
        //int max=0;
        for (int i=0;i<input1;i++){
            sum=sum+input2[i];
        }
        Arrays.sort(input2);


        if (sum>input2[input1-1])
            return sum;
        else
            return input2[input1-1];


    }
    public static void main(String[] args) {
        int input1=3;//size of array
        int[] input2={1,2,3};
        System.out.println("max is "+method(input1,input2));
    }
}
