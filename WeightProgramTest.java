import java.util.Scanner;

public class WeightProgramTest
{
	public static void main(String[] args)
	{
		int[] commonWeight = {100, 50, 20, 10, 5, 2, 1};
		Scanner userInput = new Scanner(System.in);
		int orange, banana;
		int totalWeight = 0;
		
		System.out.println("Weight Program");
		System.out.print("Enter number of oranges to buy: ");
		orange = userInput.nextInt();
		System.out.print("Enter number of bananas to buy: ");
		banana = userInput.nextInt();
		
		totalWeight = orange * 108 + banana * 112;
		
		for(int currentCriteria : commonWeight)
		{
			if(totalWeight >= currentCriteria){
				int number =  totalWeight / currentCriteria;
				System.out.println(currentCriteria + "-weight: " + number);
				totalWeight = totalWeight % currentCriteria;
			}
			if(totalWeight == 0)break;
		}
		
		userInput.close();
	}

}
