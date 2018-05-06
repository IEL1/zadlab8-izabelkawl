package KlasyPochodne;

import pl.edu.ur.oopl8.FiguraPlaska;

/**
 *
 * @author Izabela
 */
public class Kolo extends FiguraPlaska {

    private final double pi = 3.14;
    private double r;

    public Kolo(double r) {
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

    @Override
    public double ObliczObwod() {
        return (2 * pi * r);
    }

    @Override
    public double ObliczPole() {
        return pi * r * r;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole koła: " + ObliczPole() + " Obwód koła: " + ObliczObwod();
    }
}
