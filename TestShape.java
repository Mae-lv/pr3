package ru.mirea.pr3;

public class TestShape {
    public static void main(String[] args) {
        Shape1 s1 = new Circle1(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); тут ошибка потому что метод принадлежит классу Circle а не Shape.
        Circle1 c1 = (Circle1) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        //Shape s2 = new Shape(); абстрактрный класс не может содержатьб какие либо объекты.
        Shape1 s3 = new Rectangle1(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); тут ошибка потому что обект принадлежит классу Rectangle а не Shape.
        Rectangle1 r1 = (Rectangle1) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape1 s4 = new Square1(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());тут ошибка потому что обект принадлежит классу Square а не Shape.

        Rectangle1 r2 = (Rectangle1) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); тут ошибка потому что R2 = R4 но при этом R4 это Shape а он не имеет метода getSide.
        System.out.println(r2.getLength());

        Square1 sq1 = (Square1) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
