import java.util.Scanner;

public class PythagoreanTriple
{
    public static void main(String[] args)
    {
	int userInput;
	Scanner sc = new Scanner(System.in);

	System.out.print("Please enter the limit: ");
	userInput = sc.nextInt();
	for(int i = 1; i <= userInput; i++)
	    {
		for(int j = 1; j < i; j++)
		    {
			for(int k = 1; k < j; k++)
			    if(k*k + j*j == i*i)
				System.out.println(k + ", " + j + ", " + i);
		    }
	    }
	sc.close();
    }
}
