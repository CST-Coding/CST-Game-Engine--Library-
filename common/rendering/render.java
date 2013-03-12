package rendering;

import java.awt.*;
import javax.swing.*;

//Create a simple GUI window
public class render {
	
	protected static int x = 0;
	protected static int y = 0;
	protected static int width = 800;
	protected static int height = 600;
	
	/**
	 * 
	 * @param width Width of the screen
	 * @param height Height of the screen
	 */
	public static void createWindow(int width, int height) {

		//Create and set up the window. 
		JFrame frame = new JFrame("Simple GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(x, y, width, height);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true); 
	}
 
}
