/**
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfAnagram {
    static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        char[] c1=str1.toCharArray();
        Arrays.sort(c1);
        char[] c2=str2.toCharArray();
        Arrays.sort(c2);
        boolean flag=false;
        for (int i=0;i<c1.length;i++)
            if (c1[i] == c2[i])
                flag = true;
            else
                break;
        if(flag==true)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        System.out.println("enter the two strings to test: ");
        Scanner sc=new Scanner(System.in);

        String str1=sc.nextLine();
        String str2=sc.nextLine();

        System.out.println(isAnagram(str1,str2)?"ANAGRAM":"NOT ANAGRAM");
    }
}
