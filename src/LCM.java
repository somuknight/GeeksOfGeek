public class LCM {
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
    public static void main(String[] args) {
        int a=25,b=35;
        System.out.println(lcm(a,b));
    }
}
