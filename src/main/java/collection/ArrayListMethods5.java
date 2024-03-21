package collection;

import java.util.ArrayList;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(); //создали динамич массив
        arrayList1.add("Artem"); // с помощью add мы добавляем
        arrayList1.add("Egor"); // лучше всегда использовать дженерики <тип данных указываем>
        arrayList1.add("Vlad");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(); //создали динамич массив
        arrayList2.add("Egor"); // с помощью add мы добавляем
        arrayList2.add("Vlad"); // лучше всегда использовать дженерики <тип данных указываем>

        //  arrayList1.removeAll(arrayList2); //removeAll удаляет все элементы arrayList2, в arrayList1
        System.out.println(arrayList1); //[Artem]

        //arrayList1.retainAll(arrayList2); //removeAll удаляет все элементы arrayList1, кроме элементов arrayList2
        System.out.println(arrayList1); //[Egor, Vlad]

        boolean result = arrayList1.containsAll(arrayList2);//проверяет на содержание всех элементов
        System.out.println(result);//true
    }
}
