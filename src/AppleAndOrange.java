import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem?h_r=next-challenge&h_v=zen
 */

public class AppleAndOrange {
    public static void main(String[] args) {
        int s=7,t=11;
        int a=5,b=15;
        int[] apples={-2,2,1};
        int[] oranges={5,-6};
        int c1=0,c2=0;      //count variables
        for (int i=0;i<apples.length;i++){
            apples[i]=apples[i]+a;
        }
        for (int i=0;i<oranges.length;i++){
            oranges[i]=oranges[i]+b;
        }
        for(int i=0;i<apples.length;i++){
            if (apples[i]>=s && apples[i]<=t)
                c1++;
            else
                continue;
        }
        for (int i=0;i<oranges.length;i++){
            if (oranges[i]>=s && oranges[i]<=t)
                c2++;
            else
                continue;
        }
        System.out.println(Arrays.toString(apples));
        System.out.println(Arrays.toString(oranges));
        System.out.print(c1+"\n"+c2);






    }
}
