package Practice4.Exercise8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "Red", true);
        Shape rectangle = new Rectangle(3.0, 4.0, "Blue", false);
        Shape square = new Square(2.5, "Green", true);

        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
