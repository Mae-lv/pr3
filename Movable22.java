package ru.mirea.pr3;

public class Movable22 extends Movable23 implements Movable21 {
    private int radius;
    private Movable23 center;
    public Movable22(int x,int y,int xSpeed,int ySpeed,int radius)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }

    @Override
    public void moveUP() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
