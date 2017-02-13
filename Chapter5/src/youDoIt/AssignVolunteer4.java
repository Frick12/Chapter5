package youDoIt;

import java.util.Scanner;

public class AssignVolunteer4 
{

	public static void main(String[] args) 
	{
		int donationType;
		String volunteer;
		String message;
		final int CLOTHING_CODE = 1;
		final int FURNITURE_CODE = 2;
		final int ELECTRONICS_CODE = 3;
		final int OTHER_CODE = 4;
		final String CLOTHING_PRICER = "Regina";
		final String OTHER_PRICER = "Marco";
		final String FURNITURE_PRICER = "Walter";
 		final String ELECTRONICS_PRICER = "Lydia";
		
		Scanner input = new Scanner(System.in);
		System.out.println("What type of donation is this? ");
		System.out.println("Enter " + CLOTHING_CODE + " for clothing, " + FURNITURE_CODE + " for furniture, " + 
				ELECTRONICS_CODE + " for electronic, " + OTHER_CODE + " for anything else...");
		donationType = input.nextInt();
		
		switch(donationType)
		{
			case(CLOTHING_CODE):
				volunteer = CLOTHING_PRICER;
				message = "This is a clothing donation";
				break;
			case(OTHER_CODE):
				volunteer = OTHER_PRICER;
				message = "This is a non-clothing donation";
				break;
			case(FURNITURE_CODE):
				volunteer = FURNITURE_PRICER;
				message = "This is a furniture donation";
				break;
			case(ELECTRONICS_CODE):
				volunteer = ELECTRONICS_PRICER;
				message = "This is an electronic donation";
				break;
			default:
				volunteer = "invalid";
				message = "This is an invalid donation type.";
		}		
		System.out.println("You entered " + donationType);
		System.out.println(message);
		System.out.println("The volunteer who will price this item is " + volunteer);
	}	
}
