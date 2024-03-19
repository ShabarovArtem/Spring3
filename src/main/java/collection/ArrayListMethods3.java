package collection;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(); //создали динамич массив
        arrayList1.add("Artem"); // с помощью add мы добавляем
        arrayList1.add("Egor"); // лучше всегда использовать дженерики <тип данных указываем>
        arrayList1.add("Vlad");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(); //создали динамич массив
        arrayList2.add("!!!"); // с помощью add мы добавляем
        arrayList2.add("???"); // лучше всегда использовать дженерики <тип данных указываем>
        arrayList1.addAll(arrayList2); //addAll добавляет в конец все элементы другого массива
        //arrayList1.addAll(1,arrayList2); //можно указать с какого элемента все добавить
        System.out.println(arrayList1);
        //-------------------------------------------------------------------------------------------------------
//        arrayList1.clear(); //удаляет все элементы массива
//        System.out.println(arrayList1);
        //-------------------------------------------------------------------------------------------------------
        int index = arrayList1.indexOf("Vlad"); //indexOf ищет совпадение, если нашел то присвоит ему индекс который соответсв значению
        // , если не нашёл то индекс -1
        System.out.println(index);
        //-------------------------------------------------------------------------------------------------------
        //lastIndexOf - находит последнее совпадение
        //-------------------------------------------------------------------------------------------------------
        //size() выводит размер
        System.out.println(arrayList1.size()); //в данном случае 5
        //-------------------------------------------------------------------------------------------------------
        //isEmpty() проверяет пуст ли array,да true,нет false
        //contains(Object element) проверяет содержит ли элемент
        System.out.println(arrayList1.contains("Vlad")); //возращает true
        //-------------------------------------------------------------------------------------------------------
        System.out.println(arrayList1.toString()); //тоже самое что и без toString
    }
}
