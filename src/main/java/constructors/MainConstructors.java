package constructors;

public class MainConstructors {

    private String name;

    // constructor
    MainConstructors() {
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public static void main(String[] args) {

        // constructor is invoked while
        // creating an object of the Main class
        MainConstructors obj = new MainConstructors();
        System.out.println("The name is " + obj.name);
    }

//    В приведенном выше примере мы создали конструктор с именем MainConstructors().
//
//    Внутри конструктора мы инициализируем значение name переменная.
//
//    Обратите внимание на утверждение, создающее объект основного класса.


//    Здесь, когда объект создается, называется конструктор Main (). И значение переменной name инициализируется.
//    Следовательно, программа печатает значение переменных name в качестве Programiz.
}
