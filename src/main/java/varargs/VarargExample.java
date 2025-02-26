package varargs;

public class VarargExample {


//    Рассмотрим следующий псевдокод:
//
//public int sumNumber(int ... nums) {
//    // тело метода
//}
//Синтаксис ...сообщает компилятору Java, что метод может быть вызван с нулевым
// или большим количеством аргументов. В результате,числа переменная неявно объявлена как массив типа int[ ].
// Таким образом, внутри метода,числа Доступ к переменной осуществляется с использованием синтаксиса массива.
//В случае отсутствия аргументов, продолжительность числа равно 0.


//    accessModifier methodName(datatype… arg) {
//    // method body
//}


//    Здесь sumNumber() метод возвращает сумму int переданных
//    ему параметров (не имеет значения количество переданных аргументов).
    public int sumNumber(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }

    public static void main( String[] args ) {
        VarargExample ex = new VarargExample();

        int sum2 = ex.sumNumber(2, 4);    //        argument length: 2
        System.out.println("sum2 = " + sum2);    //        sum2 = 6


        int sum3 = ex.sumNumber(1, 3, 5); //  argument length: 3
        System.out.println("sum3 = " + sum3);    //          sum3 = 9


        int sum4 = ex.sumNumber(1, 3, 5, 7);  //   argument length: 4
        System.out.println("sum4 = " + sum4);        //   sum4 = 16
    }
}
