import java.util.Arrays;
import java.util.Scanner;

/*
Write a function to check whether two given strings are anagram of each other or not.
An anagram of a string is another string that contains same characters,
only the order of characters can be different.
For example, “abcd” and “dabc” are anagram of each other.

        listen = silent
        triangle = integral

 */
public class Anagram {
    static boolean isAnagram(String s1,String s2){
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        int word1_length=ch1.length;
        int word2_length=ch2.length;
        if(word1_length!=word2_length)
            return false;

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i<word1_length;i++){
            if (ch1[i]!=ch2[i])
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println("enter two strings to check for anagram");

        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();

        if(isAnagram(s1,s2))
            System.out.println("strings are anagram");
        else
            System.out.println("not anagram");
    }
}
