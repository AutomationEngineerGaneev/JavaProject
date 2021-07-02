package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLs {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Mazda");

        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.get(0));

        cars.set(0, "Opel");
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);

        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
        cars.clear();
        System.out.println(cars);
    }
//    Отличие двух коллекций ArrayList и LinkedList связано со способом хранения данных.
//    Реализация ArrayList хранит элементы в виде массива, а LinkedList - в виде списка (двунаправленного).
//    Кроме этого, в ArrayList быстрее выполняется сортировка, поскольку для ее выполнения данные списка
//    копируются в массив, а копировать из массива ArrayList в массив для сортировки быстрее.
//    При большом количестве операций добавления и удаления элементов в коллекцию LinkedList должен быть более приемлемым,
//    т.к. при этих операциях не приходится перемещать части массива
}
