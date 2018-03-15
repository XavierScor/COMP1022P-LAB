import java.util.Scanner;

public class SeparateDigits
{
	public static void main(String[] args)
	{
		int number;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int forthDigit;
		int fifthDigit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter FIVE digits: ");
		number = sc.nextInt();
		firstDigit = number % 10;
		secondDigit = number / 10 % 10;
		thirdDigit = number / 100 % 10;
		forthDigit = number / 1000 % 10;
		fifthDigit = number / 10000;
		
		sc.close();
		
		System.out.println(fifthDigit + "\t" + forthDigit + "\t" + thirdDigit + "\t" + secondDigit + "\t" + firstDigit);
	}

}
