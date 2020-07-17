import java.util.Scanner;

public class MaxInArray {
    static int maxelement(int[] A){
        int max=0;
        for (int i=0;i<A.length;i++){
            //int max=0;
            for (int j=i+1;j<A.length;j++){

                if (A[i]>=A[j])
                    max=A[i];
                else
                    max=A[j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("enter the size of Array");
        Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        int[] Arr=new int[arraySize];

        for (int i=0;i<arraySize;i++){
            Arr[i]=sc.nextInt();
        }
        System.out.println("the max element is "+maxelement(Arr));
    }
}
