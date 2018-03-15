import java.util.Scanner;

public class WeightProgram
{
	public static void main(String[] args)
	{
		int weight_100g, weight_50g, weight_20g, weight_10g, weight_5g, weight_2g, weight_1g;
		int orange = 0, banana = 0;
		int totalWeight;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Weight Program");
		System.out.print("Enter number of oranges to buy: ");
		orange = userInput.nextInt();
		System.out.print("Enter number of bananas to buy: ");
		banana = userInput.nextInt();
		
		totalWeight = orange * 108 + banana * 112;
		weight_100g = totalWeight / 100;
		weight_50g = totalWeight % 100 / 50;
		weight_20g = totalWeight % 100 % 50 / 20;
		weight_10g = totalWeight % 100 % 50 % 20 / 10;
		weight_5g = totalWeight % 100 % 50 % 20 % 10 / 5;
		weight_2g = totalWeight % 100 % 50 % 20 % 10 % 5 / 2;
		weight_1g = totalWeight % 100 % 50 % 20 % 10 % 5 % 2;
		
		System.out.println("100g-weight: " + weight_100g);
		System.out.println("50g-weight: " + weight_50g);
		System.out.println("20g-weight: " + weight_20g);
		System.out.println("10g-weight: " + weight_10g);
		System.out.println("5g-weight: " + weight_5g);
		System.out.println("2g-weight: " + weight_2g);
		System.out.println("1g-weight: " + weight_1g);
		
		userInput.close();
	}

}
