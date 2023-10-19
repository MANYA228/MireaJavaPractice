package Practice3;

public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "blue", true);
        Shape rectangle = new Rectangle(4.0, 6.0, "green", false);
        Shape square = new Square(3.0, "red", true);

        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
