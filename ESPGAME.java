/*
 * Class: CMSC203 
 * Instructor: Khanan Monshi
 * Description: (Give a brief description for each Class)
 * Due: 02/05/2024
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
		input.nextLine();
		
		final String COLOR_RED = "Red";
	    final String COLOR_GREEN = "Green";
	    final String COLOR_BLUE = "Blue";
	    final String COLOR_ORANGE = "Orange";
	    final String COLOR_YELLOW = "Yellow"; 
	    final String WRONG_COLOR = "";
	    
	    int rightGuess = 0;

	    for (int round = 1; round < 12; round++)
	    {
	       // Generate a random number from 0 to 4
	       int randomNumber = random.nextInt(5);
	       String color = "";
	       
	       switch (randomNumber) 
	       {
	       		case 0:
	                color = COLOR_RED;
	                break;
	            case 1:
	                color = COLOR_GREEN;
	                break;
	            case 2:
	                color = COLOR_BLUE;
	                break;
	            case 3:
	                color = COLOR_ORANGE;
	                break;
	            case 4:
	            	color = COLOR_YELLOW;
	                break;
	            default:
	            	System.out.println("\nRound " + round);
	    	        System.out.println("I am thinking of a color.");
	    		    System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
	    		    System.out.print("Enter your guess: ");
	    	        String userGuess = input.nextLine();
	    	        System.out.println("I was thinking of: " + color);
	        }
	       
	        System.out.println("\nRound " + round);
	        System.out.println("I am thinking of a color.");
		    System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
		    System.out.print("Enter your guess: ");
	        String userGuess = input.nextLine();
	        System.out.println("I was thinking of: " + color);
	        
	        if (userGuess.equalsIgnoreCase(color))
	        {
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
