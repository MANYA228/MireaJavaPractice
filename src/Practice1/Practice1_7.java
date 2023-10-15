public class Practice1_7 {
    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
