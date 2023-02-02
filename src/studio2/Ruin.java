package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("What is your starting amount?");
		double startAmount = in.nextInt();
		System.out.println("What is your chance of winning?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		double winLimit = in.nextInt();
		System.out.println("How many simulation you want");
		int totalSimulation = in.nextInt();
		double winNumber=0;
		double loseNumber=0;
		double a = (1-winChance)/winChance;
		double expectedRuin;
		
		for (int dayCount = 1; dayCount <= totalSimulation; dayCount++)
		{
			System.out.print("Simulation " + dayCount + ": ");
			int roundNumber = 0;
			double startAmount1 = startAmount;
		while (startAmount1 < winLimit && startAmount1 >0)
		{
			if (Math.random() < winChance)
			{
			startAmount1++;
			roundNumber++;
			}
			else
			{
			startAmount1--;
			roundNumber++;
			}
		}	
		System.out.print(roundNumber+" ");
		if (startAmount1==0)
		{
			System.out.println("Ruin");
			loseNumber++;
		}
		else 
		{
			System.out.println("Success");
			winNumber++;
		}
		}
		if (winChance == .5) {
			expectedRuin = 1-startAmount/winLimit;
		}
		else {
		expectedRuin = (Math.pow(a, startAmount)-Math.pow(a, winLimit))/(1-Math.pow(a, winLimit));
		}
		double ruinRateSimulation = loseNumber/totalSimulation;
		System.out.print("Ruin rate from Simulation: "+ ruinRateSimulation + " Expected Ruin Rate: "+ expectedRuin);
	}

}
