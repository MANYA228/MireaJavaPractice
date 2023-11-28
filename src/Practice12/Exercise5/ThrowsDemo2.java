package Practice12.Exercise5;

public class ThrowsDemo2 {
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
        ThrowsDemo2 throwsDemo = new ThrowsDemo2();
        throwsDemo.printMessage(null);
    }
}


