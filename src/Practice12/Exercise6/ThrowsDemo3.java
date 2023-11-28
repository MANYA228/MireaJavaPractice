package Practice12.Exercise6;

public class ThrowsDemo3 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Exception caught in printMessage: " + e);
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo3 throwsDemo = new ThrowsDemo3();

        try {
            // Вызов с правильным значением для ключа
            throwsDemo.printMessage("validKey");
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e);
        }

        try {
            // Вызов с нулем в ключе
            throwsDemo.printMessage(null);
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e);
        }
    }
}
