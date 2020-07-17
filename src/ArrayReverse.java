import java.util.Scanner;

public class ArrayReverse {
     static void reverse(int[] A){
        int temp;
        for(int i=0;i<A.length;i++){
            for (int j=i+1;j<A.length;j++){
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        for (int k=0;k<A.length;k++) {
            System.out.print(A[k]+",");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the size of Array");
        Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        int[] Arr=new int[arraySize];

        for (int i=0;i<arraySize;i++){
            Arr[i]=sc.nextInt();
        }
        System.out.println("the reverse Array is ");
        reverse(Arr);
    }
}
