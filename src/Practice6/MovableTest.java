package Practice6;

import Practice6.MovableCircle;
import Practice6.MovablePoint;
import Practice6.MovableRectangle;

public class MovableTest {
    public static void main(String[] args) {
        // Тестируем MovablePoint
        Practice6.MovablePoint point = new MovablePoint(0, 0, 2, 2);
        System.out.println("MovablePoint - Initial Position: (" + point.x + ", " + point.y + ")");
        point.moveUp();
        point.moveRight();
        System.out.println("MovablePoint - New Position: (" + point.x + ", " + point.y + ")");

        // Тестируем MovableCircle
        Practice6.MovableCircle circle = new MovableCircle(1, 1, 2, 2, 3);
        System.out.println("MovableCircle - Initial Position: (" + circle.center.x + ", " + circle.center.y + ")");
        circle.moveDown();
        circle.moveLeft();
        System.out.println("MovableCircle - New Position: (" + circle.center.x + ", " + circle.center.y + ")");

        // Тестируем MovableRectangle
        Practice6.MovableRectangle rectangle = new MovableRectangle(0, 0, 4, 4, 1, 1);
        System.out.println("MovableRectangle - Initial Position: (" + rectangle.topLeft.x + ", " + rectangle.topLeft.y + ")");
        System.out.println("MovableRectangle - Same Speed: " + rectangle.hasSameSpeed());
        rectangle.moveRight();
        rectangle.moveDown();
        System.out.println("MovableRectangle - New Position: (" + rectangle.topLeft.x + ", " + rectangle.topLeft.y + ")");
    }
}
