public class DecimaltoBinary {
    private static int dTob(int n){
        int[] binarynum=new int[50];

        int i=0;
        while (n>0){
            binarynum[i]=n%2;
            n=n/2;
            ++i;
        }
        int num=0;
        for (int j=i-1;j>=0;j--){
            num=(num*10)+binarynum[j];
        }
        return num;
    }
    public static void main(String[] args) {
        int num=25;
        System.out.println(dTob(num));
    }
}
