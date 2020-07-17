package Collection;

import java.util.*;

public class SetDemo {
    private  static void hashSetDemo(){
        System.out.println("inside hash setDemo...\n");
        Set<String> set1=new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("a");
        set1.add(null);
        System.out.println("set1: "+set1);

        Books book1=new Books("u","m",1);
        Books book2=new Books("u","o",2);

        Set<Books> set2=new HashSet<>();
        set2.add(book1);
        set2.add(book2);
        System.out.println("set2: "+set2);      //it will print like this
                                            // set2: [Collection.Books@4554617c, Collection.Books@1b6d3586]
                                                    //because these are instances that were added



    }
    private static void linkedHashSetDemo(){
        System.out.println("inside linkedhashset demo...\n");
        Set<String> hashset=new HashSet<>();
        hashset.add("u");
        hashset.add("m");
        hashset.add("a");
        System.out.println("hashset: "+hashset); //insertion order is not preserved
        Set<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("u");
        linkedHashSet.add("m");
        linkedHashSet.add("a");
        System.out.println("linkedHashSet: "+linkedHashSet); //insertion order is preserved
        System.out.println(linkedHashSet.size());


    }
    private static void sortedSetDemo(){
        System.out.println("inside sortedSetDemo...\n");
        Set<String> set1=new SortedSet<String>() {

            @Override
            public Comparator<? super String> comparator() {
                return null;
            }

            @Override
            public SortedSet<String> subSet(String fromElement, String toElement) {
                return null;
            }

            @Override
            public SortedSet<String> headSet(String toElement) {
                return null;
            }

            @Override
            public SortedSet<String> tailSet(String fromElement) {
                return null;
            }

            @Override
            public String first() {
                return null;
            }

            @Override
            public String last() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        set1.add("u");  //not happening
        set1.add("m");
        set1.add("a");
        set1.add("b");
        set1.add("a");
        set1.add("l");
        set1.add("l");
        set1.add("a");
        set1.add("v");
        System.out.println((SortedSet<String>)set1);
        System.out.println(((SortedSet<String>) set1).subSet("a","u"));
    }
    private static void navigableSeDemoo(){
        System.out.println("inside navigable set demo...\n");
        Set<String> set1=new NavigableSet<String>() {
            @Override
            public String lower(String s) {
                return null;
            }

            @Override
            public String floor(String s) {
                return null;
            }

            @Override
            public String ceiling(String s) {
                return null;
            }

            @Override
            public String higher(String s) {
                return null;
            }

            @Override
            public String pollFirst() {
                return null;
            }

            @Override
            public String pollLast() {
                return null;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public NavigableSet<String> descendingSet() {
                return null;
            }

            @Override
            public Iterator<String> descendingIterator() {
                return null;
            }

            @Override
            public NavigableSet<String> subSet(String fromElement, boolean fromInclusive, String toElement, boolean toInclusive) {
                return null;
            }

            @Override
            public NavigableSet<String> headSet(String toElement, boolean inclusive) {
                return null;
            }

            @Override
            public NavigableSet<String> tailSet(String fromElement, boolean inclusive) {
                return null;
            }

            @Override
            public SortedSet<String> subSet(String fromElement, String toElement) {
                return null;
            }

            @Override
            public SortedSet<String> headSet(String toElement) {
                return null;
            }

            @Override
            public SortedSet<String> tailSet(String fromElement) {
                return null;
            }

            @Override
            public Comparator<? super String> comparator() {
                return null;
            }

            @Override
            public String first() {
                return null;
            }

            @Override
            public String last() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        set1.add("r");
        System.out.println(set1); //not happening
    }
    private static void treeSetDemo(){
        System.out.println("inside tree set demo...\n");
        Books book1=new Books("a","x",1);
        Books book2=new Books("a","x",1);
        Books book3=new Books("b","y",2);
        Books book4=new Books("c","z",3);

        Set<Books> set1=new TreeSet<>(new TitleComparator());
        set1.add(book1);
        set1.add(book2);
        set1.add(book3);
        set1.add(book4);
        System.out.println(set1);
        for (Books book:set1
             ) {
            System.out.println(book);

        }
    }
    private static void treeSetDemo2(){
        System.out.println("inside treeSetDemo2...");
        NavigableSet<Integer> set=new TreeSet<>();
        set.add(5);
        set.add(74);
        set.add(25);
        set.add(79);
        int key=74;

        System.out.println("set: "+set);    //auto sorted
        //closest matches
        System.out.println("lower: "+set.lower(key)); //immediate smaller
        System.out.println("floor: "+set.floor(key));
        System.out.println("ceiling: "+set.ceiling(key));
        System.out.println("higher: "+set.higher(key));//immediate higher

        System.out.println("first: "+set.first());
        System.out.println("last: "+set.last());        //returns first and last element

        NavigableSet descendingSet=set.descendingSet();
        System.out.println("descendingSet: "+descendingSet);

        //headset and tailset
        NavigableSet headset=set.headSet(key,true);
        System.out.println("headset: "+headset);
        headset.add(6);
        headset.add(4);
        set.headSet(key,true).add(7);
        System.out.println("headset: "+headset);
        System.out.println("set: "+set);
        //headset.add(75);    //75>key key out of range
        NavigableSet tailset=set.tailSet(key,true);
        System.out.println("tailset: "+tailset);
        tailset.add(80);
        System.out.println("tailset: "+tailset);
        System.out.println("set: "+set);

        //subset
        SortedSet<Integer> subset=set.subSet(1,79); //second element is exclusive
        System.out.println("subset: "+subset);
        //subset.add(0);  //key out of range



    }

    public static void main(String[] args) {
//        hashSetDemo();
          linkedHashSetDemo();
//            sortedSetDemo();
//            navigableSeDemoo();
//            treeSetDemo();
//        treeSetDemo2();
    }
}
class Books implements Comparable{
    String title;
    String author;
    int year;
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public Books(String title,String author,int year){
        super();
        this.title=title;
        this.author=author;
        this.year=year;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Object book/*previously present one*/) {
        return getTitle()/*new one*/.compareTo(((Books)book/*here book is object which is downcast to Book then applied getTitle on that*/).getTitle());      //utilizing string's compareTo method

    }


/*
    public int hashCode(){
        return title.hashCode();
        //if both title are same then applying hashcode to the title will not allow duplicates
        //set2: [Books{title='u', author='m', year=1}, Books{title='u', author='o', year=2}]
        // but they are represented in linked list so it checks with equals method also
        //in that case we have to overwrite the equals method also
    }
    public boolean equals(Object o){
        return (title==((Books)o).getTitle());//getTitle and downcast to Books Object
        //because of the title.hashCode and equals method on title it will not add the second book
        //because they are same respect to title
    }
    */
}
class TitleComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Books)o1).getTitle().compareTo(((Books)o2).getTitle());
    }
}
