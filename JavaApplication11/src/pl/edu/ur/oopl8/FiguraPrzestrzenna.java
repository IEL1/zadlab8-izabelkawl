package pl.edu.ur.oopl8;

/**
 *
 * @author Izabela
 */
public abstract class FiguraPrzestrzenna extends FiguraGeometryczna {

    public abstract double ObliczObjetosc();

    public String toString() {
        return super.toString() + "przestrzennej";
    }
}
