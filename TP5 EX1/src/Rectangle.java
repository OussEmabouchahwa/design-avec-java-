import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
class Rectangle extends Figure {
    private int cx;
    private int cy;
    private int largeur;
    private int hauteur;

    public Rectangle(Color couleur, int cx, int cy, int largeur, int hauteur) {
        super(couleur);
        this.cx = cx;
        this.cy = cy;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public void deplacer(String sens, int pas) {
        switch (sens) {
            case "haut":
                cy -= pas;
                break;
            case "bas":
                cy += pas;
                break;
            case "gauche":
                cx -= pas;
                break;
            case "droite":
                cx += pas;
                break;
            default:
                System.out.println("Sens de déplacement invalide.");
                break;
        }
    }
    public void Designer() {
    	
    }
    @Override
    public void redimensionner(double proportion) {
        largeur *= proportion;
        hauteur *= proportion; // Implémentation du redimensionnement du rectangle selon la proportion
    }
}
