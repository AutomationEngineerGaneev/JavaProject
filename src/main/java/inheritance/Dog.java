package inheritance;

public class Dog extends Animal {
    private String modelName = "Mustang";
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
    //Для обращения к переопределенному методу eat() своего класса
    // используется вызов this.eat() в методе thisEat.
    public void thisEat() {
        this.eat();
    }



    // Но, чтобы обратиться из наследника Dog к методу eat() базового класса Animal
    // используется вызов super.eat() в методе superEat.
    public void superEat() {
        super.eat();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        Dog dog1 = new Dog();
        dog1.superEat();
        Dog dog3 = new Dog();
        dog3.thisEat();
    }
}
