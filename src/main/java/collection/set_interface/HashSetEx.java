package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Artem");
        hashSet.add("Oleg");
        hashSet.add("Marina");
        hashSet.add("Igor");
        hashSet.add("Igor");//HashSet не содержит дубликаты, поэтому просто не добавит второй раз

        for (String s :hashSet){
            System.out.println(s);
        }
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(2);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(3);

        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);



    }
}
