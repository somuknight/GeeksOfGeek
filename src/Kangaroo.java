/**
 * https://www.hackerrank.com/challenges/kangaroo/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

public class Kangaroo {
    public static void main(String[] args) {
        int x1=0,v1=2,x2=5,v2=3;
        int jump1=x1+v1;
        int jump2=x2+v2;
        if (jump1==jump2){
            System.out.println("yes");
        }
        else {
            while (jump1<10000){
                jump1=jump1+v1;
                jump2=jump2+v2;
                if (jump1==jump2){
                    System.out.println("yes");
                    break;
                }else if (jump1<10000)
                {
                    continue;
                }
                else {System.out.println("no");}
            }

        }
    }
}
