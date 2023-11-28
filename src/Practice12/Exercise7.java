package Practice12;

import java.util.Scanner;
public class Exercise7 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Exercise7 throwsDemo = new Exercise7();
        try {
            throwsDemo.getKey();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e);
        }
    }
}

