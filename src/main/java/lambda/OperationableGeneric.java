package lambda;

interface OperationableGeneric<T> {
    T calculate(T x, T y);
}
