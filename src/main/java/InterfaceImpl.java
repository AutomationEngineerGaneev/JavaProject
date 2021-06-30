public class InterfaceImpl implements Interface {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }

    public static void main(String[] args) {
        InterfaceImpl myPig = new InterfaceImpl();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }

}
