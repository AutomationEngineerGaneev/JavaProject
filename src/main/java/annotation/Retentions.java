package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//Чтобы ограничить область применения аннотации,
// используется аннотация @Target, которая определяет, где её можно применять:
@Target(value= ElementType.FIELD)
//@Target() — эта аннотация описывает, где вы можете применить свою собственную аннотацию.
// Он принимает перечисление ElementType в качестве единственного аргумента, но можно его и не указывать.
// Поскольку мы хотим, чтобы аннотация была действительна только для классов, мы будем использовать TYPE.
// Кроме того, мы можем передать несколько ElementTypes, например @Target({ElementType.TYPE, ElementType.METHOD}).
@Retention(value= RetentionPolicy.RUNTIME)
//@Retention() — эта аннотация используется для определения того, на каком уровне аннотация будет храниться с помощью
// политик хранения. В 99% случаев мы используем RetentionPolicy.RUNTIME. Это сохраняет аннотацию доступной на
// протяжении всего фактического выполнения программы.
public @interface Retentions {
    String name();
    String type();
}

//Аннотация @Target задаёт следующие области применения:
//
//@Target(ElementType.PACKAGE) – для пакетов;
//@Target(ElementType.TYPE) – для классов;
//@Target(ElementType.CONSTRUCTOR) – для конструкторов;
//@Target(ElementType.METHOD) – для методов;
//@Target(ElementType.FIELD) – для полей (переменных) класса;
//@Target(ElementType.PARAMETER) – для параметров метода;
//@Target(ElementType.LOCAL_VARIABLE) – для локальных переменных;
//@Target(ElementType.ANNOTATION_TYPE) - для аннотирования других аннотаций, как, например, @Target и @Retention.


//Помимо @Target, существуют и другие аннотации для настройки поведения аннотаций:
//
//@Retention определяет, на каком этапе жизненного цикла программы аннотация будет доступна:
//
//SOURCE - аннотация доступна только в исходном коде и удаляется при компиляции;
//CLASS - аннотация сохраняется в .class файле, но недоступна во время выполнения программы;
//RUNTIME - аннотация сохраняется в .class файле и доступна во время выполнения программы.
