package generics;


/**
 * Создали дженерик-класс
 * Функция содержит параметр T - который указывает тип
 */
public class AccountExample<T> {


//   С помощью буквы T в определении класса class Account<T> мы указываем,
//   что данный тип T будет использоваться этим классом.
//   Параметр T в угловых скобках называется универсальным параметром,
//   так как вместо него можно подставить любой тип.
//   При этом пока мы не знаем, какой именно это будет тип: String, int или какой-то другой.
//   Причем буква T выбрана условно, это может и любая другая буква или набор символов.
//
//   После объявления класса мы можем применить универсальный параметр T: так далее в классе объявляется
//   переменная этого типа, которой затем присваивается значение в конструкторе.

    //объявляем переменную некоторого типа T
    private T id;
    private int sum;

    public AccountExample(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public static void main(String[] args) {

//     T id;  T - это String
//     int sum;  String не учитывается в этой(sum) переменной
        AccountExample<String> acc1 = new AccountExample<String>("2345", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        //     T id;  T - это Integer id и sum -Integer
        AccountExample<Integer> acc2 = new AccountExample<Integer>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }
}
