package varargs;

public class OverloadingVarargsMethods {

    private void test(int ... args){
        int sum = 0;
        for (int i: args) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    private void test(boolean p, String ... args){
        boolean negate = !p;
        System.out.println("negate = " + negate);
        System.out.println("args.length = "+ args.length);
    }

    public static void main( String[] args ) {
        OverloadingVarargsMethods obj = new OverloadingVarargsMethods();
        obj.test(1, 2, 3);
        obj.test(true, "hello", "world");
//        В приведенной выше программе test() метод перегружается путем изменения количества принимаемых им аргументов.
    }
}
