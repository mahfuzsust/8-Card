package cardboard;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class pccardset extends JPanel {

    JButton a, b, c, d, e, f, g, h, side;

    public pccardset() {

        JPanel hfPanel = new JPanel();
        a = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\b.gif"));
        hfPanel.add(a);
        b = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\b.gif"));
        hfPanel.add(b);
        a = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\b.gif"));
        hfPanel.add(a);
        b = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\b.gif"));
        hfPanel.add(b);
        a = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\b.gif"));
        hfPanel.add(a);
        b = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\b.gif"));
        hfPanel.add(b);
        a = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\b.gif"));
        hfPanel.add(a);
        b = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\b.gif"));
        hfPanel.add(b);
        b = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\b.gif"));
        hfPanel.add(b);


        //add(hfPanel, BorderLayout.PAGE_START);
    }
}
