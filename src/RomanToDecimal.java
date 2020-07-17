import java.util.Scanner;

/**
 * https://www.geeksforgeeks.org/converting-roman-numerals-decimal-lying-1-3999/
 *
 * Converting Roman Numerals to Decimal lying between 1 to 3999
 * Given a Roman numeral, the task is to find its corresponding decimal value.
 *
 * Example :
 * Input: IX
 * Output: 9
 * IX is a Roman symbol which represents 9
 *
 * Input: XL
 * Output: 40
 * XL is a Roman symbol which represents 40
 *
 * Input: MCMIV
 * Output: 1904
 * M is a thousand,
 * CM is nine hundred and
 * IV is four
 *
 */

public class RomanToDecimal {
    static int value(char c){
        if(c=='I')
            return 1;
        if(c=='V')
            return 5;
        if (c=='X')
            return 10;
        if (c=='L')
            return 50;
        if (c=='C')
            return 100;
        if (c=='D')
            return 500;
        if (c=='M')
            return 1000;
        return -1;
    }
    static int romanToNumber(String str){
        int res=0;
        for(int i=0;i<str.length();i++){
            int s1=value(str.charAt(i));
            if (i+1<str.length()) {
                int s2 = value(str.charAt(i + 1));

                if (s1 >= s2){
                    res=res+s1;
                }
                else {
                    res=res+s2-s1;
                    i++;
                }
            }
            else{
                res=res+s1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RomanToDecimal ob=new RomanToDecimal();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("the decimal value of the roman "+str+" is "+ob.romanToNumber(str));
    }
}
