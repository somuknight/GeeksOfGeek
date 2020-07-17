package Collection;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        //boolean addAll(Collection<? super T> c,T... elements);
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("x");

        String[] str={"anita"};

        Collections.addAll(list,str);
        System.out.println("list: "+list);

//        list.addAll(Arrays.asList(str));

        Collections.sort(list);
        System.out.println("sorted list: "+list);

        System.out.println("is a  there? "+Collections.binarySearch(list,"b")); //returns the index value

        Collections.reverse(list);
        System.out.println("reversed list: "+list);

        Collections.swap(list,0,3);
        System.out.println("swapped list: "+list);

        Collections.shuffle(list);
        System.out.println("shuffled list: "+list);

        System.out.println("max: "+Collections.max(list));
        System.out.println("min: "+Collections.min(list));

        System.out.println("# anita's: "+Collections.frequency(list,"anita"));
        list.add("x");

        list.removeAll(Collections.singleton("x"));
        System.out.println(Collections.singleton("x"));// returns a collection
        System.out.println(list);

        Collection<String> unmodifible=Collections.unmodifiableCollection(list);
        System.out.println(unmodifible);

    }
}
