package cardboard;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class deck extends JPanel{
//card deck to collect
    JButton side;
    public deck() {
        JPanel deck = new JPanel();
        side = new JButton(new ImageIcon("C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\b.gif"));
        deck.add(side);
        //add(deck, BorderLayout.CENTER);
    }
}
