package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        //первый вариант создания
        ArrayList<String> arrayList1 = new ArrayList<String>(); //создали динамич массив
        arrayList1.add("Artem"); // с помощью add мы добавляем
        arrayList1.add("Egor"); // лучше всегда использовать дженерики <тип данных указываем>
        arrayList1.add("Vlad");
        System.out.println(arrayList1);
        //второй вариант создания
        //ArrayList<String> arrayList2 = new ArrayList<>();
        //третий если заранее знаем примерно размер, увеличив скорость добавления
        ArrayList<String> arrayList2 = new ArrayList<String>(200);
        arrayList2.add("Egor");
        arrayList2.add("Vlad");
        List<String> arrayList3 = new ArrayList<>(); // List имплеминтирует arrayList
        //четвертый, массивы индентичны, но создается новый массив который не ссылается на тот же объект
        ArrayList<String> arrayList4 = new ArrayList<String>(arrayList1);
        System.out.println(arrayList4);
        System.out.println(arrayList1==arrayList4); //false

    }
}
