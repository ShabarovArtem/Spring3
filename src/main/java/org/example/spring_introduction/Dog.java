package org.example.spring_introduction;

public class Dog implements Pet{
    public Dog() {
        System.out.println("Cat bean is created");
    }
    @Override
    public void say() {
        System.out.println("Gav");

    }
}
