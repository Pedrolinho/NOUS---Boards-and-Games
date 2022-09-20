package Interface;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class CheckBox {
    private JCheckBox checkbox;
    private String imagepath;
    private int posx;
    private int posy;
    private int scalex;
    private int scaley;

    public CheckBox(String imagePath, int posX, int posY, int scaleX, int scaleY) {
        this.checkbox = new JCheckBox();
        this.imagepath = imagePath;
        this.posx = posX;
        this.posy = posY;
        this.scalex = scaleX;
        this.scaley = scaleY;

        // Muda o cursor do mouse
        checkbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // Configurações para deixar o botão representado apenas pela imagem definida 
        checkbox.setOpaque(false);
        checkbox.setFocusPainted(false);
        checkbox.setBorderPainted(false);
        checkbox.setContentAreaFilled(false);
        checkbox.setBorder(null);

        // Define a imagem do botão
        checkbox.setIcon(new ImageIcon(this.imagepath)); 

        // Configura a posição e escala do botão
        checkbox.setBounds(posx, posy, scalex, scaley);
    }

    public JCheckBox getCheckBox() {
        return checkbox;
    }
}