package lambda;

@FunctionalInterface
interface OperationableGeneric<T> {
    T calculate(T x, T y);
}
