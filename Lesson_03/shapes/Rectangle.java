package shapes;
import java.util.Scanner;

public class Rectangle extends Shape{
    public static final String Name = "Let's create rectangle!";

    public double area() {
        double s = (getH()*getW());
        return s;
    }

}
