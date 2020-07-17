/**
 * Input:
 * 3
 * 4
 * 4 2 5 7
 * 3
 * 11 9 12
 * 6
 * 4 3 2 7 8 9
 *
 * Output:
 * 5
 * -1
 * 7
 * Explanation:
 * Testcase 1 : Elements on left of 5 are smaller than 5 and on right of it are greater than 5.
 */


public class Leftside_Smaller_Rightside_Greater {
    static int findElement(int arr[],int n){
        for(int i=0;i<n;i++){
            int flag=0;
            for (int j=0;j<i;j++){
                if (arr[j]>=arr[i]){
                    flag=1;
                    break;
                }
            }
            for (int j=i+1;j<n;j++){
                if (arr[j]<=arr[i]){
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                return arr[i];

        }
        return -1;
    }
    public static void main(String[] args) {
        //enter an array
        int arr[]={2,1,3,8,7,6};
        System.out.println(findElement(arr,arr.length));

    }
}
