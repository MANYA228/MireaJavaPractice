package Practice12;

import java.util.Scanner;
public class Exercise8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter a key: ");
                String key = myScanner.next();
                printDetails(key);
                break; // если ввод корректен, выходим из цикла
            } catch (Exception e) {
                System.out.println("Exception caught in getKey: " + e);
                myScanner.nextLine(); // очистка буфера ввода
            }
        }
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Exception caught in printDetails: " + e);
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to an empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Exercise8 throwsDemo = new Exercise8();
        throwsDemo.getKey();
    }
}
