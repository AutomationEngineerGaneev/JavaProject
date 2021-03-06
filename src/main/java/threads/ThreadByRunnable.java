package threads;

public class ThreadByRunnable implements Runnable {
    @Override
    public void run() {
        int[] Numb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : Numb) {
            System.out.println("Number" + " " + i);
        }
    }

    public static void main(String[] args) {
        Thread new_one = new Thread(new ThreadByRunnable()); //Создание потока new_one
        Thread new_two = new Thread(new ThreadByRunnable()); //Создание потока new_two
        new_one.start(); //Запуск потока
        new_two.start(); //Запуск потока
    }

}
