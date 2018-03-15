import java.util.Scanner;

public class February
{
    public static void main(String[] args)
    {
	int userInput;
	Scanner sc = new Scanner(System.in);

	userInput = sc.nextInt();

        if(userInput < 0)
	    System.out.println("Invalid input");
	else if(userInput % 400 == 0 || userInput % 4 == 0 && userInput % 100 != 0)
	    System.out.println("The number of days in February " + userInput + " is 29");
	else
	    System.out.println("The number of days in February " + userInput + " is 28");
    }
}
	    
