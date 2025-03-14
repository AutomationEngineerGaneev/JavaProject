package generics.tutorial_base;

public class GenericsClassNumber <T extends Number> {

    public void display() {
        System.out.println("This is a bounded type generics class.");
    }

    public static void main(String[] args) {

        // create an object of GenericsClass
//        GenericsClass<String> obj = new GenericsClass<>();


//        GenericsClass<String> obj = new GenericsClass<>();
//                                                 ^
//    причина: выводимая переменная T имеет несовместимые границы
//      ограничения равенства: строка
//      нижние границы: Число
//      где T — переменная типа:
//      T расширяет Number, объявленный в классе GenericsClass
    }


//    Ограниченные типы
//В общем случае параметр типа может принимать любые типы данных (кроме примитивных типов).
//Однако если мы хотим использовать универсальные типы только
// для некоторых конкретных типов (например, принимать данные числовых типов),
// то мы можем использовать ограниченные типы.
//
//В случае связанных типов мы используем extends ключевое слово. Например, <T extends A>
//Это означает Т может принимать только данные, которые являются подтипами А.

//    В приведенном выше примере мы создали класс с именем GenericsClass. Обратите внимание на выражение, обратите внимание на выражение
//
//<T extends Number>
//Здесь, GenericsClass создается с ограниченным типом.
// Это означает, что GenericsClass может работать только с типами данных,
// которые являются дочерними по отношению к Number(Integer, Double, и т. д.).
//
//Однако мы создали объект класса generics с String. В этом случае мы получим следующую ошибку.

}
