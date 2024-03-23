package collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapex {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm =
                new LinkedHashMap<>(16,0.75f,false);
        //размер,заполняемость, способ сортировки, false по добавлению, true по использованию (put, get можно считать за использование)
        Student st1 = new Student("Artem","Shabarov",3);
        Student st2 = new Student("Marya","Ivanova",1);
        Student st3 = new Student("Sergey","Spiritov",4);
        Student st4 = new Student("Artem2","Shabarov",3);

        lhm.put(5.8,st1);
        lhm.put(7.8,st2);
        lhm.put(3.8,st3);
        lhm.put(2.8,st4);

        System.out.println(lhm);// в каком порядке добавили, в таком и выводятся

    }
}
