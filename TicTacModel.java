
/**
 * Your Assignment is to Complete this Class so the program behaves
 * the same as the demo.
 * 
 * 
 * @ author
 * @ Date
 */
public class TicTacModel
{
    // Instance Variables.
    // 2-D Array of String objects which remembers the marks on the "game board",
    private String[][] stringArray;
    // another 2-D Array of booleans which will tell the GUI what squares to mark in red. (true = red)
    private boolean[][] booleanArray;
    
    //You may add more instance variables as appropriate        
        
    /**
     * Constructor for objects of class TicTacModel
     * Accepts a 2-D arrays of Strings and booleans
     * then saves them as instance variables.
     * 
     * @param  strArray   a 2-D array of Strings
     * @param  boolArray   a 2-D array of Strings
     */
    public TicTacModel(String[][] s, boolean[][] b)
    {
        stringArray = s;
        booleanArray = b;
        
    }
    
    /**
     * Each time a square is clicked, the GUI will send the location of the click.
     * This method must update the status of the stringArray and booleanArray
     *  based on the location information.
     *  
     * Including:
     *   Refreshing the gameboard in the case of a win or tie on a previous click.
     *   Alternating X and O with each click in square without an X or O.
     *   Determining if a win or tie has occurred.
     *   Changing the background color via the 2-D boolean array
     *     in the event of a win or tie.
     * 
     * @param  row   integer indicating the row of the clicked square
     * @param  col   integer indicating the col of the clicked square
     */
    public void squareClicked(int row, int col)
    {
          //some sample code
          stringArray[row][col] = "Hi";
          booleanArray[row][col] = true;
    }
    

}
