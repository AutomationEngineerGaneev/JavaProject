package generics;

public class Box<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(10);
        stringBox.add("Hello World");

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }

//    Универсальные классы
//Объявление универсального класса выглядит так же, как объявление неуниверсального класса,
// за исключением того, что за именем класса следует раздел параметров типа.
//
//Как и в случае с общими методами, раздел параметров типа общего класса может иметь
// один или несколько параметров типа, разделенных запятыми. Эти классы известны как параметризованные
// классы или параметризованные типы, поскольку они принимают один или несколько параметров.
}
