package rPS;
import java.util.*;
public class RPSGame {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Let's play Rock, Paper, Scissors");
		System.out.println("Pick your hand");
		String hand = k.nextLine();
		
		String computerHand="";
		int randNum = rand.nextInt(3)+1;
		if (randNum == 1) 
			computerHand = "Rock";
		
			
		else if (randNum == 2) 
			computerHand = "Paper";
		
		 else if (randNum == 3) 
			computerHand = "Scissors";
		
		System.out.println("Computer picked  "+ computerHand);
		System.out.println(chekcWinner(hand, computerHand));
		

	}
	
	public static String chekcWinner (String player, String computer) {
		String result = "";
	
		
		if (player.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Rock") || 
			player.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Scissors") ||
			player.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Paper")) {
			result = "It's a Draw";	
			}
		else if (player.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors") || 
				player.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper") ||
				player.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) {
				result = "You Win :)";	
				}
		else if (player.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Rock") || 
				player.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Scissors") ||
				player.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Paper")) {
				result = "Computer Wins!";	
				}
		else {
			result = "Please check spelling";
		}
		return result;
			
		
				
			
	}
	
		
	

}
