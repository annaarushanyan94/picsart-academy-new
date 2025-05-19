package am.picsartacademy.oop.homework;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Lady", 4, "Labrador");

        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Breed: " + myDog.getBreed());

    }
}
