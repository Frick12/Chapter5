package switches;

import java.util.Scanner;
public class switchStatementAge 
{

	public static void main(String[] args) 
	{
		int user;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How old are you? >>>");
		user = input.nextInt();
		switch(user)
		{
			case 18:
				System.out.println("You are 18.");
			case 19:
			case 20:
			case 21:
				System.out.println("You are between 19 and 21.");
				break;
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
				System.out.println("You are between 22 and 30.");
				break;
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
				System.out.println("You are between 31 and 35.");
				break;
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
				System.out.println("You are between 36 and 40.");
				break;
			default:
				System.out.println("No way you are that old.");
				break;
		}
	}

}
