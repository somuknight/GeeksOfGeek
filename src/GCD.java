public class GCD {
    private static int gcd(int a,int b){
        if (a==0)return b;
        if (b==0)return a;
        if (a>b){
            return gcd(a%b,b);
        }
        else return gcd(b%a,a);
    }
    public static void main(String[] args) {
        int a=750,b=100;
        System.out.println(gcd(a,b));
    }
}
