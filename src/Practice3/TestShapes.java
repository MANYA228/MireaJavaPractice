package Practice3;

public class TestShapes {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "red", true);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Shape rectangle = new Rectangle(4.0, 6.0, "blue", false);
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
