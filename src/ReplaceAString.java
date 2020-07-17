import java.util.Scanner;

public class ReplaceAString {
    public static void main(String[] args) {
        String template="Hello <<template>> how are you?";
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        template=template.replace("<<template>>",name);
        System.out.println(template);
    }
}
