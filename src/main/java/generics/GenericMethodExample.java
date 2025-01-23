package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Создали шаблонизированную функцию
 * То есть, класс у нас обычный
 * А функция содержит параметр T - который указывает тип
 *
 */
public class GenericMethodExample
{
    //функция получает список значений некоторого типа
    //и затем возвращает одно значение этого типа
    //взяв первый элемент из этого списка переданного ей в качестве пара-
    //-метра
    public static <T> T getTheFirst(List<T> list)
    {
        return list.get(0);
    }

    public static <T> T getTheSecond(List<T> list)
    {
        return list.get(1);
    }

    public static void main(String[] args)
    {
        //создали список из Integer
        List<Integer> listOfInteger = new ArrayList<Integer>();
        //добавили в него какие-то элементы списка
        listOfInteger.add(0);
        listOfInteger.add(1);
        listOfInteger.add(2);

//        Используем различные методы со списком
        String listFirst = listOfInteger.toString();
        int listSecond = listOfInteger.size();
        String listThird = listOfInteger.toString().replaceAll("1","4");

        System.out.println("1." + listFirst);
        System.out.println("2." + listSecond);
        System.out.println("3." + listThird);

        //получили первый элемент
        //функция вернула нам значение Integer
        Integer intValue = getTheFirst(listOfInteger);
        System.out.println("4." +intValue);

        Integer intSecondValue = getTheSecond(listOfInteger);
        System.out.println("5." +intSecondValue);

        //теперь когда мы создаем список из строк
        List<String> listOfString = new ArrayList<String>();
        //добавляем какие-то элементы в список чтобы он не был пустым
        listOfString.add("Java is the best!");
        //теперь видно что функция вернула значение с типом String
        String stringValue = getTheFirst(listOfString);
        System.out.println("6." +stringValue);

    }
}