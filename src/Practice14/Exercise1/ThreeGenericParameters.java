package Practice14.Exercise1;

public class ThreeGenericParameters<T, V, K> {
    private T firstParameter;
    private V secondParameter;
    private K thirdParameter;

    public ThreeGenericParameters(T firstParameter, V secondParameter, K thirdParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
        this.thirdParameter = thirdParameter;
    }

    public T getFirstParameter() {
        return firstParameter;
    }

    public void setFirstParameter(T firstParameter) {
        this.firstParameter = firstParameter;
    }

    public V getSecondParameter() {
        return secondParameter;
    }

    public void setSecondParameter(V secondParameter) {
        this.secondParameter = secondParameter;
    }

    public K getThirdParameter() {
        return thirdParameter;
    }

    public void setThirdParameter(K thirdParameter) {
        this.thirdParameter = thirdParameter;
    }

    public void displayParameters() {
        System.out.println("First Parameter: " + firstParameter);
        System.out.println("Second Parameter: " + secondParameter);
        System.out.println("Third Parameter: " + thirdParameter);
    }

    public static void main(String[] args) {
        ThreeGenericParameters<Integer, String, Double> example = new ThreeGenericParameters<>(1, "Hello", 3.14);
        example.displayParameters();
    }
}


