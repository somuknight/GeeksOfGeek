public class GCDOf_nNumbers {
    private static int gcd(int a,int b){
        if (a==0)return b;
        if (b==0)return a;
        if (a>b){
            return gcd(a%b,b);
        }
        else return gcd(b%a,a);
    }
    private static int gcdOf(int[] a){
        int result=a[0];
        for (int i=1;i<a.length;i++){
            result=gcd(a[i],result);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={ 2, 4, 6, 8, 16 };
        System.out.println(gcdOf(arr));
    }
}
