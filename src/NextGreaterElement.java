import com.sun.javafx.sg.prism.NGEllipse;

import java.io.*;
/*
Element       NGE
        4      -->   5
        5      -->   25
        2      -->   25
        25     -->   -1


        Element        NGE
        13      -->    -1
        7       -->     12
        6       -->     12
        12     -->     -1
        2      --->    -1
*/

public class NextGreaterElement {
    static void nextGreater(int N,int arr[]){

        for (int i=0;i<N;i++){
            int next=-1;
            for (int j=i+1;j<N;j++){

                if (arr[i]<arr[j]){
                    next=arr[j];
                    break;
                }

            }
            System.out.println(arr[i]+"---->"+next);
        }

    }

    public static void main(String[] args) {
        int N=5;
        int arr[]={13,7,6,12,2};
        //int x=arr[1];
        nextGreater(N,arr);
    }
}
