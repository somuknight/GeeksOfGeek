package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArraysDemo {
    private static  void parallel(){
        System.out.println("inside parallel...");
        int[] iArray={23,4,5};
        Arrays.parallelSort(iArray);
        System.out.println("iArray parallel sort"+Arrays.toString(iArray));

        IntBinaryOperatorImpl IntBinaryOperatorImpl=new IntBinaryOperatorImpl();
        Arrays.parallelPrefix(iArray,IntBinaryOperatorImpl);
        System.out.println(Arrays.toString(iArray));


    }
    private static void sequential(){
        System.out.println("inside sequential...\n");
        //asList~very commonly used
        //List<T> asList(T...)
        String[] str={"uma","kaveri"};
        List<String> list1= Arrays.asList(str); //fixed size
        System.out.println(list1);
//        list1.add("sinthya");   //java.lang.UnsupportedOperationException
//        list1.remove(0);
        list1.set(1,"sinthya");     //backed by original array
        System.out.println(list1);//because list size is fixed
        System.out.println("str[]: "+Arrays.toString(str));

        //creating modifiable ArrayList from an Array
        list1=new ArrayList<>(Arrays.asList(str));
        System.out.println(list1);
        list1.add("lovers");
        System.out.println(list1);

        //showing varargs
        list1=Arrays.asList("we","are","lovers");
        System.out.println(list1);

        List<String> fixedList=Arrays.asList(new String[3]);    //empty array is passed with a size specified
                                                                // to create fixed size list
        System.out.println(fixedList.size());
        //recall from autoboxing arrays are not auto-boxable
//        list1.add("u");   //unsupported operation exception
        System.out.println(list1);
//        List<Integer> fixedList2=Arrays.asList(new int[2]); //arrays are not auto-boxable
        List<int[]> fixedList2=Arrays.asList(new int[2]);   //list of int arrays of size 2
        System.out.println(fixedList2.size());

        //sorting: void sort(object[]) uses- merge-sort with natural ordering
        //partially sorted: far fewer than nlogn
        //almost sorted: approx. n comparision where n is the array size
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));   //well suited for merging 2 sorted arrays

        //sorting: void sort(int[]) - uses quick sort
        int[] iArray={23,4,25};
        Arrays.sort(iArray);
        System.out.println(Arrays.toString(iArray));

        //void sort(T[] a,Comparator<?super T>c)

        //searching:
        // BinarySearch: int binarySearch(int[],int);
        //              return index if element found
        //              otherwise return (insertion point) -1
        //              input array must be sorted.Otherwise behaviour undefined
        System.out.println("index value returned by binary search: "+Arrays.binarySearch(iArray,27));

        //copyOf
        int[] newArray=Arrays.copyOf(iArray,6);
        System.out.println(Arrays.toString(newArray));

        int[] newArray1=new int[6];
        System.arraycopy(iArray,0,newArray1,3,iArray.length);
        System.out.println(Arrays.toString(newArray1));

        Arrays.fill(newArray,7);
        System.out.println(Arrays.toString(newArray));

        System.out.println("equals? "+Arrays.equals(newArray,newArray1));

        //Arrays.deepEquals(Object[],Object[])
        // returns true if they are deeply equal
        // appropriate for multidimensional array
        int[][][] deepArray1={{{1,2,3},{4,5,6}}};
        int[][][] deepArray2={{{1,2,3},{4,5,6}}};

        System.out.println("deep array equals? "+Arrays.deepEquals(deepArray1,deepArray2));




    }
    public static void main(String[] args) {
        //sequential();
        parallel();


    }
}
class IntBinaryOperatorImpl implements IntBinaryOperator{
    public int applyAsInt(int left,int right){
        return left+right;
    }
}
