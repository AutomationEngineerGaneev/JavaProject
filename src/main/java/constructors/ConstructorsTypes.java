package constructors;

public class ConstructorsTypes {

//      Типы конструкторов
//      В Java конструкторы можно разделить на три типа:
//
//   1. Конструктор без аргументов
//   2. Параметризованный конструктор
//   3. Конструктор по умолчанию


//   1. Конструктор без аргументов


//    public ConstructorsTypes() {
//        // body of the constructor
//    }


//    В приведенном выше примере мы создали конструктор Main().
//Здесь конструктор не принимает никаких параметров. Поэтому он называется конструктором без аргументов.
//Обратите внимание, что мы объявили конструктор закрытым.
//После объявления конструктора private к нему нельзя получить доступ извне класса.
//Таким образом, создание объектов вне класса с использованием закрытого конструктора запрещено.
//Здесь мы создаем объект внутри того же класса.
//Следовательно, программа может получить доступ к конструктору. Чтобы узнать больше,
// посетите Java Implement Private Constructor.

//    Однако если мы хотим создавать объекты вне класса, то нам необходимо объявить конструктор как public.

//    public ConstructorsTypes() {
//    name = "Programiz";
//  }

//    public static void main(String[] args) {
//
//    // object is created in another class
//    ConstructorsTypes obj = new ConstructorsTypes();
//    System.out.println("ConstructorsTypes name = " + obj.name);
//  }

//    2. Параметризованный конструктор Java

//    String languages;
//
//    // constructor accepting single value
//    public ConstructorsTypes(String lang) {
//        languages = lang;
//        System.out.println(languages + " Programming Language");
//    }

//    public static void main(String[] args) {
//
//        // call constructor by passing a single value
//        ConstructorsTypes obj1 = new ConstructorsTypes("Java");
//        ConstructorsTypes obj2 = new ConstructorsTypes("Python");
//        ConstructorsTypes obj3 = new ConstructorsTypes("C");
//    }


//    3. Конструктор Java по умолчанию

//    Если мы не создадим ни одного конструктора, компилятор Java автоматически создаст конструктор
//    без аргументов во время выполнения программы.
//
//    Этот конструктор называется конструктором по умолчанию.

//    int a;
//    boolean b;
//
//    public static void main(String[] args) {
//
//        // calls default constructor
//        ConstructorsTypes obj = new ConstructorsTypes();
//
//        System.out.println("Default Value:");
//        System.out.println("a = " + obj.a);
//        System.out.println("b = " + obj.b);
//    }
//

}
