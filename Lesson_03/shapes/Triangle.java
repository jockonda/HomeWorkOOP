package shapes;
import java.util.Scanner;

public class Triangle extends Shape {
    public static final String Name = "Let's create triangle!";

    @Override
    public double area() {
        double s = (getH()*getA())/2;
        return s;
    }
}
