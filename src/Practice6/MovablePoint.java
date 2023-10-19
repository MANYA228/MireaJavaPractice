package Practice6;

import Practice6.Movable;

public class MovablePoint implements Movable {
    int x; // Change 'private' to default access
    int y; // Change 'private' to default access
    int xSpeed; // Change 'private' to default access
    int ySpeed; // Change 'private' to default access

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
