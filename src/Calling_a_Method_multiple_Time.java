import java.util.Scanner;

public class Calling_a_Method_multiple_Time {

    static void mainCaller(){
        System.out.println("wanna go again then hit SPACE");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char c=str.charAt(0);
        if(c==' '){
            Calling_a_Method_multiple_Time.main(null);
        }


    }
    static int addition(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
//        System.out.println("hii");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(addition(a,b));

        mainCaller();

    }
}
