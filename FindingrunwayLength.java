import java.util.Scanner;

public class FindingrunwayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//(Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v,
//you can compute the minimum runway length needed for an airplane to take off using the following formula: length = v^2 /2a .
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the speed and acceleration : ");
		
		double speed = input.nextInt();
		double acceleration = input.nextDouble();
		
		double runwayLength = (( Math.pow(speed, 2)) / (2*acceleration));
		
		System.out.print("The minimum runway length for this airplane is :" + runwayLength);
		
		
		
	}

}
