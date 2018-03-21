import java.util.Scanner;

public class PrimePlus
{
    public static void main(String[] args)
    {
	int userInput = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	userInput = sc.nextInt();

	for(int j = 1; j <= userInput; j++)
	       outputPrime(j);

	sc.close();
    }

    public static void outputPrime(int num)
    {
	int check = 0;
	for(int i = 2; i < num; i++)
	    {
		if(num % i == 0)
		    check += 1;  
	    }
	if(check == 0)
	    System.out.print(num + "\t");
    }
}
