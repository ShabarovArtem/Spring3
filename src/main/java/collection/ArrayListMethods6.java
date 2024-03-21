package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods6 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(); //создали динамич массив
        arrayList1.add("Artem"); // с помощью add мы добавляем
        arrayList1.add("Egor"); // лучше всегда использовать дженерики <тип данных указываем>
        arrayList1.add("Vlad");
        arrayList1.add("Sasha");
        arrayList1.add("Slava");
        System.out.println(arrayList1);
        List<String> myList = arrayList1.subList(1,4);//subList включает отрывок, первый индекс включительно, последний нет
        System.out.println(myList);//[Artem, Egor, Vlad, Sasha, Slava]
                                    //[Egor, Vlad, Sasha]
        //myList при этом не является отдельной сущностью! Это все те же элементы в массиве
        myList.add("Fedor");
        System.out.println(arrayList1);// [Artem, Egor, Vlad, Sasha, Fedor, Slava], то есть меняется myList и arrayList1
//-------------------------------------------------------------------------------------------------------
        Object[] array = arrayList1.toArray();//toArray нужен, чтоб массив array будет содержать все элементы arrayList1, но тип Object
        String[] array2 = arrayList1.toArray(new String[5]);//для того чтобы получить тип String
        for (String s:array2){
            System.out.println(s);
        }
        //если указать больше индексов new String[7] например, то в оставшиеся индексы присвоили null
        //-------------------------------------------------------------------------------------------------------
        List<Integer> list1 = List.of(3,8,13);
        System.out.println(list1);//[3, 8, 13] создали лист, его изменять нельзя и не могут содержать null

        List<String> list2 = List.copyOf(arrayList1);//копирует и создает лист, его изменить нельзя и не могут содержать null
        System.out.println(list2);

    }
}
