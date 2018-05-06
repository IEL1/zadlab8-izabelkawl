package KlasyPochodne;

import pl.edu.ur.oopl8.FiguraPlaska;

/**
 *
 * @author Izabela
 */
public class Kwadrat extends FiguraPlaska {

    private double a;

    public Kwadrat(double a) {
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

    @Override
    public double ObliczObwod() {
        return 4 * a;
    }

    @Override
    public double ObliczPole() {
        return a * a;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole kwadratu: " + ObliczPole() + " Obwód kwadratu: " + ObliczObwod();
    }
}
