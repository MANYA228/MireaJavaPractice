package Practice12.Exercise5;

public class ThrowsDemo1 {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        // do something with the key
    }

    public static void main(String[] args) {
        ThrowsDemo1 throwsDemo = new ThrowsDemo1();
        try {
            throwsDemo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}

