import java.util.Scanner;

public class Prime
{
	public static void main(String[] args)
	{
		int userInput = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter a number: ");
		userInput = sc.nextInt();
		
		if(checkPrime(userInput))
			System.out.println(userInput + " is a prime number.");
		else
			System.out.println(userInput + " is not a prime number.");
		
		sc.close();
	}
	
	public static boolean checkPrime(int num)
	{
		int check = 0;
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				check++;
			}
		}
		
		if(check == 0)
			return true;
		else
			return false;
	}

}
