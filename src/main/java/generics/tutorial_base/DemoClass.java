package generics.tutorial_base;

public class DemoClass {


//  Метод обобщений Java
//  Подобно классу generics, мы также можем создать метод,
//  который может использоваться с любым типом данных. Такой класс известен как Generics Method.
//
//  Вот как можно создать универсальный метод в Java:
//
//  Пример: создание универсального метода
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }

    public static void main(String[] args) {

        // initialize the class with Integer data
        DemoClass demo = new DemoClass();

        // generics method working with String
        demo.<String>genericsMethod("Java Programming");

        // generics method working with integer
        demo.<Integer>genericsMethod(25);
    }

//    В приведенном выше примере мы создали универсальный метод с именем genericMethod.
//
//    public <T> void genericMethod(T data) {...}
//    Здесь параметр типа <T> вставляется после модификатора public и перед возвращаемым типом void.
//
//    Мы можем вызвать метод generics, поместив фактический тип <String> в <Integer> скобки перед именем метода.


//    Примечание: Мы можем вызвать метод generics, не включая параметр типа. Например,
//
//      demo.genericsMethod("Java Programming");
//      В этом случае компилятор может сопоставить параметр типа на основе значения, переданного методу.
}
