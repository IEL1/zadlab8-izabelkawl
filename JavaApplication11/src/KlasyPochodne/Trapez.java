package KlasyPochodne;

import pl.edu.ur.oopl8.FiguraPlaska;

/**
 *
 * @author Izabela
 */
public class Trapez extends FiguraPlaska {

    private double a;
    private double b;
    private double c;
    private double h;

    public Trapez(double a, double b,double c,double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getH() {
        return h;
    }

    public void setA(double a) {
        if (a < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.a = a;
        }
    }

    public void setB(double b) {
        if (b < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.b = b;
        }
    }

    public void setC(double c) {
        if (c < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.c = c;
        }
    }

    public void setH(double h) {
        if (h < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.h = h;
        }
    }

    @Override
    public double ObliczObwod() {
        return a + b + (2 * h);
    }

    @Override
    public double ObliczPole() {
        return ((a + b) * h) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole trapezu: " + ObliczPole() + " Obwód trapezu: " + ObliczObwod();
    }
}
