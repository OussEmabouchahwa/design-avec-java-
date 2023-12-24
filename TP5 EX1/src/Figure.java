import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
abstract class Figure {
    private Color couleur;

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public Figure(Color couleur) {
        this.couleur = couleur;
    }

    public abstract void deplacer(String sens, int pas);
    public abstract void Designer();
    public abstract void redimensionner(double proportion);
}