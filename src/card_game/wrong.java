/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package card_game;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author romeo
 */
public class wrong extends JFrame{

    public wrong(String x) throws HeadlessException {
        setBounds(0, 0, 200, 200);
        JOptionPane.showMessageDialog(rootPane, x);
        dispose();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public wrong(String x,String[] str, int num, int pc_num, String y,int a) throws HeadlessException {
        
        if(a != 500){
        setBounds(0, 0, 200, 200);
        //JOptionPane.showMessageDialog(rootPane, x);
        setSize(100, 100);
        dispose();
        Board b = new Board(str, num, pc_num, y);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
    }
}
