import java.util.Random;
import java.util.Scanner;

/**
 * NumberGuess.java
 * 
 * The Number Guessing Game  
 * A random number is generated between higher and lower numbers range
 * 
 * @author Mallik Gonepalli
 *
 */

public class NumberGuess {

	private static int minRange=0;
	private static int maxRange=100;
	private static boolean found=false;
	private static int guessNumber=0;
	
	/**
	 * The Main method
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		
		//Input taken from user
		Scanner userInput=new Scanner(System.in);
		System.out.println("Please Enter ready to start");
		String input=userInput.next();
		Random randomComputerNumber=new Random(); 
		if(input.toLowerCase().equals("ready")){
			
			while(!found){//found is the boolean to terminate the loop 
			    //Get the random number 
		        guessNumber=randomComputerNumber.nextInt((maxRange-minRange)+1)+minRange;
		        
		        System.out.println("Is the nummber "+guessNumber+"?");
		        
				input=userInput.next();
				//Check the user input
				if (input.toLowerCase().equals("higher")){
				    //Updating the minRange to guessNumber
				    minRange=guessNumber;
				} else if (input.toLowerCase().equals("lower")){
				     //Updating the maxRange to guessNumber
				    maxRange=guessNumber;
				} else if (input.toLowerCase().equals("yes")){
				    found=true;
				    System.out.println("End of Program ");
				} else {
				    System.out.println("Wrong Entry, Please enter lower or higher or yes... ");
				}
			}		
		}
		else{
			System.out.println("Restart the Program again ");
		}
	}	

}
