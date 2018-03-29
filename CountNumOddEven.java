import java.util.Scanner;

public class CountNumOddEven
{
    public static void main(String[] args)
    {
	int userInput, numEven = 0, numOdd = 0;
	Scanner sc = new Scanner(System.in);

	System.out.print("Please enter a list of positive numbers: ");
	
	userInput = sc.nextInt();
	while(userInput != -1)
	    {
		if(checkEven(userInput))
		    numEven++;
		else
		    numOdd++;
		userInput = sc.nextInt();
	    }

	System.out.println("Number of odd values: " + numOdd);
	System.out.println("Number of even values: " + numEven);
	
	sc.close();
    }

    public static boolean checkEven(int num)
    {
	if(num % 2 == 0)
	    return true;
	else
	    return false;
    }
}
