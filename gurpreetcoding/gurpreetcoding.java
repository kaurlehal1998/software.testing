
import java.applet.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class gurpreetcoding
{
    public static void main(String[] args)
    {
        Bullseye frame = new Bullseye();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


class Bullseye extends JFrame
{
    public Bullseye()
    {
        setTitle("Bullseye");
        setSize(WIDTH, HEIGHT);

        BullseyePanel panel = new BullseyePanel();
        getContentPane().add(panel);
    }
    public static final int WIDTH = 700;
    public static final int HEIGHT = 700;
}
class BullseyePanel extends JPanel
{

    public void paintComponent (Graphics page)
    {
        super.paintComponent(page);
        final int MAX_WIDTH = 200, NUM_RINGS = 5, RING_WIDTH = 30;
        int a = 0, b = 0, diameter;

        setBackground (Color.white);

        diameter = MAX_WIDTH;
        page.setColor (Color.blue);

        for (int count = 1; count < NUM_RINGS; count++)
        {
            if (page.getColor() == Color.orange)
                page.setColor (Color.blue);
            else
                page.setColor (Color.orange);

            page.fillOval (a, b, diameter, diameter);

            diameter -= (2 * RING_WIDTH);
            a += RING_WIDTH;
            b += RING_WIDTH;
        }
        page.setColor (Color.red);
        page.fillOval (a, b, diameter, diameter);
    }
}