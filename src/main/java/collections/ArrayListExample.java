package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public void arraysExample() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println("1." + cars);
        System.out.println("2." + cars.size());
        System.out.println("3." + cars.get(0));

        cars.set(0, "Opel");
        System.out.println("4." + cars);

        Collections.sort(cars);  // Sort cars
//        Collections класс, включающий sort()метод сортировки списков по алфавиту или по номерам:
        for (String i : cars) {
            System.out.println("5." + i);
        }

        cars.remove(0);
        System.out.println("6." + cars);

        cars.clear();
        System.out.println("7." + cars);

        ArrayList<String> cars2 = new ArrayList<>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");

// Insert element at the beginning of the list (0)
        cars2.add(0, "Mazda");
        System.out.println("8." + cars2);

        ArrayList<String> cars3 = new ArrayList<String>();
        cars3.add("Volvo");
        cars3.add("BMW");
        cars3.add("Ford");
        cars3.add("Mazda");
        for (int i = 0; i < cars3.size(); i++) {
            System.out.println("9." + cars3.get(i));
        }
    }
//    Отличие двух коллекций ArrayList и LinkedList связано со способом хранения данных.
//    Реализация ArrayList хранит элементы в виде массива, а LinkedList - в виде списка (двунаправленного).
//    Кроме этого, в ArrayList быстрее выполняется сортировка, поскольку для ее выполнения данные списка
//    копируются в массив, а копировать из массива ArrayList в массив для сортировки быстрее.
//    При большом количестве операций добавления и удаления элементов в коллекцию LinkedList должен быть более приемлемым,
//    т.к. при этих операциях не приходится перемещать части массива


    public void arraysExamplePlays() {
        //creating ArrayList of string type
        ArrayList<String> arrList = new ArrayList<>();

        //adding few elements
        arrList.add("Cricket"); //list: ["Cricket"]
        arrList.add("Hockey"); //list: ["Cricket", "Hockey"]

        //inserting element at first position, index 0
        //represents first element because ArrayList is based
        //on zero based indexing system
        arrList.add(0, "BasketBall"); //list: ["BasketBall", "Cricket", "Hockey"]
        System.out.println("Elements: " + arrList);

        System.out.println("ArrayList Elements: ");
        //Traversing ArrayList using enhanced for loop
        for (String str : arrList)
            System.out.println(str);
//      arrList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.arraysExample();
        arrayListExample.arraysExamplePlays();
    }
}
