package pl.edu.ur.oopl8;

/**
 *
 * @author Izabela
 */
public abstract class FiguraPlaska extends FiguraGeometryczna {

    public abstract double ObliczObwod();

    public String toString() {
        return super.toString() + "płaskiej";
    }
}
