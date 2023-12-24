import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
class Cercle extends Figure {
    private int cx;
    private int cy;
    private double rayon;

    public Cercle(Color couleur, int cx, int cy, double rayon) {
        super(couleur);
        this.cx = cx;
        this.cy = cy;
        this.rayon = rayon;
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

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
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
    @Override
    public void redimensionner(double proportion) {
        rayon *= proportion;
    }
    @Override
    public void Designer() {
    
    }
    
    }

