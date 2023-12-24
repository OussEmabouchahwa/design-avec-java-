import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DessinUtilitaires extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final List<FormeInfo> formes = new ArrayList<>();
    private static final FormePanel formePanel = new FormePanel();

    public DessinUtilitaires(String title, int width, int height) {
        super(title);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(formePanel);
    }

    public static void dessinerCercle(Color circleColor, int cx, int cy, int rayon) {
        
            formes.add(new FormeInfo(FormeType.CERCLE, cx, cy, rayon, 0, 0, circleColor));
            formePanel.repaint();
            SwingUtilities.invokeLater(() -> {
                DessinUtilitaires dessinUtilitaires = new DessinUtilitaires("Dessin de cercle", 800, 600);
                dessinUtilitaires.setVisible(true);
            });
        
    }

    public static void dessinerRectangle(Color rectColor, int x, int y, int largeur, int longueur) {
        
            formes.add(new FormeInfo(FormeType.RECTANGLE, x, y, 0, largeur, longueur, rectColor));
            formePanel.repaint();
            SwingUtilities.invokeLater(() -> {
                DessinUtilitaires dessinUtilitaires = new DessinUtilitaires("Dessin de rectangle", 800, 600);
                dessinUtilitaires.setVisible(true);
            });
        
    }

    private static class FormeInfo {
        private final FormeType type;
        private final int x;
        private final int y;
        private final int rayon; // Utilis  seulement pour les cercles
        private final int largeur; // Utilis  seulement pour les rectangles
        private final int longueur; // Utilis  seulement pour les rectangles
        private final Color color;

        public FormeInfo(FormeType type, int x, int y, int rayon, int largeur, int longueur, Color color) {
            this.type = type;
            this.x = x;
            this.y = y;
            this.rayon = rayon;
            this.largeur = largeur;
            this.longueur = longueur;
            this.color = color;
        }
    }

    private enum FormeType {
        CERCLE, RECTANGLE
    }

    private static class FormePanel extends JPanel {

        private static final long serialVersionUID = 1L;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (FormeInfo formeInfo : formes) {
                g.setColor(formeInfo.color);

                if (formeInfo.type == FormeType.CERCLE) {
                    g.fillOval(formeInfo.x - formeInfo.rayon, formeInfo.y - formeInfo.rayon,
                            2 * formeInfo.rayon, 2 * formeInfo.rayon);
                } else if (formeInfo.type == FormeType.RECTANGLE) {
                    g.fillRect(formeInfo.x, formeInfo.y, formeInfo.largeur, formeInfo.longueur);
                }
            }
        }
    }
}
