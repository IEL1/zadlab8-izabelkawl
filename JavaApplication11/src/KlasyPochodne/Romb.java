package KlasyPochodne;

import pl.edu.ur.oopl8.FiguraPlaska;

/**
 *
 * @author Izabela
 */
public class Romb extends FiguraPlaska {

    private double a;
    private double h;

    public Romb(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
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

    public void setH(double h) {
        if (h < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.h = h;
        }
    }

    @Override
    public double ObliczObwod() {
        return 4*a;
    }

    @Override
    public double ObliczPole() {
        return a * h;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole rombu: " + ObliczPole() + " Obwód rombu: " + ObliczObwod();
    }
}
