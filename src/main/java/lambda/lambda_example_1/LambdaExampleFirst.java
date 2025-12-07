package lambda.lambda_example_1;

import java.io.IOException;
import java.net.URISyntaxException;

public class LambdaExampleFirst {

    final static String salutation = "Hello! ";

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        GreetingService greetServiceSecond = message -> System.out.println(salutation + message);
        greetServiceSecond.sayMessage("Mahesh");

        LambdaExampleFirst tester = new LambdaExampleFirst();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //without parenthesis
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

//  10 + 5 = 15
//  10 - 5 = 5
//  10 x 5 = 50
//  10 / 5 = 2
//  Hello Mahesh
//  Hello Suresh


}
