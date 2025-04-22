package abstraction.abstractFirst;

public class Circle extends Shape {

    private double radius;

//    Ключевое слово super в Java используется тогда,
//    когда подклассу (Circle) требуется сослаться на его непосредственный супер класс (Shape).
    public Circle(int x, int y, double radius) {
        super(x, y); //слово super() всегда должно стоять в конструкторе первым!
//        Для вызова конструктора супер класса. В этом случае после super мы используем круглые скобки,
//        в которых мы передаём список аргументов в наш суперкласс:
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //    И второй вариант используется для обращения к переменным либо методам суперкласса,
//    чаще всего скрываемыми членами подкласса:
    public void getMethodWithSuper() {
        super.getMethodWithSuper(); // Call the superclass method
        System.out.println("Display");
    }


    public static void main(String[] args) {

        Circle circle = new Circle(3,4,5);

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
