package collection;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");// ArrayList ОДИН ИЗ ПРЕДСТАВИТЕЛЕЙ List
        StringBuilder sb2 = new StringBuilder("B");//StringBuilder вместо стринг,тк стринг сам не меняется, нужно было бы создавать новую переменную
        //к которой присваивалась измененная строка. Используя StringBuilder мы не создаем лишних переменных, и ещё не страдает скорость
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder [] array = {sb1,sb2,sb3,sb4};
        List<StringBuilder> list = Arrays.asList(array);//с помощью asList мы получаем list из массива
        //тк мы сделали list, длину его мы изменить не можем
        //этот list очень тесно связан с array, при его изменении меняется и list
        System.out.println(list);
        array[0].append("!!!");// append добавляет значение, тем самым изменяя его
        System.out.println(list);// если мы выведем то list изменится [A!!!, B, C, D]
        array[0] = new StringBuilder("F");
        System.out.println(list);//list также изменится [F, B, C, D]
    }
}
