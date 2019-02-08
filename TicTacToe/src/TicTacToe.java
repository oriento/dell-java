import java.util.*;

public class TicTacToe {
	public static String [][] board = { {" "," "," "},
            			  {" "," "," "},
            			  {" "," "," "}};

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		int turn = 1;
		
		while(turn<=9&&checkForWin()==false)
		{
			String play;
			if(turn%2==1) {
				System.out.println("Player 1, please pick a position:");
				play = "X";
			}
			else {
				System.out.println("Player 2, please pick a position:");
				play = "O";
			}
			System.out.println("_"+1+"_|_"+2+"_|_"+3+"_");
			System.out.println("_"+4+"_|_"+5+"_|_"+6+"_");
			System.out.println(" "+7+" | "+8+" | "+9+" ");
			int input = k.nextInt();
			board [(input-1)/3][(input-1)%3] = play;
			System.out.println("Board:");
			System.out.println("_"+board[0][0]+"_|_"+board[0][1]+"_|_"+board[0][2]+"_");
			System.out.println("_"+board[1][0]+"_|_"+board[1][1]+"_|_"+board[1][2]+"_");
			System.out.println(" "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" ");
			turn++;
			
		}//end while loop
		

	}
	
	public static boolean checkForWin()
	{
		ArrayList list = new ArrayList<String>();
		
		for(int i = 0; i<3; i++) {
			list.add(board[0][i] + board[1][i] + board[2][i]);
			list.add(board[i][0] + board[i][1] + board[i][2]);
		}
		list.add(board[0][0] + board[1][1] + board[2][2]);
		list.add(board[0][2] + board[1][1] + board[2][0]);
		
		for (int i =0; i<list.size();i++) {
			String line = (String) list.get(i);
			if(line.equals("XXX")) {
				System.out.println("Player 1 Wins!");
				return true;
			}
			if(line.equals("OOO")) {
				System.out.println("Player 2 Wins!");
				return true;
			}
		}
		return false;
	}

}
