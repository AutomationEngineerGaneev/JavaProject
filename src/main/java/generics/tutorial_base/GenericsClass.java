package generics.tutorial_base;

public class GenericsClass <T> {


//    Класс Java Generics
//Мы можем создать класс, который можно использовать с любым типом данных. Такой класс называется Generics Class.
//
//Вот как можно создать универсальный класс в Java:
//
//Пример: создание универсального класса

//    В приведенном выше примере мы создали универсальный класс с именем GenericsClass.
//    Этот класс можно использовать для работы с любым типом данных.

    // variable of T type
    private T data;

    public GenericsClass(T data) {
        this.data = data;
    }

    // method that return T type variable
    public T getData() {
        return this.data;
    }


    public static void main(String[] args) {

        // initialize generic class
        // with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        // initialize generic class
        // with String data
        GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());
    }


//    Здесь,Т используемый внутри угловой скобки <> указывает на параметр типа.
//    Внутри main метода мы создали два объекта GenericsClass
//
//intObj- Здесь параметр типаТзаменяется на Integer. Теперь,GenericsClassработает с целочисленными данными.
//stringObj- Здесь параметр типаТзаменяется на String. Теперь,GenericsClassработает со строковыми данными.
}
