/*
 * Class: CMSC203 
 * Instructor: Khansan Monshi
 * Description: (Give a brief description for each Class)
 * Due: 02/04/2024
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Nabait Tekleab
*/
import java.util.Random;
import java.util.Scanner;

public class ESPGAME 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random random = new Random();
	
		String name;
		System.out.print("Enter your name: ");
		name = input.nextLine();
	
		String description;
		System.out.print("Describe yourself: ");
		description = input.nextLine();
	
		String mcNum;
		System.out.print("What is your MC #?");
		mcNum = input.nextLine();
	
		String dueDate;
		System.out.print("Due Date: ");
		dueDate = input.nextLine();
	
		System.out.println("CMSC203 Assignment 1: test your ESP skills!");
		// input.nextLine();
		
		final String COLOR_RED = "Red";
	    final String COLOR_GREEN = "Green";
	    final String COLOR_BLUE = "Blue";
	    final String COLOR_ORANGE = "Orange";
	    final String COLOR_YELLOW = "Yellow";
	    
	    int rightGuess = 0;

	    for (int round = 1; round <= 11; round++) 
	    {
	    	int randomNumber = (int)(Math.random() * 6);
   
	    	String selectedColor = "";
	    	if (randomNumber == 0) 
	    	{
	    		selectedColor = COLOR_RED;
	    	} 
	    	else if (randomNumber == 1) 
	    	{
	    		selectedColor = COLOR_GREEN;
	    	} 
	    	else if (randomNumber == 2) 
	    	{
	    		selectedColor = COLOR_BLUE;
	    	} 
	    	else if (randomNumber == 3) 
	    	{
	    		selectedColor = COLOR_ORANGE;
	    	} 
	    	else if (randomNumber == 4) 
	    	{
	    		selectedColor = COLOR_YELLOW;
	    	} 
	    
	    
	    System.out.println("\nRound " + round);
    	System.out.println("I am thinking of a color.");
        System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
        System.out.print("Enter your guess: ");
        String guesses = input.nextLine();

        System.out.println("I was thinking of " + selectedColor + ".");
        
        
        
        if (guesses.equalsIgnoreCase(selectedColor)) {
            rightGuess++;
        }
        
      }
	    System.out.println("\nGame Over\n");
        System.out.println("You guessed " + rightGuess + " out of 11 colors correctly.");
        System.out.println("Student Name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + dueDate);
	  
	}

}
