package card_game;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author romeo
 */
public class mainframe extends JFrame implements ActionListener{
    
    JButton start_game = new JButton("Start Game");
    JButton instruction = new JButton("Instruction");
    JButton exit = new JButton("Exit");
    JButton credit = new JButton("Credits");

    public mainframe() throws HeadlessException {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setVisible(rootPaneCheckingEnabled);
        
        start_game.setBounds(30, 30, 100, 30);
        start_game.addActionListener(this);
        add(start_game);
        
        instruction.setBounds(30, 70, 100, 30);
        instruction.addActionListener(this);
        add(instruction);
        
        credit.setBounds(30, 110, 100, 30);
        credit.addActionListener(this);
        add(credit);
        
        exit.setBounds(30, 150, 100, 30);
        exit.addActionListener(this);
        add(exit);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exit)
        {
            System.exit(0);
        }
        if(e.getSource() == start_game)
        {
            dispose();
            game gf = new game();
            
        }
        if(e.getSource() == instruction)
        {
            String s = "Play with the same cards set. If not available then just match the card with color change. If you are finished first, you won else you lost. If you have no card to change or give just pick a card";
            Instruction_game i = new Instruction_game(s);
            dispose();
        }
        if(e.getSource() == credit)
        {
            String s = "Md. Mahfuzur Rahman";
            Instruction_game i = new Instruction_game(s);
            dispose();
        }
        
    }
    
}
