import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

class Pong extends JPanel {
    private static final int DIMENSION_WIDTH = 900;
    private static final int DIMENSION_HEIGHT = 600;
    private static final int RECT_WIDTH  = 20;
    private static final int RECT_HEIGHT  = 150;
    private static final int RECT_X  = 0;
    private static final int RECT_Y  = DIMENSION_HEIGHT / 2 - RECT_HEIGHT / 2 ;
    
    private Color colorPlayer1 = Color.RED;
    private Color colorPlayer2 = Color.GREEN;

    @Override
    protected void paintComponent(Graphics g) {
	super.paintComponent(g);

	setBackground(Color.black);
	player(g);
    }

    @Override
    public Dimension getPreferredSize() {
	return new Dimension(DIMENSION_WIDTH, DIMENSION_HEIGHT);
    }

    private void player(Graphics g) {
	g.setColor(colorPlayer1);
	g.fillRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
	
	g.setColor(colorPlayer2);
	g.fillRect(DIMENSION_WIDTH - RECT_WIDTH, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
    } 

    private static void createAndShowGui() {
	Pong mainPanel = new Pong();

	JFrame frame = new JFrame("Pong");
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
