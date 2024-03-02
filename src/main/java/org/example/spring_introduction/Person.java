package org.example.spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private String age;

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public void setAge(String age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

    //pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
    public Person(){
    System.out.println("Person bean is created");
}

//    public Person(Pet pet){
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }
    public void callYourPet(){
        System.out.println("Hello, my lovely Pet");
        pet.say();
    }
}
