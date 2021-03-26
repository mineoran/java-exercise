import java.util.Scanner;

public class CalculatýngEnergy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Q = M * (finalTemperature – initialTemperature) * 4184
//(Science: calculating energy) Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature.
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		double waterinKilograms = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double energyQ =  waterinKilograms * (finalTemperature - initialTemperature) * 4184 ;
		
		System.out.print("The energy  needed is " + energyQ );
		
		
				
	}

}
