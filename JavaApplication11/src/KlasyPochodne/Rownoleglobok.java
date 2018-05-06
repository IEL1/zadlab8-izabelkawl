package KlasyPochodne;

import pl.edu.ur.oopl8.FiguraPlaska;

/**
 *
 * @author Izabela
 */
public class Rownoleglobok extends FiguraPlaska {

    private double a;
    private double b;

    public Rownoleglobok(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
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

    @Override
    public double ObliczObwod() {
        return 2 * (a + b);
    }

    @Override
    public double ObliczPole() {
        return a * b;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole równoległoboku: " + ObliczPole() + " Obwód równoległoboku: " + ObliczObwod();
    }
}
