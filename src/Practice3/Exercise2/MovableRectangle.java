package Practice3.Exercise2;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;     // Верхняя левая точка
    private MovablePoint bottomRight; // Нижняя правая точка

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        // Проверяем, что скорости двух точек одинаковы
        if (xSpeed != ySpeed) {
            throw new IllegalArgumentException("Скорости верхней левой и нижней правой точек должны быть одинаковыми.");
        }

        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    // Метод для проверки, что скорости двух точек одинаковы
    public boolean areSpeedsEqual() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed() && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public String toString() {
        return "MovableRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
