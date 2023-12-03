package Practice14.Exercise3;

import java.io.Serializable;

public class ThreeGenericParameters<T extends Comparable<T>, V extends Animal & Serializable, K> {
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

    public void displayParameterTypes() {
        System.out.println("Type of First Parameter: " + firstParameter.getClass().getName());
        System.out.println("Type of Second Parameter: " + secondParameter.getClass().getName());
        System.out.println("Type of Third Parameter: " + thirdParameter.getClass().getName());
    }

    public static void main(String[] args) {
        ThreeGenericParameters<Integer, Animal, String> example = new ThreeGenericParameters<>(1, new Animal(), "example");
        example.displayParameterTypes();
    }
}

