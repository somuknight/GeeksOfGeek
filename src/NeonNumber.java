/**
 * A neon number is a number where the sum of digits of square of the number is equal to the number.
 * For example if the input number is 9,
 * its square is 9*9 = 81 and sum of the digits is 9.
 * i.e. 9 is a neon number.
 *
 */

import java.util.Scanner;

public class NeonNumber {
    public static int  summation(int sqr){
        int sum=0;
        while(sqr!=0){
            sum=sum+(sqr%10);
            sqr=sqr/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("the neon numbers are: ");
        for(int i=0;i<=n;i++){
            int sqr=i*i;
            int sum=summation(sqr);
            if(sum==i){
                System.out.println(i);
            }
        }

    }
}
