import java.util.Arrays;

/*
    Given a word and a text, return the count of the occurences of anagrams of the
        word in the text(For eg: anagrams of word for are for, ofr, rof etc.))

        Input : forxxorfxdofr
        for
    Output : 3
    Explanation : Anagrams of the word for - for, orf,
    ofr appear in the text and hence the count is 3.

    Input : aabaabaa
            aaba
    Output : 4
    Explanation : Anagrams of the word aaba - aaba,
    abaa each appear twice in the text and hence the
    count is 4.
*/
public class AnagramCount {
    static boolean areAnagram(String s1,String s2){
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2))
            return true;
        else
            return false;
    }
    static int countAnagram(String t,String w){
        int count=0;
        int textLength=t.length();
        int wordLength=w.length();
        for (int i=0;i<textLength-wordLength;i++){
            String s=t.substring(i,i+wordLength);
            if (areAnagram(w,s))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String Text="forxxorfxdofr";
        String word="for";
        System.out.println(countAnagram(Text,word));

    }
}
