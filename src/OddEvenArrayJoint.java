//incomplete

//import java.util.Arrays;

public class OddEvenArrayJoint {
    static void push(char[] ch,char c){
        for (int i=0;i<ch.length;i++){
            ch[i]=c;
        }
        for (int i=0;i<ch.length;i++){
            System.out.print(ch[i]+",");
        }
    }
    public static void main(String[] args) {
        //Enter an Array
        char[] AC={'a','b','c','d','e'};
        //Create another array for final result
        char[] FinalArray=new char[AC.length];
        //code
        for (int i=0;i< AC.length;i++){
            if(i%2!=0)
                push(FinalArray,AC[i]);

        }
        //print
    }
}
