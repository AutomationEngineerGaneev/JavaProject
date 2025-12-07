package if_else_base;

import java.util.Scanner;

public class ConditionClass {

//    Тернарный оператор
//    Что делает: сокращает условную конструкцию if-else до одной строчки.

    public static void main(String[] args) {
        
        // take input from users
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = input.nextDouble();

        // ternary operator checks if
        // marks is greater than 40
        String result = (marks > 40) ? "pass" : "fail";

        System.out.println("You " + result + " the exam.");
        input.close();
    }
}
