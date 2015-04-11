package shapes;

import java.util.Scanner;

public abstract class Shape {

    public int h,w,r,a;

    public void setH(int h) {
        this.h = h;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    public int getR() {
        return r;
    }

    public int getA() {
        return a;
    }

    public double area() {
        return 0;
    }

}



