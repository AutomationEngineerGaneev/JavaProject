package collections;

import java.util.LinkedList;

public class LinkedLs {
    public static void main(String[] args) {
        LinkedList<Integer> cars = new LinkedList<>();
        cars.add(1);
        cars.add(2);
        cars.add(3);
        cars.add(4);
        System.out.println(cars);

        // Use getFirst() to display the first item in the list
        System.out.println(cars.getFirst());
        cars.removeFirst();
        System.out.println(cars);
        // Use addFirst() to add the item to the beginning
        cars.addFirst(0);
        System.out.println(cars);
        // Use addLast() to add the item to the end
        cars.addLast(5);
        System.out.println(cars);
//        Однонаправленная очередь работает по принципу FIFO (first-in-first-out),
//        согласно которому новые элементы размещаются в хвосте очереди,
//        а операции извлечения получают элементы из головы очереди.

    }
}
