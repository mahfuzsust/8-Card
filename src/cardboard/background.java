package cardboard;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class background extends JPanel {

    public Image backgrnd;
    

    public background() {
        backgrnd = new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\bg1.jpg").getImage();
        add(new pccardset());
        add(new deck());
       // add(new cardset());
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(backgrnd, 0, 100, null);


    }
}
