package project3matthewn;
/**
    Programmed by   Class Program
    Date written    Years ago!
    * edited by Matthew Neale
*/

import java.util.Random;

public class Grid
{
    private int[][] gameBoard;
    private int currentRow;
    private int currentCol;
    private int currentValue;
    private int gridSize;

    //for random numbers
    Random randomNumbers = new Random();

    // constants
    private final int MAX_ELEMENT_VALUE = 1000;

    /**
        no-arg constructor - creates a 10x10 grid and sets random location
    */
    public Grid()
    {
        gridSize = 10;
        populateBoard();
        
        currentRow = randomNumbers.nextInt(gridSize-1);
        currentCol = randomNumbers.nextInt(gridSize-1);
        
    }

    /**
        constructor  - creates a grid (newGridSize x newGridSize) and sets random location
        @param newGridSize is value to set for dimensions of grid
    */
    public Grid(int newGridSize)
    {
        gridSize = newGridSize;
        populateBoard();
       
        currentRow = randomNumbers.nextInt(gridSize-1);
        currentCol = randomNumbers.nextInt(gridSize-1);
        
    }
            

    /** private method populateBoard to set locations to random value
    */
    private void populateBoard()
    {
        this.gameBoard = new int[gridSize][gridSize];
        int row = gridSize, col = gridSize;
        for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    gameBoard[i][j] = (randomNumbers.nextInt(MAX_ELEMENT_VALUE));
                }
            }

    }

    /**
        jump method sets random location
    */
    public void jump()
    {
        currentRow = randomNumbers.nextInt(gridSize-1);
        currentCol = randomNumbers.nextInt(gridSize-1);
    }

    /**
        getCurrentRow method returns value in currentRow field
        @return value in currentRow field
    */
    public int getCurrentRow()
    {
        return currentRow+1;
    }

    /**
        getCurrentCol method returns value in currentCol field
        @return value in currentCol field
    */
    public int getCurrentCol()
    {
        return currentCol+1;
    }

    /**
        getCurrentValue method returns value in gameBoard
        at the currentRow/currentCol field
        @return value in gameBoard[currentRow][currentCol]
    */
    public int getCurrentValue()
    {
        currentValue = gameBoard[currentRow][currentCol];
        return currentValue;
    }

    /**
        goNorth method decreases value in currentRow
    */
    public void goNorth()
    {
      
        if (currentRow > 0)
        {
            currentRow = (currentRow -1);
             
        }
        if (currentRow <= 0)
        {
            System.out.println("\nYou've reached the edge of the world!");
        }

    }

    /**
        goSouth method increases value in currentRow
    */
    public void goSouth()
    {
       
        if (currentRow < (gridSize-1))
        {
            currentRow = (currentRow +1);
            
        }
        if (currentRow >= gridSize-1)
        {
            System.out.println("\nYou've reached the edge of the world!");
        }

    }

    /**
        goWest method decreases value in currentCol
    */
    public void goWest()
    {
        
        if (currentCol > 0)
        {
            currentCol = (currentCol -1);
        }
        if (currentCol <= 0)
        {
            System.out.println("\nYou've reached the edge of the world!");
        }

    }

    /**
        gatherDaisies method decreases current location in grid by
        80% and returns the value decremented
        @return value of 80% decrease in cell
    */
    public int gatherDaisies()
    {
        int daisiesGathered;
        int i = currentRow;
        int j = currentCol;
        daisiesGathered = (int)(gameBoard[i][j]*0.8);
        gameBoard[i][j] = (int)(gameBoard[i][j]*0.2);
        


        return daisiesGathered;
    }

    /**
        goEast method increases value in currentCol
    */
    public void goEast()
    {
        if (currentCol < (gridSize-1))
        {
            currentCol = (currentCol +1);
            
        }
        if (currentCol >= gridSize-1)
        {
            System.out.println("\nYou've reached the edge of the world!");
        }

    }

    /**
        getGridSize method returns size of grid
        @return value of gameBoard.length
    */
    public int getGridSize()
    {
        
        return gridSize;
    }

    /**
        toString method used to return a String representing this Grid
        @return a String representing this Grid
    */
    public String toString()
    {
        String stringToReturn = "";
        int row, col;
        

        for (row = 0; row < gameBoard.length; row++)
        {
            for (col = 0; col < gameBoard.length; col++)
            {
                if (gameBoard[row][col] < 100)
                    stringToReturn = stringToReturn + " ";
                if (gameBoard[row][col] < 10)
                    stringToReturn = stringToReturn + " ";
                stringToReturn = stringToReturn + gameBoard[row][col] + " ";
            }
            stringToReturn = stringToReturn + "\n";
        }


        return stringToReturn;
    }
}