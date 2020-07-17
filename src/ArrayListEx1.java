import java.util.*;

/**
 * removing alternative elements from an array till there is one element left in there array and print it
 */

public class ArrayListEx1 {
    private  static int deleteElements(int s){
            if(s==1)
                return 0;
            else {return 1+deleteElements(s / 2);}

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
//        List<Integer> list1=new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            list1.add(arr[i]);
//        }
        int i=(int)Math.pow(2,deleteElements(arr.length))-1;
//        System.out.println("list1"+list1);
        System.out.println(arr[i]);

    }
}
