
public class SortArrayOf0s_1s_2s {
    static void sort(int a[]) {
        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int v=a[i];
                    a[i]=a[j];
                    a[j]=v;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }


    }
    public static void main(String[] args) {
        int a[]={1,0,1,1,1,2,0,1,0,2};
        sort(a);
    }
}
