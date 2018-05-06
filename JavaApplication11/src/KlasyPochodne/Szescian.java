package KlasyPochodne;

import pl.edu.ur.oopl8.FiguraPrzestrzenna;

/**
 *
 * @author Izabela
 */
public class Szescian extends FiguraPrzestrzenna {

    private double a;

    public Szescian(double a) {
        this.a = a;
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

    public double ObliczObjetosc() {
        return a*a*a;
    }

    @Override
    public double ObliczPole() {
        return a*a*6;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole sześcianu: " + ObliczPole() + " Objętość sześcianu: " + ObliczObjetosc();
    }

}
