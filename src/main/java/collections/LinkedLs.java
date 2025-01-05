package collections;

import java.util.LinkedList;

public class LinkedLs {
    public static void main(String[] args) {
        LinkedList<Integer> cars = new LinkedList<>();
        cars.add(1);
        cars.add(2);
        cars.add(3);
        cars.add(4);
        System.out.println("1." + cars);

        // Use getFirst() to display the first item in the list
        System.out.println("2." + cars.getFirst());
        cars.removeFirst();
        System.out.println("3." + cars);
        // Use addFirst() to add the item to the beginning
        cars.addFirst(0);
        System.out.println("4." + cars);
        // Use addLast() to add the item to the end
        cars.addLast(5);
        System.out.println("5." +cars);
//        Однонаправленная очередь работает по принципу FIFO (first-in-first-out),
//        согласно которому новые элементы размещаются в хвосте очереди,
//        а операции извлечения получают элементы из головы очереди.

        LinkedList<String> cars2 = new LinkedList<String>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mazda");
        System.out.println("6." + cars2);

        cars2.addFirst("Mazda Second");
        System.out.println("7." + cars2);

        // Use addLast() to add the item to the end
        cars2.addLast("Audi");
        System.out.println("8." + cars2);

        // Use removeFirst() remove the first item from the list
        cars2.removeFirst();
        System.out.println("9." + cars2);

        // Use removeLast() remove the last item from the list
        cars2.removeLast();
        System.out.println("10." + cars2);

        // Use getFirst() to display the first item in the list
        System.out.println("11." + cars2.getFirst());
        System.out.println("12." + cars2.getLast());
    }
}
