import java.util.Scanner;

public class PrimePlus
{
	public static void main(String[] args)
	{
		int userInput = 0;
		int count = 0;
		int step = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter a number: ");
		userInput = sc.nextInt();
		
	    while(count <= userInput)
		{
	    	step++;
	    	
		    if(Prime.checkPrime(step))
		    {
			    System.out.print(step + "\t");
			    count++;
		    }
		}
		
		sc.close();
	}

}
