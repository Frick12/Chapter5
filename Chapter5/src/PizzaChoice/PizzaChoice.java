package PizzaChoice;

import java.util.Scanner;
public class PizzaChoice 
{

	public static void main(String[] args) 
	{
		String choiceYes;//user is selecting that they have made a choice
		String size;
		String pizzaKind;
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double smallCost = 6.99;
		double sliceCost = 1.99;
		double extraLargeCost = 14.99;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Would you like a pizza? Yes or No >> ");
		choiceYes = input.nextLine();
		//if you want pizza or not
		if("Yes".equals(choiceYes) || "yes".equals(choiceYes))
		{
			System.out.print("You said " + choiceYes + " to have a pizza.");
			System.out.print("Please choose a size, \na slice of, small, medium, large, or extra large >>");
			size = input.nextLine();//this determines the size of the pizza
			if("small".equals(size) || "medium".equals(size) || "large".equals(size) || "slice of".equals(size) || "extra large".equals(size))
			{
				System.out.print("You said " + size + " pizza size.");
				System.out.print("What kind of pizza would yo like? \nPepperoni, Sausage, Cheese, Meatlovers, Vegetable, Taco >>");
				pizzaKind = input.nextLine();
				if("Pepperoni".equals(pizzaKind) || "Sausage".equals(pizzaKind) || "Cheese".equals(pizzaKind) || 
						"pepperoni".equals(pizzaKind) || "sausage".equals(pizzaKind) || "cheese".equals(pizzaKind) || "taco".equals(pizzaKind)
						|| "vegetable".equals(pizzaKind) || "meatlovers".equals(pizzaKind) || "Meatlovers".equals(pizzaKind) || "Taco".equals(pizzaKind)
						|| "vegetable".equals(pizzaKind))
				{
					System.out.print("You said " + pizzaKind + ". That sounds delicious.");
					System.out.print("\nYour order consists of a " + size + " " +  pizzaKind + " pizza.");
					if("large".equals(size))
					{
						System.out.print("\nYour pizza costs $" + largeCost);
					}
					if("medium".equals(size))
					{
						System.out.print("\nYour pizza costs $" + mediumCost);
					}
					if("small".equals(size))
					{		
						System.out.print("\nYour pizza costs $" + smallCost);
					}
					if("extra large".equals(size))
					{
						System.out.print("\nYour pizza costs $" + extraLargeCost);
					}
					else
						System.out.print("\nYour pizza costs $" + sliceCost);
					
			}
		}
		
	}

}
}