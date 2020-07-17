//import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
import java.util.Scanner;

public class K_LargeNo {
    static void getKNums(int[] ar,int k){
        Arrays.sort(ar);
        int l=ar.length;
        for (int i=0;i<k;i++){
            System.out.print(ar[--l]+" ");
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] ar=new int[6];
        System.out.print("enter nos to the array ");


        for (int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        System.out.print("enter how many large no u want? ");
        int k=sc.nextInt();
        getKNums(ar,k);


    }
}
