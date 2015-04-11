package shapes;
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Shape shape;

        shape = new Rectangle();
        System.out.println(Rectangle.Name);
        System.out.print("Please, enter rectangle's height: ");
        shape.setH(new Scanner(System.in).nextInt());
        System.out.print("Please, enter rectangle's width : ");
        shape.setW(new Scanner(System.in).nextInt());
        System.out.println("Rectangle's area = " + shape.area());

        shape = new Triangle();
        System.out.println(Triangle.Name);
        System.out.print("Please, enter triangle's height: ");
        shape.setH(new Scanner(System.in).nextInt());
        System.out.print("Please, enter triangle's base : ");
        shape.setA(new Scanner(System.in).nextInt());
        System.out.println("Triangle's area = " + shape.area());

        shape = new Circle();
        System.out.println(Circle.Name);
        System.out.print("Please, enter circle's radius: ");
        shape.setR(new Scanner(System.in).nextInt());
        System.out.println("Circle's area = " + shape.area());
    }

}
