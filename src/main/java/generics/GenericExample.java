package generics;

public class GenericExample<T> {

        //объявляем переменную некоторого типа T
        private T value;
        //определяем метод который принимает параметр value имеющий тип,
        //который java возьмет из переменной T
	public GenericExample(T value)
        {
            this.value = value;
        }

        //определяем метод который будет возвращать значение имеющее тип T
        public T getT ()
        {
            return value;
        }

        //а это функция для теста
        public static void main(String[] args)
        {
            //создаем экземпляр нашего текущего класса
            //и указываем параметром этого класса значение типа Integer
            //в конструктор передаем число 1
            //при этом поле value нашего класса будет иметь типа Integer;
            //поле value получит значение 1;
            //метод getT будет возвращать значение типа Integer
            //и вернет единицу, когда мы вызовем его
            GenericExample<Integer> intObj = new GenericExample<Integer>(1);
            Integer valueInteger = intObj.getT();
            //выводим полученное значение в консоль
            System.out.println(valueInteger);
            //теперь то же самое проделаем для типа String
            //как видите все прекрасно работает,
            //А именно, мы передали параметр другого типа,
            //но значение установлено и хранится в объекте
            //а методы правильно обработали данные и вернули результат
            //хотя тип совсем другой
            //это круто!! :)
            GenericExample<String> strObj = new GenericExample<String>("world");
            String valueString = strObj.getT();
            System.out.println(valueString);
        }
}
