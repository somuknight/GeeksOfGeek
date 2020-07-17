import java.util.ArrayList;
import java.util.List;

/**
 * Every student receives a grade in the inclusive range from 0 to 100.
 * Any grade less than 40 is a failing grade.
 * Sam is a professor at the university and likes to round each student's  according to these rules:
 * ->If the difference between the grade and the next multiple of 5 is less than 3,
 *      round grade up to the next multiple of 5.
 * ->If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
 *
 * Sample Input
 *
 * 4
 * 73
 * 67
 * 38
 * 33
 *
 * Sample Output 0
 *
 * 75
 * 67
 * 40
 * 33
 *
 * ->Student 1 received a 73, and the next multiple of 5 from 73 is 75.
 * Since 75-73<3, the student's grade is rounded to .
 * ->Student 2 received a 67, and the next multiple of 5 from 67 is 70.
 * Since 70-67=3, the grade will not be modified and the student's final grade is .
 * ->Student 3 received a 38, and the next multiple of 5 from 38 is 40.
 * Since 40-38<3, the student's grade will be rounded to 40.
 * ->Student 4 received a grade below 38,
 * so the grade will not be modified and the student's final grade is 33.
 */

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(73);
        list.add(67);
        list.add(38);
        list.add(45);
        list.add(99);
        list.add(77);
        list.forEach(System.out::print);
        System.out.println("\nlist: "+list);

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

    }
}
