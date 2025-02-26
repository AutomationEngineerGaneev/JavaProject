package varargs;

public class NoVararg {

//    Varargs — это сокращенное название для переменных аргументов.
//    В Java аргумент метода может принимать произвольное количество значений.
//    Этот аргумент, который может принимать переменное количество значений, называется varargs.

    public int sumNumber(int a, int b){
        return a+b;
    }

    public int sumNumber(int a, int b, int c){
        return a+b+c;
    }

    public static void main( String[] args ) {
        NoVararg obj = new NoVararg();
        System.out.println(obj.sumNumber(1, 2)); // 3
        System.out.println(obj.sumNumber(1, 2, 3));// 6

    }

//    Как вы можете ясно видеть, вам пришлось перегрузить sumNumber() метод, чтобы он работал для 3 аргументов.
}
