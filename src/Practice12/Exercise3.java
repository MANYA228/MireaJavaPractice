package Practice12;

import java.util.Scanner;
    public class Exercise3 {
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
            }
        }

        public static void main(String[] args) {
            Exercise3 exception3 = new Exercise3();
            exception3.exceptionDemo();
        }
    }

