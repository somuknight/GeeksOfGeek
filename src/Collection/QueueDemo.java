package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo {
    private  static void dequeTest(){
        System.out.println("inside dequeTest....\n");

        //Queue- FIFO
        Deque<String> deque=new ArrayDeque<>();
        deque.add("u");
        deque.add("m");
        deque.add("a");
        System.out.println(deque);
        System.out.println("printing elements of queue...");

        System.out.println(deque.remove());     //both method remove the head or first and returns that
        System.out.println(deque.removeFirst());
        System.out.println(deque.remove());

        //stack- LIFO
        deque.push("u");
        deque.push("m");
        deque.push("a");
        System.out.println(deque);
        System.out.println("printing elements of stack...");

        System.out.println(deque.pop());    //pop method remove the top element
        System.out.println(deque.removeFirst());    //removelast will remove the last element of stack
                                                    //removefirst will remove the top element
        System.out.println(deque.pop());


    }
    public static void main(String[] args) {
        dequeTest();
    }
}
