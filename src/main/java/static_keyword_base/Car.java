package static_keyword_base;

public class Car {

    //    Например, у нас есть класс Car с нестатической переменной:
    int km;

    static int km_1;

    public static void main(String[] args) {

        //    Как видим, у каждого объекта своя переменная, изменение которой происходит только для этого объекта.

        Car orangeCar = new Car();
        orangeCar.km = 100;

        Car blueCar = new Car();
        blueCar.km = 85;

        System.out.println("Orange car - " + orangeCar.km);
        System.out.println("Blue car - " + blueCar.km);  // Orange car - 100  Blue car - 85



        //    Ну а если у нас переменная статическая, то это глобальное значение — одно для всех:

        //    Теперь мы имеем Car со статической переменной:

        km_1 = 100;
        km_1 = 85;

        System.out.println("Orange car - " + Car.km_1);
        System.out.println("Blue car - " + Car.km_1);  // Orange car - 85  Blue car - 85

//       Ведь переменная у нас одна на всех, и каждый раз мы меняем именно ее.
//       К статическим переменным, как правило обращаются
//       не по ссылке на объект — orangeCar.km_1, а по имени класса — Car.km_1
    }
}
