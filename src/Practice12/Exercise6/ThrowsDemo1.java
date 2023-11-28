package Practice12.Exercise6;

public class ThrowsDemo1 {
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
        ThrowsDemo1 throwsDemo = new ThrowsDemo1();

        // Вызов с правильным значением для ключа
        throwsDemo.printMessage("validKey");

        // Вызов с нулем в качестве значения
        throwsDemo.printMessage(null);
    }
}

