package KlasyPochodne;

import pl.edu.ur.oopl8.FiguraPrzestrzenna;

/**
 *
 * @author Izabela
 */
public class Stozek extends FiguraPrzestrzenna {

    private final double pi = 3.14;
    private double r;
    private double h;
    private double l;

    public Stozek(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.h = l;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }
    
    public double getL() {
        return l;
    }

    public void setR(double r) {
        if (r < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.r = r;
        }
        
    }
    public void setL(double l) {
        if (l < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.l = l;
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
        return pi*r*r*h/3;
    }

    @Override
    public double ObliczPole() {
        return (pi*r*l)+(pi*r*r);
    }

    @Override
    public String toString() {
        return super.toString() + " Pole stożka: " + ObliczPole() + " Objętość skożka: " + ObliczObjetosc();
    }

}
