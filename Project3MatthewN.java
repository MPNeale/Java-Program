package project3matthewn;
import java.util.Scanner;

/**
 *
 * @author Matthew Neale
 */
public class Project3MatthewN 
{
    
    public static void main(String[] args)
    {
        int daisiesGathered = 0;
        int totalDaisies = 0;
        int numberOfJumps = 0;
        int numberOfGathers = 0;
        String choiceInput;
        char choice;
        Scanner keyBoard = new Scanner(System.in);
        Grid gameBoard = new Grid(10);
        
        
        System.out.print("Welcome to Thy Dungeon Master Extreme!!\n" +
                "Gather as much loot as possible in your 10x10 dungeon\n" +
                "You may only gather 80% of the loot at a time from each spot\n" +
                "You will start in a random position and have seven choices:\n" +
                "Gather, Jump, North, South, East, West, Map, Quit\n" +
                "Good luck Dungeon Master!!\n\n");
        
        
        System.out.println("You are in spot [" + gameBoard.getCurrentRow() +
                "," + gameBoard.getCurrentCol() + "]");
        
        System.out.println("There is " + gameBoard.getCurrentValue() +
                " loot located here\n");
        
        System.out.println("You currently have a total of " + 
                 totalDaisies + " loot");
        
        System.out.print("What would you like to do? " + 
                "(G, J, N, S, E, W, M, Q): ");
                choiceInput = keyBoard.nextLine();
                choice = choiceInput.charAt(0);
        
        while (choice != 'Q' && choice != 'q')
        {    
            if (choice == 'G' || choice == 'g')
            {
                daisiesGathered = gameBoard.gatherDaisies();
                System.out.println("\nYou just gathered " + daisiesGathered +
                        " loot from this spot!\n");
                totalDaisies += daisiesGathered;
                
                numberOfGathers = numberOfGathers+1;
            }
            if (choice == 'J' || choice == 'j')
            {
                System.out.println("\nJump!\n");
                gameBoard.jump();
                numberOfJumps = numberOfJumps+1;
            }
            if (choice == 'N' || choice == 'n')
            {
                System.out.println("\nYou move northward\n");
                gameBoard.goNorth();
            }
            if (choice == 'S' || choice == 's')
            {
                System.out.println("\nYou move southward\n");
                gameBoard.goSouth();
            }
            if (choice == 'E' || choice == 'e')
            {
                System.out.println("\nYou move eastward\n");
                gameBoard.goEast();
            }
            if (choice == 'W' || choice == 'w')
            {
                System.out.println("\nYou move westward\n");
                gameBoard.goWest();
            }
            if (choice == 'M' || choice == 'm')
            {
                System.out.println("\nMap of Grid:");
                System.out.println(gameBoard);
            }
            
        System.out.println("You are in spot [" + gameBoard.getCurrentRow() +
                "," + gameBoard.getCurrentCol() + "]");
        
        System.out.println("There is " + gameBoard.getCurrentValue() +
                " loot located here\n");
        
        System.out.println("You currently have a total of " + 
                 totalDaisies + " loot");
        
        System.out.print("What would you like to do? " + 
                "(G, J, N, S, E, W, M, Q): ");
                choiceInput = keyBoard.nextLine();
                choice = choiceInput.charAt(0);
            
        }
        
        System.out.println("\nExquisite dungeoning!");
        System.out.println("\nYou gathered a total of " + totalDaisies + 
                " loot");
        System.out.println("You did it in " + numberOfJumps + " jumps and " + 
                numberOfGathers + " lootings");
        
    }
    
}
