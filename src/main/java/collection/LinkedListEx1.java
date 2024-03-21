package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
         //создали динамич массив
        Student2 st1 = new Student2("Artem",3); // с помощью add мы добавляем
        Student2 st2 = new Student2("Egor",1); // с помощью add мы добавляем
        Student2 st3 = new Student2("Vlad",1); // с помощью add мы добавляем
        Student2 st4 = new Student2("Sasha",3); // с помощью add мы добавляем
        Student2 st5 = new Student2("Slava",3); // с помощью add мы добавляем

        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println(student2LinkedList);
        System.out.println(student2LinkedList.get(2));

        Student2 st6 = new Student2("Zaur",3); // с помощью add мы добавляем
        Student2 st7 = new Student2("Dima",3); // с помощью add мы добавляем

        student2LinkedList.add(st6);//в конец добавляем
        student2LinkedList.add(1,st6);// под индекс 1 добавляем
        student2LinkedList.remove(3);// удалить

        System.out.println(student2LinkedList);
    }
}
//в массиве если нужно ставить элемент между, то все сбоку двинулись на право, а в LinkedList меняются лишь ссылки, это намного быстрее
class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}