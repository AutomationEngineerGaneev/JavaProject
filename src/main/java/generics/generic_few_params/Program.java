package generics.generic_few_params;

public class Program {

    //    Мы можем также задать сразу несколько универсальных параметров:
    public static void main(String[] args) {
    //  В данном случае тип String будет передаваться на место параметра T, а тип Double - на место параметра S.
        Account<String, Double> acc1 = new Account<String, Double>("354", 5000.87);
        String id = acc1.getId();
        Double sum = acc1.getSum();
        System.out.printf("Id: %s  Sum: %f \n", id, sum);
    }
}
