package static_keyword_base;

public class Counter {

//      Статические методы отличаются от обычных методов тем,
//      что они также привязаны к классу, а не к объекту.
//      Важным свойством статического метода является то,
//      что он может обращаться только к статическим переменным/методам.
//      В качестве примера рассмотрим класс, в котором у нас будет своего рода счетчик, отслеживающий вызовы методов:
    static int count;

    public static void invokeCounter() {
        count++;
        System.out.println("Current counter value - " + count);
    }

    public static void main(String[] args) {

//      Статический метод можно вызывать без создания экземпляра класса;
        Counter.invokeCounter();
        Counter.invokeCounter();
        Counter.invokeCounter();

    }
}
