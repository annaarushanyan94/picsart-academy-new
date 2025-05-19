package am.picsartacademy.oop.homework;
import am.picsartacademy.oop.homework.Animal;

public class Dog extends Animal {
    private String breed;

    //Constructor
    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed=breed;
    }
    //Getter & Setter for breed
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
      public void bark(){
          System.out.println(getName() + "is barking");
      }
}