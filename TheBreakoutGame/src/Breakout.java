import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	private final static Color BACKGROUND_COLOUR = Color.WHITE;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		// TODO: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		
		// TODO: Set the title
		setTitle(Settings.WINDOW_NAME);
		 
		// TODO: Set the background colour to white
		setBackground(BACKGROUND_COLOUR);	
		
		// TODO: Set resizable to false
		setResizable(false);
		 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
		
        // TODO: Set visible to true
        setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	        	 new Breakout();	
	         }
		});

	}
}
