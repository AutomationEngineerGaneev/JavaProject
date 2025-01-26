package lambda;

import java.io.IOException;
import java.net.URISyntaxException;

public class LambdaExpressionBase {
//    Основу лямбда-выражения составляет лямбда-оператор,
//    который представляет стрелку ->.
//    Этот оператор разделяет лямбда-выражение на две части:
//    левая часть содержит список параметров выражения,
//    а правая собственно представляет тело лямбда-выражения, где выполняются все действия.
//
//    Лямбда-выражение не выполняется само по себе, а образует реализацию метода,
//    определенного в функциональном интерфейсе.
//    При этом важно, что функциональный интерфейс должен содержать только один единственный метод без реализации.

//        Если метод не принимает никаких параметров, то пишутся пустые скобки, например:
//        ()-> 30 + 20;
//
//
//        Если метод принимает только один параметр, то скобки можно опустить:
//        n-> n * n;

//    Лямбда-выражение может использовать переменные,
//    которые объявлены во вне в более общей области видимости - на уровне класса или метода,
//    в котором лямбда-выражение определено. Однако в зависимости от того,
//    как и где определены переменные, могут различаться способы их использования в лямбдах.
//    Рассмотрим первый пример - использования переменных уровня класса:

    static int x = 10;
    static int y = 20;

    public void lambdaOperationPattern() {

        Operation op = () -> {

            x = 30;
            return x + y;
        };
        System.out.println("x + y:" + " " + op.calculate()); // 50
        System.out.println("Значение x изменилось:" + " " + x); // 30 - значение x изменилось
    }
//    Переменные x и y объявлены на уровне класса, и в лямбда-выражении мы их можем получить и даже изменить.
//    Так, в данном случае после выполнения выражения изменяется значение переменной x.


    //   Теперь рассмотрим другой пример - локальные переменные на уровне метода:
    public void lambdaOperationPatternSecond() {

        int n = 70;
        int m = 30;
        Operation op = () -> {

            //n=100; - так нельзя сделать
            return m + n;
        };
        // n=100;  - так тоже нельзя
        System.out.println("m + n:" + " " + op.calculate()); // 100
    }

    public void lambdaOperationPatternThird() {
        Printable printer = s -> System.out.println(s);
        printer.print("Строка:" + " " + "Hello Java!");
    }


    public void lambdaOperationPatternFourth() {

        OperationableGeneric<Integer> operation1 = (x, y) -> x + y;
        OperationableGeneric<String> operation2 = (x, y) -> x + y;

        System.out.println("Integer sum:" + " " + operation1.calculate(20, 10)); //30
        System.out.println("String sum:" + " " + operation2.calculate("20", "10")); //2010

    }

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        LambdaExpressionBase lambdaExpressionBase = new LambdaExpressionBase();

        lambdaExpressionBase.lambdaOperationPattern();
        lambdaExpressionBase.lambdaOperationPatternSecond();
        lambdaExpressionBase.lambdaOperationPatternThird();
        lambdaExpressionBase.lambdaOperationPatternFourth();
    }
}
