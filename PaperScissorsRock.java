import java.util.Scanner;
import java.util.Random;

public class PaperScissorsRock
{
	public static void main(String[] args)
	{
		String round[] = new String[3];
		round[0] = "no use";
		round[1] = "first";
		round[2] = "second";
		
		Scanner sc = new Scanner(System.in);
		Random randomGen = new Random();
		int userInput, pc;
		int scoreOfPlayer = 0, scoreOfPc = 0;
		
		for(int i = 1; i <3; i++)
		{
			System.out.println("---The " + round[i] + " round---");
			System.out.println("Enter 0 for paper, 1 for scissors, or 2 for rock: ");
			
			userInput = sc.nextInt();
			pc = randomGen.nextInt(3);
			
			if(userInput == 0)
				System.out.println("Player picks paper");
			else if(userInput == 1)
				System.out.println("Player picks scissors");
			else if(userInput == 2)
				System.out.println("Player picks rock");
			else
			{
				System.out.println("Invalid input");
				System.exit(1);
			}
			
			if(userInput - pc == 1 || userInput - pc == -2)
			{
				System.out.println("Player gets one point");
				scoreOfPlayer++;
			}
			else if(userInput == pc)
				System.out.println("Draw");
			else
			{
				System.out.println("Computer gets one point");
				scoreOfPc++;
			}
		}
		
		System.out.println("Final results: ");
		System.out.println("Player v.s. Computer  " + scoreOfPlayer + " : " + scoreOfPc);
		
		if(scoreOfPlayer > scoreOfPc)
			System.out.println("Player wins!");
		else if(scoreOfPlayer < scoreOfPc)
			System.out.println("Computer wins!");
		else
			System.out.println("Nobody wins!");
		
		sc.close();
	}

}
