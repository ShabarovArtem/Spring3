package collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(); //создали динамич массив
        arrayList1.add("Artem"); // с помощью add мы добавляем
        arrayList1.add("Egor"); // лучше всегда использовать дженерики <тип данных указываем>
        arrayList1.add("Vlad");
        arrayList1.add(1,"Sasha"); // будет выводиться вторым, нельзя индекс указывать больше чем есть в массиве
        for (String s:arrayList1){
            System.out.println(s + " ");
        }
        System.out.println();
        //-------------------------------------------------------------------------------------------------------------
        ArrayList<Integer> arrayList2 = new ArrayList<>();// примитивный тип данных нельзя, по типу int, вместо него Integer
        arrayList2.add(6);
        for (int i=0;i<arrayList1.size();i++){ //вывод для всех элементов массива
            System.out.println(arrayList1.get(i));// get нужен, чтобы получить данные
        }
        System.out.println(arrayList1.get(2)); // выводит данные под определенным индексом
        arrayList1.set(1,"Masha");  // set нужен, чтобы добавить или заменить значение по заданному индексу
        arrayList1.remove(0); //если найден такой элемент удаляет его, остальные смещаются влево, если не нашел, то возращает false


        System.out.println(arrayList1);
    }
}
