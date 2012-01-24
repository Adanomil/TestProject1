/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author workshopjan23
 */
public class TestProject1 extends JComponent implements ActionListener {
    Image submarine;
    Image iceberg;
    int subx = 100;
    int suby = 250;
    int icex = 1600;
    int icexs = 200;
    int iceys = 300;
    int icey = iceys-156;
    int icespeed =10;
    private Random r = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        JFrame window = new JFrame("Submarine");
        TestProject1 game = new TestProject1();
        window.add(game);
        window.pack();
        window.setLocation(0,0);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        Timer t = new Timer(100, game);
        t.start();
        
        
        
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1900, 900);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0,200,1900,900);
        g.drawImage(submarine,subx,suby,-100,50,null);
        g.drawImage(iceberg,icex,icey,icexs,iceys,null);
    }

    public TestProject1() throws IOException {
        submarine = ImageIO.read(getClass().getResource("yellow-submarine.jpg"));
        iceberg = ImageIO.read(getClass().getResource("iceberg.jpg"));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        icex-=icespeed;
        if (icex+icexs < 0)
        {
            icex = 1900 + r.nextInt(20);
            icespeed = 6 + r.nextInt(20);
            icexs = 100 + r.nextInt(300); 
            iceys = 300 + r.nextInt(100);
        }
        repaint();
    }
    
    
    
}
