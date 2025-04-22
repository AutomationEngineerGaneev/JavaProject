package abstraction.abstractFirst;

public abstract class Shape {

    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public void getMethodWithSuper() {
        System.out.println("Method with super");
    }

}
