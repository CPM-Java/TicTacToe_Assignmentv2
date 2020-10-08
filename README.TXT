TicTacModel class

public TicTacModel(String[][] strArray,
                   boolean[][] boolArray)
Constructor for objects of class TicTacModel Accepts a 2-D arrays 
of Strings and booleans then saves them as instance variables.
Parameters:
strArray - a 2-D array of Strings
boolArray - a 2-D array of Strings

public void squareClicked(int row,
                          int col)
Each time a square is clicked, the GUI will send the location of the click. 
This method must update the status of the stringArray and booleanArray 
based on the location information. 
Including: 
  Refreshing the gameboard in the case of a win or tie on a previous click. 
  Alternating X and O with each click in square without an X or O. 
  Determining if a win or tie has occurred. 
  Changing the background color via the 2-D boolean array in the event of a win or tie.
Parameters:
row - integer indicating the row of the clicked square
col - integer indicating the col of the clicked square