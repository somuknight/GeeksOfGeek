package Collection;

import java.util.*;

public class MapDemo {
    private static void treeMapDemo(){
        System.out.println("inside treeMapDemo...\n");
        TreeMap<String,Integer> map1=new TreeMap<>();
        map1.put("b",2);
        map1.put("a",1);
        map1.put("c",3);
        System.out.println("map1: "+map1);

        System.out.println("iterating using entrySet...\n");
        Set<Map.Entry<String,Integer>> mappings=map1.entrySet();
        for (Map.Entry<String,Integer> mapping:mappings
             ) {
            System.out.println("key: "+mapping.getKey()+",value: "+mapping.getValue());
            if (mapping.getKey().equals("a"))
                mapping.setValue(0);
        }
        System.out.println(map1);   //original map also get affected
//        map1.floorEntry("b").setValue(0); //java.lang.UnsupportedOperationException
        


    }
    private static void lruCacheDemo(){
        System.out.println("inside lruCache Demo...\n");
        Map<String,String> lrucache=new LRUCache<String, String>(16,0.75f,true);
                                                            //if the accessOrder is false it will work as
                                                            //normal LinkedHashMap
                                                            // and if it is true then it will work as
                                                            //LRU-Cache
        lrucache.put("a","A");
        lrucache.put("b","B");
        lrucache.put("c","C");
        System.out.println(lrucache);

        lrucache.get("a");  //multiple gets to "a" will not make any difference
        lrucache.get("a");
        lrucache.get("a");
        System.out.println(lrucache);
        lrucache.get("b");
        System.out.println(lrucache);
        lrucache.put("d","D");
        System.out.println(lrucache);
        lrucache.put("e","E");
        System.out.println(lrucache);       //most recently used item will moved to last as it work
                                                    //as LRU-cache

    }
    private static void hashMapDemo(){
        System.out.println("inside hashMapDemo...\n");
        Map<String,Integer> map1=new HashMap<>();

        map1.put("uma",22);
        map1.put("mau",20);
        map1.put("chumma",null);
        System.out.println("map1: "+map1);
        map1.put("chumma",23);      //value  correspondes chumma key will replaced
        System.out.println("map1: "+map1);

        System.out.println("is contains uma? "+map1.containsKey("uma"));
        System.out.println("uma's age: "+map1.get("uma"));
        System.out.println(map1.size());
        System.out.println(map1.isEmpty());
        System.out.println(map1.remove("chumma"));
        System.out.println(map1);
        map1.put("chumma",22);

        //iterating
        System.out.println("iterating using keySet");
        Set<String> names=map1.keySet();
        for(String name:names){
            System.out.println("name: "+name+",age: "+map1.get(name));
        }
        System.out.println("\n\niterating using entrySet...");
        Set<Map.Entry<String,Integer>>mapping=map1.entrySet();
        for(Map.Entry<String,Integer> mappings:mapping){
            System.out.println("name: "+mappings.getKey()+",age: "+mappings.getValue());
        }
        Map<String,Map<String,Object>> userProfile=new HashMap<>();
        Map<String,Object> profile=new HashMap<>();

        profile.put("age",25);
        profile.put("dept","CS");
        profile.put("location","bangalore");
        userProfile.put("uma",profile);

        profile=new HashMap<>();
        profile.put("age",22);
        profile.put("dept","CS");
        profile.put("location","LA");
        userProfile.put("raj",profile);

        System.out.println("userProfile"+userProfile);
        //retreving
        Map<String,Object> profile1=userProfile.get("uma");
        int age=(Integer) profile1.get("age");
        System.out.println("age: "+age);

        Collection<Integer> test=map1.values();
        System.out.println(test);

        map1.clear();
        System.out.println("map1: "+map1);


    }
    private  static void immutableKeysDemo(){
        System.out.println("inside immutableKeysDemo...\n");
        List<Integer> list=new ArrayList<>();
        list.add(1);

        Map<List<Integer>,Integer> map=new HashMap<>();     //let hashcode1
        map.put(list,1);

        list.add(2);
        System.out.println(map.get(list));  //it will return null hashcode changed and
                                            // i.e. different from above hashcode1
        Student s=new Student("sam",1);
        Map<Student,Integer> map2=new HashMap<>();
        map2.put(s,10);
        System.out.println(map2.get(s)); //memory of objects are same as below
                                            //so they return the same value

        s.setName("uma");
        System.out.println(map2.get(s));





    }
    public static void main(String[] args) {
        //hashMapDemo();
        //immutableKeysDemo();
        //lruCacheDemo();
        treeMapDemo();
    }
}
class Student{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student(String name,int id){
        super();
        this.id=id;
        this.name=name;
    }
}
class LRUCache<K,V> extends LinkedHashMap<K,V>{
    private  static final int MAX_ENTRY=3;
    public LRUCache(int initialCapacity,float loadFactor,boolean accessOrder){
        super(initialCapacity,loadFactor,accessOrder);
    }
    public boolean removeEldestEntry(Map.Entry eldest){
        return size()>MAX_ENTRY;
        //return false //same as normal linked hash map

    }
}
