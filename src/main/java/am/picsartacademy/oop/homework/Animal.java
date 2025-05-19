package am.picsartacademy.oop.homework;

public class Animal {
    private String name;
    private int age;

    //Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    //Behavior method
    public void eat(){
        System.out.println(name + " is eating");
    }

}
