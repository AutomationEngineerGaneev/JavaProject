package exceptions_base;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
            //finally Оператор позволяет выполнить код независимо от результата:
        }

//        В Java finally блок выполняется всегда, независимо от того, возникло исключение или нет.
//        Блок finally необязателен. И для каждого try блока может быть только один finally блок.

        try {

            // code that generate exception
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
    }

//    В примере мы пытаемся разделить число на 0. Здесь этот код генерирует исключение.
//
//    Для обработки исключения мы поместили код 5 / 0 внутрь try блока. Теперь, когда происходит исключение, остальная часть кода внутри tryблока пропускается.
//
//    Блок catch перехватывает исключение, и выполняются операторы внутри блока catch.
//
//    Если ни один из операторов в try блоке не генерирует исключение, catch блок пропускается.
}
