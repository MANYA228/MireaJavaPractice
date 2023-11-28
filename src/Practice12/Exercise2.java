package Practice12;

import java.util.Scanner;
public class Exercise2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Please enter a non-zero integer.");
        }
    }
    public static void main(String[] args) {
        Exercise2 exception2 = new Exercise2();
        exception2.exceptionDemo();
    }
}
