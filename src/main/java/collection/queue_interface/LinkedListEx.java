package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Xaur");//добавляет в конец
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Slava");
        System.out.println(queue);

        //если очередь ограничена и заполнена, при add вылез ошибка
        //если offer, то просто не добавилось бы, без ошибки

        queue.remove(); //если не указывать, то удаляет первый, если элементов вообще нет, то будет ошибка
        queue.poll();// также удаляет, но при отсутствии элементов не выдает ошибку, возвращает null
        System.out.println(queue.element());// указывает первый элемент
        System.out.println(queue.peek());// указывает первый элемент, в случае отсутствия не выкидывает ошибку, а null
    }
}
