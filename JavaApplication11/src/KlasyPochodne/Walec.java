package KlasyPochodne;

import pl.edu.ur.oopl8.FiguraPrzestrzenna;

/**
 *
 * @author Izabela
 */
public class Walec extends FiguraPrzestrzenna {

    private final double pi = 3.14;
    private double r;
    private double h;

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }

    public void setR(double r) {
        if (r < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.r = r;
        }
        
    }

    public void setH(double h) {
        if (h < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.h = h;
        }

    }

    public double ObliczObjetosc() {
        return pi * r * r * h;
    }

    @Override
    public double ObliczPole() {
        return 2 * pi * r * r + (2 * pi * r * h);
    }

    @Override
    public String toString() {
        return super.toString() + " Pole walca: " + ObliczPole() + " Objętość walca: " + ObliczObjetosc();
    }

}
