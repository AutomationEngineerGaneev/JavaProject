package super_keyword;

public class Dog extends AnimalSuper {

    int maxSpeed = 180;

    public void animalSound() {
        super.animalSound(); // Call the superclass method
        System.out.println("The dog says: bow wow");
    }

    public void display() {
        // print maxSpeed from the AnimalSuper class
        // using super
        System.out.println("Maximum Speed: "
                + super.maxSpeed);
    }

    public static void main(String[] args) {
        AnimalSuper myDog = new Dog(); // Create a Dog object
        myDog.animalSound(); // Call the method on the Dog object

        Dog myDogSecond = new Dog(); // Create a Dog object
        // объявление ссылки на объект Dog myDogSecond -> // выделение памяти
        // для объекта типа Dog и присвоение значения ссылке new Dog()

        myDogSecond.display(); // Call the method on the Dog object
    }
}
