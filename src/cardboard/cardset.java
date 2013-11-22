package cardboard;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JPanel;

public class cardset extends JPanel {

    JButton ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
            NINE, TEN, JACK, QUEEN, KING, side;

    public cardset() {
        JPanel lnfPanel = new JPanel();
        ACE = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\ac.gif"));
        lnfPanel.add(ACE);
        DEUCE = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3s.gif"));
        lnfPanel.add(DEUCE);
        THREE = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\9h.gif"));
        lnfPanel.add(THREE);
        FOUR = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\5d.gif"));
        lnfPanel.add(FOUR);
        FIVE = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\as.gif"));
        lnfPanel.add(FIVE);
        SIX = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\ks.gif"));
        lnfPanel.add(SIX);
        SEVEN = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\9s.gif"));
        lnfPanel.add(SEVEN);
        EIGHT = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4d.gif"));
        lnfPanel.add(EIGHT);
        //add(lnfPanel, BorderLayout.NORTH);
    }
}
