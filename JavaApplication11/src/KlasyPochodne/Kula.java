package KlasyPochodne;

import pl.edu.ur.oopl8.FiguraPrzestrzenna;

/**
 *
 * @author Izabela
 */
public class Kula extends FiguraPrzestrzenna {

    private final double pi = 3.14;
    private double r;

    public Kula(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.r = r;
        }
    }

    public double ObliczObjetosc() {
        return pi*r*r*(4/3);
    }

    @Override
    public double ObliczPole() {
        return pi * r * r;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole Kuli: " + ObliczPole() + " Objętość kuli: " + ObliczObjetosc();
    }

}
