import java.util.Arrays;

/**
 * bridgelabz f2f question
 */

public class AbsentElements {
    public static void main(String[] args) {
        int[] arr={1,2,8,0,-1,6,10};
        int[] arr1={6,10,8};
        boolean flag=false;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    flag=false;
                    break;
                }
                if (arr[i]!=arr1[j]){
                    flag=true;
                }
            }
            if(flag==true){
                System.out.print(arr[i]+",");
            }
        }
    }
}
