package studio2;
import java.util.Scanner;
public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in); 
		System.out.println ("How many darts are you throwing?");
		int darts = in.nextInt();
		int inCircle = 0;
		for (int i = 0; i < darts; i++)
		{
			double x = Math.random();
			double y = Math.random();
			double distanceFromCenter = Math.sqrt(Math.pow((x-0.5), 2) + Math.pow((y-0.5), 2));
			
			if (distanceFromCenter < 0.5) 
			{
				inCircle++;
			}
			
		}
		
		System.out.println("Pi is ");
		System.out.print(4.0 * inCircle/darts);
		
	}

}
