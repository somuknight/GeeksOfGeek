/**
 * You are in charge of the cake for your niece's birthday
 * and have decided the cake will have one candle for each year of her total age.
 * When she blows out the candles, she’ll only be able to blow out the tallest ones.
 * Your task is to find out how many candles she can successfully blow out.
 *
 * Output Format
 *
 * Return the number of candles that can be blown out on a new line.
 *
 * Sample Input
 * 4
 * 3 2 1 3
 *
 * Sample Output
 * 2
 * We have one candle of height 1, one candle of height 2, and two candles of height 3.
 * our niece only blows out the tallest candles, meaning the candles where height=3
 * Because there are 2 such candles, we print 2 on a new line.
 */

import java.util.Arrays;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        int age=4;
        int count=0;
        int[] candles={4,4,1,3};
        Arrays.sort(candles);
        int max=candles[age-1];
        for(int i=0;i<age;i++){
            if (max==candles[i])
                count=count+1;
        }
        System.out.print(count);
    }
}
