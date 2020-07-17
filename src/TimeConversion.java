/**
 * Sample Input
 * 07:05:45PM
 *
 * Sample Output
 * 19:05:45
 */

public class TimeConversion {
    public static void main(String[] args) {
        String s="06:40:03AM";
//       System.out.println(s.indexOf("12",0));

        if (s.indexOf("PM")>0){
            if(s.indexOf("12",0)==0){
                System.out.println(s.substring(0,8));
            }
            else {
                String substring1 = s.substring(0, 8);
//                System.out.println(substring1);
                String hr = substring1.substring(0, 2);
                String mmss = substring1.substring(2, 8);
                int hour = Integer.parseInt(hr) + 12;
                String hh = Integer.toString(hour);
                String pm = hh + mmss;
            System.out.println(pm);
            }
        }

        if (s.contains("AM")){
            String substring2=s.substring(0,8);

            if(substring2.indexOf("12",0)==0){
                String ammmss=substring2.substring(2,8);
                String part1="00";
                String am=part1+ammmss;
                System.out.println(am);
            }
            else {
                System.out.print(substring2);
            }

        }

    }
}
