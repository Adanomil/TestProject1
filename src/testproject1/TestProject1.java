/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author workshopjan23
 */
public class TestProject1 extends JComponent {
    Image submarine;
    Image iceberg;
    int subx = 100;
    int suby = 250;
    int icex = 1600;
    int icey = 144;
    int icexs = 200;
    int iceys = 300;

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
    
    
    
    
}
