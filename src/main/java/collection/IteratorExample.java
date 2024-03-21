package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(); //создали динамич массив
        arrayList1.add("Artem"); // с помощью add мы добавляем
        arrayList1.add("Egor"); // лучше всегда использовать дженерики <тип данных указываем>
        arrayList1.add("Vlad");
        arrayList1.add("Sasha");
        arrayList1.add("Slava");

        Iterator<String> iterator = arrayList1.iterator();//с помощью этого можем пробежаться по элементам
        while(iterator.hasNext()){ //iterator.hasNext() проверяет есть ли элемент
            System.out.println(iterator.next()); //iterator.next() след элемент
        }
        //различие между итератором и for является то, что с помощью итератора можно удалить элемент коллекции
        while(iterator.hasNext()){ //iterator.hasNext() проверяет есть ли элемент
            iterator.next(); //iterator.next() след элемент, без него не будет удаляться
            iterator.remove(); //удаляем элемент
        }
        System.out.println(arrayList1);



    }

}
