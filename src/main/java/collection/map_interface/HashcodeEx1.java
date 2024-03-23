package collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashcodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Artem","Shabarov",3);
        Student st2 = new Student("Marya","Ivanova",1);
        Student st3 = new Student("Sergey","Spiritov",4);

        map.put(st1,7.5); // первое это студент, второе оценка
        map.put(st2,8.5);
        map.put(st3,9.5);

        System.out.println(map);//{Student{name='Artem', surname='Shabarov', course=3}=7.5, Student{name='Marya', surname='Ivanova', course=1}=8.5, Student{name='Sergey', surname='Spiritov', course=4}=9.5}

        Student st4 = new Student("Artem","Shabarov",3);
        boolean result = map.containsKey(st4);//проверка на содержание конкретного студента
        System.out.println(result);// выведется false, если не переопределили hashcode
        //тк некоторые коллекции применяют хеширование, поэтому даже если по equals будут равны, то например для containsKey нет

        System.out.println(st1.hashCode());


        Map<Integer,String> map2 = new HashMap<>(16,0.75f);
        //Initial capacity - начальный размер массива
        //Load factor - коэф того, насколько массив должен быть заполнен, после чего его размер будет увеличен вдвое






    }

}
class Student{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
