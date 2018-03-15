import java.util.Scanner;
import java.util.Random;

public class PaperScissorsRock
{
    public static void main(String[] args)
    {
	System.out.println("Paper, Scissors, Rock");

	String round[] = new String[3];
	round[0] = "Zero";
	round[1] = "First";
	round[2] = "Second";
	Scanner sc = new Scanner(System.in);
	int userInput;
	Random randomGen = new Random();
	int pc;
	int scoreOfPlayer = 0, scoreOfPc = 0;

	for(int i = 1; i < 3; i++)
	    {
		System.out.println("---The " + round[i] + "round---");
		System.out.println("Enter 0 for paper, 1 for scissors, or 2 for rock:");

		userInput = sc.nextInt();
		pc = randomGen.nextInt(3);

		if(userInput == 0)
		    System.out.println("Player picks paper");
		else if(userInput == 1)
		    System.out.println("Player picks scissors");
		else
		    System.out.println("Player picks rock");

		if(pc == 0)
		    System.out.println("Computer picks paper");
		else if(pc == 1)
		    System.out.println("Computer picks scissors");
		else
		    System.out.println("Computer picks rock");

		if(userInput - pc == 1 || userInput - pc == -2)
		    {
			System.out.println("Player gets one point");
			scoreOfPlayer++;
		    }
		else if(userInput == pc)
		    {
			System.out.println("Draw");
		    }
		else if(pc - userInput == 1 || pc - userInput == -2)
		    {
			System.out.println("Computer gets one point");
			scoreOfPc++;
		    }
		else
		    {
			System.out.println("Invalid input");
			System.exit(0);
		    }
	    }
	
	System.out.println("Fianl result:");
	System.out.println("Player v.s. Computer  " + scoreOfPlayer + " : " + scoreOfPc);
	if(scoreOfPlayer > scoreOfPc)
	    System.out.println("Player wins!");
	else if(scoreOfPlayer == scoreOfPc)
	    System.out.println("Nobody wins!");
	else
	    System.out.println("Computer wins!");
    }
}
