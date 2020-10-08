
/**
 * 
 * @GrayKnight
 * @2D Array Demo Assignment 11/27/10
 * 
 * DO NOT MODIFY THIS CLASS
 */
import javax.swing.JFrame;

public class MainTicTac
{
	public static void main(String[] ArgsgrA)
	{
	    TicTacGUI gk = new TicTacGUI();
	    
	    JFrame buttonFrame = new JFrame("GrayKnight TicTacToe 2010");
	    buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    buttonFrame.getContentPane().add(gk);
	    buttonFrame.pack();
	    buttonFrame.setLocation(225,30);
	    buttonFrame.setResizable(false);
	    buttonFrame.setVisible(true);
	    
	}
}