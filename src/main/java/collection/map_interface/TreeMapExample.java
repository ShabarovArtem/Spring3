package collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Artem","Shabarov",3);
        Student st2 = new Student("Marya","Ivanova",1);
        Student st4 = new Student("Sergey","Spiritov",4);
        Student st5 = new Student("Artem2","Shabarov",3);
        Student st6 = new Student("Mary2","Ivanova",1);
        Student st7 = new Student("Sergey2","Spiritov",4);
        Student st8 = new Student("Sergey2","Spiritov",4);
        treeMap.put(5.8,st1);
        treeMap.put(7.8,st2);
        treeMap.put(3.8,st7);
        treeMap.put(2.8,st4);
        treeMap.put(4.8,st5);
        treeMap.put(6.8,st6);
        treeMap.put(6.6,st8);
        System.out.println(treeMap);//вывод
        System.out.println(treeMap.descendingMap());//по убыванию

        System.out.println(treeMap.tailMap(7.3));//от и выше





    }

}
