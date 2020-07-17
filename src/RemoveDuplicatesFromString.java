/**
 * https://www.geeksforgeeks.org/remove-duplicates-from-a-string-in-o1-extra-space/
 *
 * Remove duplicates from a string in O(1) extra space
 * Given a string str of lowercase characters, the task is to remove duplicates and return a resultant string without modifying the order of characters in the original string.
 *
 * Examples:
 * Input: str = "geeksforgeeks"
 * Output: geksfor
 *
 * Input: str = "characters"
 * Output: chartes
 *
 * ***************************************************SOLVING PROCESS*******************************************************
 * *************************************************************************************************************************
 * Consider the string str = “geeksforgeeks”
 *
 * character: ‘g’
 * x = 6(ascii of g – 97)
 * 6th bit in counter is unset resulting first occurrence of character ‘g’.
 * str[0] = ‘g’
 * counter = 00000000000000000000000001000000 // mark 6th bit as visited
 * length = 1
 * character: ‘e’
 * x = 4(ascii of e – 97)
 * 4th bit in counter is unset resulting in first occurrence of character ‘e’.
 * str[1] = ‘e’
 * counter = 00000000000000000000000001010000 //mark 4th bit as visited
 * length = 2
 * character: ‘e’
 * x = 4(ascii of e – 97)
 * 4th bit in counter is set resulting in duplicate character.
 * Ignore this character. Move for next character.
 * counter = 00000000000000000000000001010000 //same as previous
 * length = 2
 * character: ‘k’
 * x = 10(ascii of k – 97)
 * 10th bit in counter is unset resulting in first occurrence of character ‘k’.
 * str[2] = ‘k’
 * counter = 00000000000000000000010001010000 //mark 10th bit as visited
 * length = 3
 * Similarly, do the same for all characters.
 */

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromString {
    static String removeDuplicates(String str) {
        String res="";
//        char[] s=str.toCharArray();
        int counter=0;
        int i=0;
//        int size=str.length();

        int x;

        int length=0;
        while(i<str.length()){
            x=str.charAt(i)-97;
            if ((counter & (1<<x))==0){
                res=res+(char)('a'+x);
                counter=counter | (1<<x);
                length++;
            }
            i++;
        }


//        return Arrays.copyOfRange(s,0,length);
        return res;
    }
    static  void Test(String str){
       int counter=0;
       char[] cha={'a','b','c','f','d','s'};
        System.out.println(Arrays.copyOfRange(cha,0,cha.length));
//        int x=str.charAt(5)-97;
//        System.out.println(x);  //
//        int y=counter & (1<<x);
//       System.out.println(y);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str1=sc.nextLine();
//        String str2=sc.nextLine();

        System.out.println(removeDuplicates(str1));
//        Test(str1);

    }
}
