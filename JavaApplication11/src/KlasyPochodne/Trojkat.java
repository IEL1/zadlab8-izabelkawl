package KlasyPochodne;

import pl.edu.ur.oopl8.FiguraPlaska;

/**
 *
 * @author Izabela
 */
public class Trojkat extends FiguraPlaska {

    private double h;
    private double a;

    public Trojkat(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public double getA() {
        return a;
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
        return a * 3;
    }

    @Override
    public double ObliczPole() {
        return (a * h) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole trójkątu: " + ObliczPole() + " Obwód trókątu: " + ObliczObwod();
    }
}
