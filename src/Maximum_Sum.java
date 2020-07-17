/**
 * Maximum sum such that no elements are adjacent
 *
 *
 * arr[] = {5,  5, 10, 40, 50, 35}
 *
 *   incl = 5
 *   excl = 0
 *
 *   For i = 1 (current element is 5)
 *   incl =  (excl + arr[i])  = 5
 *   excl =  max(5, 0) = 5
 *
 *   For i = 2 (current element is 10)
 *   incl =  (excl + arr[i]) = 15
 *   excl =  max(5, 5) = 5
 *
 *   For i = 3 (current element is 40)
 *   incl = (excl + arr[i]) = 45
 *   excl = max(5, 15) = 15
 *
 *   For i = 4 (current element is 50)
 *   incl = (excl + arr[i]) = 65
 *   excl =  max(45, 15) = 45
 *
 *   For i = 5 (current element is 35)
 *   incl =  (excl + arr[i]) = 80
 *   excl =  max(65, 45) = 65
 *
 * And 35 is the last element. So, answer is max(incl, excl) =  80
 */

public class Maximum_Sum {
    static void calculation(int arr[]){
        int incl=arr[0];
        int excl=0;
        int new_excel;

        for (int i=1;i<arr.length;i++){
            new_excel=Math.max(incl,excl);
            incl=excl+arr[i];
            excl=new_excel;
        }
        System.out.println(Math.max(incl,excl));

    }
    public static void main(String[] args) {
        System.out.println("enter an array of integers");
        int arr[]={5,5,10,40,50,35};
        calculation(arr);   //passing to the function
    }
}
