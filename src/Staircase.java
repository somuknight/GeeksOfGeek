/**
 *    #
 *   ##
 *  ###
 * ####
 *
 * Observe that its base and height are both equal to n , and the image is drawn using # symbols and spaces.
 * The last line is not preceded by any spaces.
 *
 * Write a program that prints a staircase of size n .
 *
 * Sample Input
 * 6
 *
 * Sample Output
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 * ######
 *
 */
public class Staircase {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("-");
            }
            for (int k=1;k<=i;k++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
