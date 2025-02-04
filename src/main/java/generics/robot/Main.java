package generics.robot;

public class Main {

//    public static void main(String[] args) {
//
//
//        Body body = new Body();
//
//        SmallHead smallHead = new SmallHead();
//        MediumHead mediumHead = new MediumHead();
//        BigHead bigHead = new BigHead();
//
//        Robot robot = new Robot(body, smallHead);
//
////        robot.getHead().
//
//    }


    public static void main(String[] args) {

        Body body = new Body();

        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();

        Leg leg = new Leg();

        //1. Указываем параметр с маленькой головой
//        SmallHead (тип) передаем внутрь класса Robot в качестве параметра

//        и эти параметры присваиваются к тем полям,
//        которые используются в классе Robot (в методе или в конструкторе)
//        Robot<SmallHead> robot = new Robot<SmallHead>(body, smallHead);
//        Robot<BigHead> robot2  = new Robot<>(body, bigHead);



//        2. Когда у нас стоит здесь чистая параметризация, мы сюда можем положить все что угодно
//        И чтобы как-то ограничить вот этот набор, принимаемых объектов, используется ключевое слово extends
//        Выделяется красным цветом после ввода public class Robot <T extends Head> {
//        Robot robot4 = new Robot(body, leg);

//        3. Мы можем сейчас использовать только те классы, которые наследуются от Head
//        Robot robot4 = new Robot(body, mediumHead);
//        robot.getHead().burn();
//        robot2.getHead().turn();

//        4. Мы не можем присвоить данные одной ссылки к другой
//        robot = robot1;


//        5. Robot robot5 = new Robot(body, smallHead);
//      Наследуется от HEAD в методе foo;
//        Так неправильно foo(smallHead,mediumHead) потому что <SmallHead, SmallHead>
//        robot5.<SmallHead, SmallHead>foo(smallHead,mediumHead);
//        и возвращает голову b;
//        robot5.<SmallHead, SmallHead>foo(smallHead,smallHead);

//        6.
//        Robot<SmallHead> robot = new Robot(body, smallHead);


//        Сырой Тип

//        Когда мы не указываем параметризацию,
//        все равно параметр этот подставится, Например Object (компиллятор все равно что-то должен выставить)
//         Robot robot3 = new Robot(body, mediumHead);
//
//         robot3 = robot;
//         robot3 = robot2;

//        присваивание ссылок


    }

}
