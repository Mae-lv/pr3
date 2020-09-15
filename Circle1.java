package ru.mirea.pr3;

class Circle1 extends Shape1 {
    protected double radius;
    public Circle1() {}
    public Circle1(double radius) {
        this.radius = radius;}
    public Circle1(double radius,String color,boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }
}
