public class PrimeAndFibonnaciSeries {
    private static int fibonacci(int n){
        int i,t1=0,t2=1,nextTerm;
        for (i=1;i<=n;i++){
            nextTerm=t1+t2;
            t1=t2;
            t2=nextTerm;
        }
        return t1;
    }
    private static int prime(int n){
        int flag,count=0;
        for (int i=2;i<1000;i++){
            flag=0;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0 && ++count==n){
                return i;

            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] ar={1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17};
        int n=14;
        if (n%2==1)
            System.out.println(fibonacci(n/2+1));
        else
            System.out.println(prime(n/2));
    }
}
