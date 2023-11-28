package Practice12.Exercise4;

import java.util.Scanner;
public class Exercise4_1 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void main(String[] args) {
        Exercise4_1 exception4 = new Exercise4_1();
        exception4.exceptionDemo();
    }
}
