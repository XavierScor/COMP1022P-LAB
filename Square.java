import java.util.Scanner;

public class Square
{
	public static void main(String[] args) 
    {
		int length = 0;
		int circumference = 0;
		int area = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the length of the side(integer): ");
		length = sc.nextInt();
		circumference = 4 * length;
		area = length * length;
		
		System.out.println("The circumference of the square is " + circumference);
		System.out.println("The area of the square is " + area);
		
		sc.close();
	}

}
