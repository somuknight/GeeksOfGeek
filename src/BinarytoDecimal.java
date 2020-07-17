public class BinarytoDecimal {
    private static int bTod(int n){
        int num=n;
        int decValue=0;
        int base=1;
        int temp=num;
        while (temp>0){
            int lastdigit=temp%10;
            temp=temp/10;
            decValue=decValue+lastdigit*base;
            base=base*2;
        }
        return decValue;
    }
    public static void main(String[] args) {
        int n=101010;
        System.out.println(bTod(n));
    }
}
