import java.util.Scanner;

public class SeparateDigitsTest
{
	public static void main(String[] args)
	{
		long number;
		long digit;
		String finalOutput = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter FIVE digits: ");
		number = sc.nextLong();
		
		while (number / 10 != 0)
		{
			digit = number % 10;
			finalOutput = finalOutput + "\t" + digit;
			number = number / 10;
		}
		
		finalOutput = finalOutput + "\t" + number;
		String reverse = new StringBuffer(finalOutput).reverse().toString();
		
		System.out.print(reverse);
		
		sc.close();
	}

}
