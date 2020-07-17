import java.util.Scanner;

public class PythagoreanTriplet {
    static void getTriplet(int[] ar){

        l1:for (int i=0;i<ar.length;i++){
           l2: for (int j=i+1;j<ar.length;j++){
               l3: for (int k=j+1;k<ar.length;k++){
                    int x=ar[i]*ar[i];int y=ar[j]*ar[j];int z=ar[k]*ar[k];

                    if (x==y+z || y==x+z || z==x+y ) {
                        System.out.print("true\nthe triplets are " + ar[i] + " " + ar[j] + " " + ar[k] + "\n");
                        break l1;
                    }



                }
            }
        }

    }
    static boolean isTriplet(int[] ar){
        boolean v=false;
        l1:for (int i=0;i<ar.length;i++) {
            l2:for (int j = i + 1; j < ar.length; j++) {
                l3:for (int k = j + 1; k < ar.length; k++) {
                    int x = ar[i] * ar[i];
                    int y = ar[j] * ar[j];
                    int z = ar[k] * ar[k];

                    if (i==ar.length-1){
                        v=false;
                    }
                    if (x == y + z || y == x + z || z == x + y) {
                        System.out.print("\n");
                        v=true;
                        break l1;
                    }
                }
            }
        }

    return v;
    }

    public static void main(String[] args) {
        int[] ar=new int[6];
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        if(isTriplet(ar)==true)
            getTriplet(ar);
        else
            System.out.print("\nfalse\nthere is no Triplet");


    }
}
