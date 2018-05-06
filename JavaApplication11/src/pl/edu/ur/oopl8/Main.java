package pl.edu.ur.oopl8;
import KlasyPochodne.Kolo;
import KlasyPochodne.Kwadrat;
import KlasyPochodne.Prostokat;
import KlasyPochodne.Romb;
import KlasyPochodne.Rownoleglobok;
import KlasyPochodne.Trapez;
import KlasyPochodne.Trojkat;
import KlasyPochodne.Kula;
import KlasyPochodne.Prostopadloscian;
import KlasyPochodne.Stozek;
import KlasyPochodne.Szescian;
import KlasyPochodne.Walec;

/**
 *
 * @author Izabela
 */
public class Main {

    public static void main(String[] args) {

        FiguraGeometryczna[] figury = new FiguraGeometryczna[15];

        figury[0] = new Romb(4, 2);
        figury[1] = new Kwadrat(2);
        figury[2] = new Rownoleglobok(2, 6);
        figury[3] = new Trojkat(2, 6);
        figury[4] = new Kolo(2);
        figury[5] = new Szescian(2);
        figury[6] = new Kula(2);
        figury[7] = new Romb(2, 6);
        figury[8] = new Walec(2, 4);
        figury[9] = new Trapez(2, 4, 6, 8);
        figury[10] = new Prostokat(2, 6);
        figury[11] = new Stozek(6 ,2 ,4);
        figury[12] = new Szescian(6);
        figury[13] = new Walec(4, 6);
        figury[14] = new Prostopadloscian(2, 8, 4);

        int i = 0;
        while (i < figury.length) {
            System.out.println(figury[i].toString());
            i++;
        }
    }
}
