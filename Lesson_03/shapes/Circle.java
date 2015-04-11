package shapes;

import java.util.Scanner;

public class Circle extends Shape {
    public static final String Name = "Let's create circle!";

    public double area() {
        double s = Math.PI*getR()*getR();
        return s;
    }

}