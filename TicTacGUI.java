/**
 * 
 * @GrayKnight
 * @2D Array Demo Assignment 11/27/10
 */
import javax.swing.*;
import java.awt.*;  //these must be imported for GUI
import java.awt.event.*;
import java.awt.Color;

public class TicTacGUI extends JPanel
{   
    private final int ROWS = 3, COLUMNS = 3;
    private JButton[][] button = new JButton[ROWS][COLUMNS];
    private TicTacModel gk;
    private String[][] markArray;
    private boolean[][] colorArray;
    
    
    /**
     * Constructor for objects of class DiceGUI
     */
    public TicTacGUI()
    {  
        markArray = new String[ROWS][COLUMNS];
        colorArray = new boolean[ROWS][COLUMNS];
        
        //Arrays are initialized
        for(int r = 0; r < ROWS; r++)
        {
            for (int c = 0; c < COLUMNS; c++)
            {
                markArray[r][c] = "";
            }
        }
        for(int r = 0; r < ROWS; r++)
        {
            for (int c = 0; c < COLUMNS; c++)
            {
                colorArray[r][c] = false;
            }
        }
        
        //reference to the Arrays is sent to the constructor of the object
        gk = new TicTacModel(markArray, colorArray);
        
       ButtonListener Listener = new ButtonListener();
       Font font = new Font("courier", Font.BOLD, 34);
       
       for(int row = 0; row < button.length; row++)
           for (int col = 0; col < button[row].length; col++)
           {
                button[row][col] = new JButton();
                button[row][col].addActionListener(Listener);
                button[row][col].setPreferredSize(new Dimension(90,90));
                button[row][col].setOpaque(true); // for macs
                button[row][col].setBorderPainted(false); //for macs
                button[row][col].setBackground(Color.WHITE);
                button[row][col].setForeground(Color.BLUE);
                button[row][col].setFont(font);
                add(button[row][col]);      
           }
       
       setPreferredSize(new Dimension(300, 300));
       setVisible(true);
    }//end of constructor
    
    /**
     * Private Listener Class.
     */
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {  
        //When the button is clicked the row and column is sent to the squareClicked Method    
        for(int row = 0; row < button.length; row++)
           for (int col = 0; col < button[row].length; col++)
              if(event.getSource() == button[row][col])
                 gk.squareClicked(row, col);
     
        //The GUI display is updated from the information in the Arrays
        for(int row = 0; row < button.length; row++)
           for (int col = 0; col < button[row].length; col++)
           {
              if(colorArray[row][col]) button[row][col].setBackground(Color.RED);
              else  button[row][col].setBackground(Color.WHITE);
              button[row][col].setText(markArray[row][col]);
           }
        }//end ActionPerformed method
     

    }//end listener class

}//end class
