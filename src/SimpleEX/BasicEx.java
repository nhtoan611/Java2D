/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleEX;

/**
 *
 * @author nhtoan
 */
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
class Surface extends JPanel {
 //Draw text in panel function
    private void doDrawing(Graphics g) {
 
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString("Java 2D", 50, 50);
    }
 
    @Override
    public void paintComponent(Graphics g) {
 //clear window
        super.paintComponent(g);
        doDrawing(g);
    }
}
 
public class BasicEx extends JFrame {
 
    public BasicEx() {
 //create interface 
        initUI();
    }
 
    private void initUI() {
 
        add(new Surface());
 
        setTitle("Simple Java 2D example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                BasicEx ex = new BasicEx();
                ex.setVisible(true);
            }
        });
    }
}