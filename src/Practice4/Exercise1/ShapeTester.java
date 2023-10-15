package Practice4.Exercise1;

public class ShapeTester {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape square = new Square(4.0);

        System.out.println("Circle Info:");
        System.out.println(circle);

        System.out.println("\nRectangle Info:");
        System.out.println(rectangle);

        System.out.println("\nSquare Info:");
        System.out.println(square);
    }
}
