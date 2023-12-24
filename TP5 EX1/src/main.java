import java.awt.Color;

public class main {
    public static void main(String[] args) {
        
        Cercle cercle = new Cercle(Color.RED, 100, 200, 40);
        System.out.println("Dessin d'un cercle :");
        System.out.println("Centre : (" + cercle.getCx() + ", " + cercle.getCy() + ")");
        System.out.println("Rayon : " + cercle.getRayon());
        System.out.println("Couleur : " + cercle.getCouleur());

        cercle.deplacer("haut", 100);
        System.out.println("Déplacement de 100 pixels vers le haut du cercle.");

        cercle.redimensionner(1.5);
        System.out.println("Redimensionnement du cercle avec une proportion de 1.5.");

        // Instanciation et manipulation d'un deuxième cercle
        Cercle cercle2 = new Cercle(Color.MAGENTA, 100, 100, 60);
        System.out.println("Dessin d'un deuxième cercle :");
        System.out.println("Centre : (" + cercle2.getCx() + ", " + cercle2.getCy() + ")");
        System.out.println("Rayon : " + cercle2.getRayon());
        System.out.println("Couleur : " + cercle2.getCouleur());

        Rectangle rectangle = new Rectangle(Color.GREEN, 100, 400, 100, 300);
        System.out.println("Dessin d'un rectangle :");
        System.out.println("Point en haut à gauche : (" + rectangle.getCx() + ", " + rectangle.getCy() + ")");
        System.out.println("Longueur : " + rectangle.getLargeur());
        System.out.println("Largeur : " + rectangle.getHauteur());
        System.out.println("Couleur : " + rectangle.getCouleur());

        rectangle.deplacer("droite", 200);
        System.out.println("Déplacement de 200 pixels vers la droite du rectangle.");

        rectangle.redimensionner(0.5);
        System.out.println("Redimensionnement du rectangle avec une proportion de 0.5.");

        Rectangle rectangle2 = new Rectangle(Color.MAGENTA, 300, 400, 50, 150);
        System.out.println("Dessin d'un deuxième rectangle :");
        System.out.println("Point en haut à gauche : (" + rectangle2.getCx() + ", " + rectangle2.getCy() + ")");
        System.out.println("Longueur : " + rectangle2.getLargeur());
        System.out.println("Largeur : " + rectangle2.getHauteur());
        System.out.println("Couleur : " + rectangle2.getCouleur());
    }
}