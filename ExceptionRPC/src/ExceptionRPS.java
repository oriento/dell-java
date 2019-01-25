import java.util.Random;
import java.util.Scanner;

public class ExceptionRPS {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Random rand = new Random();
		try {
		System.out.println("Let's play Rock, Paper, Scissors");
		System.out.println("Pick your hand");
		String hand = k.nextLine();
		
		
		    if(hand.equalsIgnoreCase("rock") || hand.equalsIgnoreCase("paper")||hand.equalsIgnoreCase("scissors")==true)
		    {
		    	//random computer hand start
				String computerHand="";
				int randNum = rand.nextInt(3)+1;
				if (randNum == 1) 
					computerHand = "Rock";
				
					
				else if (randNum == 2) 
					computerHand = "Paper";
				
				 else if (randNum == 3) 
					computerHand = "Scissors";
				//random computer hand end 
				
				System.out.println("Computer picked  "+ computerHand);
				System.out.println(chekcWinner(hand, computerHand));
		    }
		   // System.out.println("Result = " + result);
		  }
		 
		  // catch block
		 
		  catch (Exception e) {
		    System.out.println();
		  }
		
		
		

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
		//else {
			//result = "Please check spelling";
		//}
		return result;
			
		
				


	}

}
