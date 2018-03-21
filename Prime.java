import java.util.Scanner;

public class Prime
{
    public static void main(String[] args)
    {
	int userInput = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	userInput = sc.nextInt();

	checkPrime(userInput);

	sc.close();
    }

    public static void checkPrime(int num)
    {
	int check = 0;
	for(int i = 2; i < num; i++)
	    {
		if(num % i == 0)
		    check += 1;  
	    }
	if(check > 0)
	    System.out.println(num + " is not a prime number.");
	else
	    System.out.println(num + " is a prime number.");
    }
}
