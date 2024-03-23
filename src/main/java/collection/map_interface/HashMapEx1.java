package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();//<1,2> 1 говорит какой будет ключ
        //в нашем случае Integer, значение будет String
        map1.put(1000,"Artem");// put (вместо add) добавить
        map1.put(2568,"Egor");
        map1.put(6789,"Sasha");
        map1.put(123234,"Vlad");
        System.out.println(map1);
        //{123234=Vlad, 6789=Sasha, 1000=Artem, 2568=Egor}
        //Ключи должны быть уникальными, могут быть null, также и со значениями
        map1.put(1000,"Vlad");// если пытаемся записать с ключом, который уже есть, переписывается значение
        System.out.println(map1);//{123234=Vlad, 6789=Sasha, 1000=Vlad, 2568=Egor}
        map1.putIfAbsent(1000,"Oleg");//putIfAbsent если нет, то добавить

        System.out.println(map1.get(1000));//get получить значение по ключу, если ключа нет выведется null
        System.out.println(map1.remove(1000)); //удаляет по ключу

        System.out.println(map1.containsValue("Sasha"));//containsValue проверяет есть ли значение
        System.out.println(map1.containsKey(2568));//containsKey проверяет есть ли ключ

        System.out.println(map1.keySet());//keySet возращает все ключи
        System.out.println(map1.values());//values возращает все значения






    }

}
