import java.util.*;

public class SortElementsByFrequency {
    public static void main(String[] args) {
        int[] array = {4, 2, 4, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5};
        Map<Integer,Integer> m=new HashMap<>();
        for (int i: array){
            if (m.containsKey(i)){
                Integer count=m.get(i);
                m.put(i,++count);
            }else {
                m.put(i,1);
            }
        }
        System.out.println(m);

        final class frequencyComparator implements Comparator<Integer>{
            Map<Integer,Integer> refMap;
            public frequencyComparator(Map<Integer,Integer> base){
                this.refMap=base;
            }

            @Override
            public int compare(Integer o1, Integer o2) {
                Integer v1=refMap.get(o1);
                Integer v2=refMap.get(o2);

                int num=v1.compareTo(v2);
                return num==0?o1.compareTo(o2):num;
            }
        }
        frequencyComparator comp=new frequencyComparator(m);
        Map<Integer,Integer> sortedmap=new TreeMap<>(comp);
        sortedmap.putAll(m);
        System.out.print(m+"\n");
        System.out.println(sortedmap.keySet());

        for (int i: sortedmap.keySet()){
            int frequency=sortedmap.get(i);
            for(int count=1;count<=frequency;count++){
                System.out.print(i+" ");
            }
        }

    }
}
