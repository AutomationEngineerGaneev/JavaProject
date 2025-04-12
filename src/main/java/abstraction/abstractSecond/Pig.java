package abstraction.abstractSecond;

public class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    // Переопределение метода sleep
    @Override
    public void sleep() {
        System.out.println("Override Zzz");
    }

    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
