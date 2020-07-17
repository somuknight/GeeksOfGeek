public class PrimeNumsInARange {
    private static void primeNumsInRange(int a,int b){
        int flag;
        for(int i=a;i<=b;i++){
            flag=1;
            for(int j=2;j<i;j++){
                if (i%j==0) {
                    flag = 0;
                    break;
                }

            }
            if (flag==1)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int a=1, b=10;
        int[] q={1,2,3,4};
//        System.out.print(q);
        primeNumsInRange(a,b);
    }
}
