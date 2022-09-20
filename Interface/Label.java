package Interface;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Label {
    private JLabel label;
    private String imagepath;
    private int posx;
    private int posy;
    private int scalex;
    private int scaley;

    public Label(String imagePath, int posX, int posY, int scaleX, int scaleY) {
        this.label = new JLabel();
        this.imagepath = imagePath;
        this.posx = posX;
        this.posy = posY;
        this.scalex = scaleX;
        this.scaley = scaleY;

        // Configurações para deixar o label representado apenas pela imagem definida 
        label.setOpaque(false);
        label.setBorder(null);

        // Define a imagem do botão
        label.setIcon(new ImageIcon(this.imagepath)); 

        // Configura a posição e escala do label
        label.setBounds(posx, posy, scalex, scaley);
    }

    public JLabel getLabel() {
        return label;
    }
}