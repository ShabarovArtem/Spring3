package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySerchEx {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100,"Artem",1234);
        Employee emp2 = new Employee(15,"Egor",6542);
        Employee emp3 = new Employee(123,"Vlad",8542);
        Employee emp4 = new Employee(15,"Sasha",125);
        Employee emp5 = new Employee(1250,"Slava",1579);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        System.out.println(employeeList);

        Collections.sort(employeeList); //сортируем, тут нужно явно указывать способ сортировки
        //с помощью compareTo в классе Employee
        Collections.reverse(employeeList);//в обратном порядке
        Collections.shuffle(employeeList);//перемешивает в рандомном порядке
        System.out.println(employeeList);

        int index2 = Collections.binarySearch(employeeList,new Employee(15,"Egor",6542));
        //ищем определенный индекс по значениям
        System.out.println(index2);

        int[]array = {-3,8,12,-8,7,1,150};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if(result==0){
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
