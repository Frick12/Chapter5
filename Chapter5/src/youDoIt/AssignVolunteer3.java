package youDoIt;

import java.util.Scanner;

public class AssignVolunteer3 
{

	public static void main(String[] args) 
	{
		int donationType;
		String volunteer;
		String message;
		final int CLOTHING_CODE = 1;
		final int OTHER_CODE = 2;
		final String CLOTHING_PRICER = "Regina";
		final String OTHER_PRICER = "Marco";
		
		Scanner input = new Scanner(System.in);
		System.out.println("What type of donation is this? ");
		System.out.println("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else...");
		donationType = input.nextInt();
		
		if(donationType == CLOTHING_CODE)
		{
			volunteer = CLOTHING_PRICER;
			message = "This is a clothing donation";
		}
		if(donationType == OTHER_CODE)
		{
			volunteer = OTHER_PRICER;
			message = "This is a non-clothing donation";
		}
		else
		{
			message = "You're stupid";
			System.out.println("Please try again and enter 1 or 2, idiot....");
			volunteer = "NOBODY";
		}
		
		System.out.println("You entered " + donationType);
		System.out.println(message);
		System.out.println("The volunteer who will price this item is " + volunteer);
	}	
}
