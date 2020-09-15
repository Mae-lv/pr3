package ru.mirea.pr3;

public class Movable23 implements Movable21 {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    Movable23(int x,int y,int xSpeed,int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Movable23 () {
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
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
