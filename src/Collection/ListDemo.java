package Collection;

import java.util.*;
import java.util.function.Consumer;

public class ListDemo {
    private static List arrayListDemo(){
        List<Integer> list1=new LinkedList<>();
        //add some elements with duplicates and null values
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(null);
        System.out.println("list1: "+list1);

        list1.remove(0);
        System.out.println("list1: "+list1);
        list1.remove(3);
        System.out.println("list1: "+list1);
        list1.add(null);


        //some positional operations
        list1.add(0,10);
        System.out.println("list1: "+list1);

        int i=list1.set(0,9); //removed element will returned
        System.out.println("removed element: "+i+" and he list :"+list1);

        //bulk operation
        Collection<Integer> list2=new ArrayList<>();
        list2.add(9);
        list2.add(3);
        list2.add(4);

        list1.removeAll(list2);//returns list
        System.out.println("list1: "+list1);//[list1]-[list2]


        list1.add(4);
        list1.retainAll(list2); //works like intersection in maths
        System.out.println("list1: "+list1);


        list1.addAll(list2); //works like union operation
        System.out.println("list1: "+list1);

        //search methods
        System.out.println("list1.contains(1): "+list1.contains(1));
        System.out.println("list1.contains(4): "+list1.contains(4));
        System.out.println("list1.indexOf(4): "+list1.indexOf(4));
        System.out.println("list1.lastIndexOf(4): "+list1.lastIndexOf(4));
        System.out.println("list1: "+list1);


        //range-view operations :sublist is backed by original
        List<Integer> list3=list1.subList(2,3);
        list3.set(0,6);
        list3.add(0,7);
        list3.add(5);
        System.out.println("list1: "+list1);
        list1.set(3,8);                     //only non-structural changes can made;structural changes like .add() leads to concurrent modification exception
        System.out.println("list3: "+list3);

//        for (int element:list1) {
//            System.out.println("elemrnt: "+element);
//            if (element==8){
//                list1.remove(Integer.valueOf(element));   /////gives concurrent modification exception//////
//            }
//
//        }


return list1;
    }
    private static void iteratorDemo(List<Integer> list1){
        System.out.println("inside iterator demo...");
        Iterator<Integer> iterator=list1.iterator();

        while (iterator.hasNext()){
            int element=iterator.next();
            System.out.println("element: "+element);
            if(element==8){
                iterator.remove();

                //forEachRemaining
                iterator.forEachRemaining(Filter::add);
            }
        }
        System.out.println("list1: "+list1);


        //forEach
//        list1.forEach(System.out::println);

//        list1.forEach(Filter::filter);
        list1.forEach(new Filter());


    }
    private static  void listIteratorDemo(){
        System.out.println("inside listIteratorDemo...");
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        //printing list elements using listIterator

        /*System.out.println("\n displaying current elements ");
        for(ListIterator<String> iterator=list.listIterator();iterator.hasNext();){
            System.out.println("iterator.nextIndex(): "+iterator.nextIndex()+
                    " ,iterator.next(): "+iterator.next());
        }*/


        //add,remove and set operation
        System.out.println("demo of add remove and set operation\n");
        for (ListIterator iterator=list.listIterator();iterator.hasNext();){
            System.out.println("iterator.nextIndex: "+iterator.nextIndex()+" iterator.next: "+iterator.next());
            if(iterator.nextIndex()==1){
                System.out.println("adding test at index 1");
                iterator.add("test");
                System.out.println("iterator.nextIndex: "+iterator.nextIndex()+" iterator.next: "+iterator.next());
                System.out.println("removing test that was added at index 1");
                iterator.previous();
                iterator.previous();
                iterator.remove();
//                System.out.println(iterator.nextIndex()+" : "+iterator.next());

                //uncommenting the below line code will give an illegalStateException
                //set should be preceded by next/previous/set here it is remove
                //iterator.set("test");
                System.out.println("iterator.nextIndex: "+iterator.nextIndex()+" iterator.next: "+iterator.next());
                System.out.println("replacing element at index 1 with test to show 2 set methods can be invoked sequentially");
                iterator.set("test");
                iterator.set("test2");

            }
        }
        System.out.println("list: "+list);




    }
    public static void main(String[] args){
        List<Integer> list1=arrayListDemo();
        //iteratorDemo(list1);
        listIteratorDemo();
    }

}
class Filter implements Consumer {
    static void filter(Integer i){
        if(i==4){
            System.out.println(i);
        }
    }
    public void accept(Object i){
        if((int)i==4){
            System.out.println(i);
        }
    }
    static void add(Integer i){
        System.out.println(i+7);
    }
}
