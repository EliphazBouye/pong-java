import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

class Pong extends JPanel {
    private static final int RECT_X  = 5;
    private static final int RECT_Y  = 50;
    private static final int RECT_WIDTH  = 20;
    private static final int RECT_HEIGHT  = 160;
    private Color shapeColor = Color.RED;

    @Override
    protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(shapeColor);
	g.drawRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
	g.drawRect(80, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
    }

    @Override
    public Dimension getPreferredSize() {
	return new Dimension(900, 600);
    }

    private static void createAndShowGui() {
	Pong mainPanel = new Pong();

	JFrame frame = new JFrame("Pong");
	frame.setBackground(Color.black);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(mainPanel);
       	frame.pack();
       	frame.setLocationByPlatform(true);
       	frame.setVisible(true);
	
    }

    public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
		    createAndShowGui();
		}
	    });
    }
}
