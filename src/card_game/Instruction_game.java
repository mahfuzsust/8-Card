/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package card_game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author romeo
 */
class Instruction_game extends JFrame implements ActionListener{

    JButton back = new JButton("Back");
    JTextArea jt;
    Instruction_game() {
        setSize(500, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(rootPaneCheckingEnabled);
        setResizable(false);
        setLayout(null);
        back.setBounds(30, 400, 100, 30);
        back.addActionListener(this);
        add(back);
    }
    
    Instruction_game(String s) {
        setSize(500, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(rootPaneCheckingEnabled);
        setResizable(false);
        setLayout(null);
        back.setBounds(30, 400, 100, 30);
        back.addActionListener(this);
        add(back);
        jt = new JTextArea(s);
        jt.setEditable(false);
        JScrollPane jp = new JScrollPane(jt);
        jp.setBounds(30, 50, 300, 300);
        jp.setEnabled(false);
        add(jp);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back)
        {
            mainframe m = new mainframe();
            dispose();
        }
    }
    
}
