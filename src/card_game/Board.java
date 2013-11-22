package card_game;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Board extends JFrame implements ActionListener {

    JButton ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
            NINE, TEN, JACK, QUEEN, KING, side;
    JButton[] card, pc_hand;
    public int num_cards, act = 500;
    JButton pck;
    JScrollPane pq;
    public Board(String str[], int num, int pc_num, String de_top) {

        this.num_cards = num;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100, 660);
        setLocation(0, 0);
        setTitle("board");
        setResizable(false);
        //setVisible(true);
        //nicher card
        setVisible(rootPaneCheckingEnabled);

        card = new JButton[num];
        pc_hand = new JButton[pc_num];


        JPanel lnfPanel = new JPanel();

        for (int i = 0; i < num; i++) {
            String x = check(str[i]);
            card[i] = new JButton(new ImageIcon(x));
            card[i].addActionListener(this);
            lnfPanel.add(card[i]);
        }

        pq = new JScrollPane(lnfPanel);
        add(pq, BorderLayout.PAGE_END);
        //add(lnfPanel, BorderLayout.PAGE_END);
        //add(lnfPanel);
        
        JPanel pchand = new JPanel();

        for (int i = 0; i < pc_num; i++) {
            String x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\b.gif";
            pc_hand[i] = new JButton(new ImageIcon(x));
            pchand.add(pc_hand[i]);
            //pc_hand[i].setEnabled(false);
            
        }


        add(pchand, BorderLayout.PAGE_START);
        
        JPanel deck = new JPanel();
        String x = check(de_top);
        JButton deck_card;
        if(x == null) deck_card = new JButton();
        else deck_card = new JButton(new ImageIcon(x));
        deck.add(deck_card);
        add(deck,BorderLayout.CENTER);
        
        add(pchand, BorderLayout.PAGE_START);
        
        JPanel pick = new JPanel();
        x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\b.gif";
        pck = new JButton(new ImageIcon(x));
        pck.addActionListener(this);
        pick.add(pck);
        add(pick,BorderLayout.EAST);

    }

    private String check(String string) {

        String x;
        switch (string) {
            case "H_A":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-1.gif";
                return x;
            case "H_2":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-2.gif";
                return x;
            case "H_3":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-3.gif";
                return x;
            case "H_4":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-4.gif";
                return x;
            case "H_5":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-5.gif";
                return x;
            case "H_6":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-6.gif";
                return x;
            case "H_7":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-7.gif";
                return x;
            case "H_8":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-8.gif";
                return x;
            case "H_9":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-9.gif";
                return x;
            case "H_1":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-10.gif";
                return x;
            case "H_J":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-11.gif";
                return x;
            case "H_Q":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-12.gif";
                return x;
            case "H_K":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\2-13.gif";
                return x;
            case "S_A":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-1.gif";
                return x;
            case "S_2":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-2.gif";
                return x;
            case "S_3":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-3.gif";
                return x;
            case "S_4":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-4.gif";
                return x;
            case "S_5":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-5.gif";
                return x;
            case "S_6":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-6.gif";
                return x;
            case "S_7":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-7.gif";
                return x;
            case "S_8":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-8.gif";
                return x;
            case "S_9":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-9.gif";
                return x;
            case "S_1":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-10.gif";
                return x;
            case "S_J":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-11.gif";
                return x;
            case "S_Q":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-12.gif";
                return x;
            case "S_K":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\1-13.gif";
                return x;
            case "C_A":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-1.gif";
                return x;
            case "C_2":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-2.gif";
                return x;
            case "C_3":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-3.gif";
                return x;
            case "C_4":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-4.gif";
                return x;
            case "C_5":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-5.gif";
                return x;
            case "C_6":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-6.gif";
                return x;
            case "C_7":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-7.gif";
                return x;
            case "C_8":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-8.gif";
                return x;
            case "C_9":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-9.gif";
                return x;
            case "C_1":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-10.gif";
                return x;
            case "C_J":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-11.gif";
                return x;
            case "C_Q":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-12.gif";
                return x;
            case "C_K":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\3-13.gif";
                return x;
            case "D_A":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-1.gif";
                return x;
            case "D_2":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-2.gif";
                return x;
            case "D_3":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-3.gif";
                return x;
            case "D_4":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-4.gif";
                return x;
            case "D_5":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-5.gif";
                return x;
            case "D_6":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-6.gif";
                return x;
            case "D_7":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-7.gif";
                return x;
            case "D_8":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-8.gif";
                return x;
            case "D_9":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-9.gif";
                return x;
            case "D_1":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-10.gif";
                return x;
            case "D_J":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-11.gif";
                return x;
            case "D_Q":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-12.gif";
                return x;
            case "D_K":
                x = "C:\\Users\\romeo\\Documents\\NetBeansProjects\\Card_Game\\src\\images\\4-13.gif";
                return x;
        }
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pck)
        {
            act = 20;
            dispose();
        }
        for (int i = 0; i < num_cards; i++) {
            if (e.getSource() == card[i]) {
                act = i + 1;
                dispose();
            }
        }
        //act = 500;
        System.out.print("ghorar dim: " + act);
    }
}
