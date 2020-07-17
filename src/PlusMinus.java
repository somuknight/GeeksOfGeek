//import java.text.DecimalFormat;

/**
 * Given an array of integers,
 * calculate the fractions of its elements that are positive, negative, and are zeros.
 * Print the decimal value of each fraction on a new line.
 *
 *
 * Complete the plusMinus function in the editor below. It should print out the ratio of positive,
 * negative and zero items in the array, each on a separate line rounded to six decimals.
 * plusMinus has the following parameter(s):
 * arr: an array of integer
 *
 * Sample Input:
 * 6
 * -4 3 -9 0 4 1
 *
 * Sample Output
 * 0.500000
 * 0.333333
 * 0.166667
 *
 */
public class PlusMinus {
    public static void main(String[] args) {
        int[] a={1,1,-1,-1,0};
        double size=a.length;
        double count2=0,count1=0,count3=0;
//        DecimalFormat ds=new DecimalFormat("#.######");
        for(int i=0;i<size;i++){
            if(a[i]<0){
                count2=count2+1;    //for -ve
            }
            else if(a[i]==0) {
                count3=count3+1;    //for zero
            }
            else {
                count1=count1+1;    //for +ve
            }

        }
        double c2=count2/size;
        double c1=count1/size;
        double c3=count3/size;
        System.out.format("%.6f\n",c1);
        System.out.format("%.6f\n",c2);
        System.out.format("%.6f\n",c3);

    }
}
