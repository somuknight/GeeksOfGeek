public class LCMof_nNumbers {
    private static int gcd(int a,int b){
        if (a==0)return b;
        if (b==0)return a;
        if (a>b){
            return gcd(a%b,b);
        }
        else return gcd(b%a,a);
    }
    private static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
    private static int lcmofN(int[] a){
        int result=a[0];
        for (int i=1;i<a.length;i++){
            result=lcm(a[i],result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={ 1,2,3};
        System.out.println(lcmofN(arr));
    }
}
