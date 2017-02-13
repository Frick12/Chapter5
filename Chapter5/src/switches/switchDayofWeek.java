package switches;

import java.util.Scanner;
public class switchDayofWeek 
{

	public static void main(String[] args) 
	{
		String day;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a day during the week for your schedule >>>");
		day = input.nextLine();
		
		switch(day)
		{
			case "Monday":
				System.out.println("Reserve room for Friday metting.");
				break;
			case "Tuesday":
			case "tuesday":
				System.out.println("Meeting with Principal your fired.");
				break;
			case "Wednesday":
			case "wednesday":	
				System.out.println("Deadline.");
				break;
			case "Thursday":
			case "thursday":	
				System.out.println("Order food for party.");
				break;
			case "Friday":
			case "friday":
				System.out.println("Go to the party.");
				break;
			case "Saturday":
			case "saturday":
				System.out.println("Sleep.");
				break;
			case "Sunday":
			case "sunday":
				System.out.println("Sleep more.");
				break;
			default:
				System.out.println("That day does not exist to the known realm");
				
		}
	}

}
