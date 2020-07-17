import java.util.*;

public class Test {
    public static void check(){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        switch (input){
            case 1:
                System.out.println("monday");
                break;
            case 2:System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid number");
                break;
        }
    }
    public static void main(String[] args) {
//        for (int i=0;i<10;i++){
            //check();
//        }
//        String s="car";
//        System.out.print(s.substring(0,3));
        List<Integer> list=new ArrayList<>();
        list.add(71);
        list.add(72);
        list.add(73);
        list.add(44);
        list.add(75);
        list.add(34);
        list.add(35);
        System.out.print(list);

//        System.out.print(list.);
        int[] ar={1,2,3,4,5};
        System.out.println();
        double a=(int)Math.floor(list.size()/2)+1;
        System.out.println(a);
        String s="";
/////////////////////////////gading stuents from hacker rank//////////////////////////////////
            int num;
            for(int i=0;i<list.size();i++) {
                num=list.get(i);
            if (num % 5 == 0 && num >= 38)
            {
                list.set(i,num);
                //System.out.println(list.get(i));
            }
            else if (num % 5 >= 3 && num >= 38)   //num=list.set(i, num);
            {
                do {
                    num++;
                }
                while (num % 5 >= 3);
                list.set(i,num);
                //System.out.println(num);
            }
            else {
                list.set(i,num);
                //System.out.println(num);

            }
        }
        System.out.println("list: "+list);
//////////////////////////////////////////////////////////////////////////////////////////////////
        Map<String,Integer> t=new LinkedHashMap<>();
        t.put("a",1);
        t.put("b",2);
        t.put("c",3);
        t.put("d",4);
        System.out.println(t);
        System.out.println(t.get("a"));
        for (Map.Entry<String,Integer> i:t.entrySet()){
            if(i.getValue()%2==0){
                System.out.println(i.getKey());
            }
        }
        int n=1111011;
    }
}
