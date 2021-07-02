package interface1;

public interface Interface {
    //    По умолчанию все поля, описанные в интерфейсе
    //    автоматически являются статическими (static) и неизменными (final).
    //    Все методы и переменные неявно объявляются как public.
    //    Начиная с 8-ой версии Java в интерфейсе можно объявлять static методы,
    //    но они должны включать тело метода.
    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
}


