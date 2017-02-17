package DelgadosTacos;

import java.util.Scanner;
import java.text.DecimalFormat;
public class DelgadosChoice 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int order;
		double tacoPrice = 0.99;
		double burritoPrice = 1.99;
		double churroPrice = .99;
		double popPrice = 1.49;
		double tacoSaladPrice = 1.49;
		double chimichangaPrice = 1.49;
		double enchiladasPrice = 5.99;
		double tamalesPrice = 1.99;
		double fajitaPrice = 1.99;
		double waterPrice = 0.25;
		double tacoOrdered;
		double burritoOrdered;
		double churroOrdered;
		double popOrdered;
		double tacoSaladOrdered;
		double chimichangaOrdered;
		double enchiladasOrdered;
		double tamalesOrdered;
		double fajitaOrdered;
		double waterOrdered;
		double totalPrice;
		double totalPriceWithTax;
		
		tacoTruck();
		menu();
		
		System.out.println("Welcome to Degado's Tacos \nWhat would you like to order? Please select the number beside it.");
		order = input.nextInt();
		if(order == 1)
		{
			System.out.println("I see you like tacos, how many would you like? >>");
			tacoOrdered = input.nextInt();
			input.nextLine();
			totalPrice = (tacoPrice * tacoOrdered);
			System.out.println("You ordered " + tacoOrdered + " Tacos, that will be $" + (df.format(totalPrice)));
		}
		if(order == 2)
		{
			System.out.println("I see you like burritos, how many would you like? >>");
			burritoOrdered = input.nextInt();
			input.nextLine();
			totalPrice = (burritoPrice * burritoOrdered);
			System.out.println("You ordered " + burritoOrdered + " Burritos, that will be $" + (df.format(totalPrice)));
		}
		if(order == 3)
		{
			System.out.println("I see you like tacos, how many would you like? >>");
			churroOrdered = input.nextInt();
			input.nextLine();
			totalPrice = (churroPrice * churroOrdered);
			System.out.println("You ordered " + churroOrdered + " Churros, that will be $" + (df.format(totalPrice)));
		}
		if(order == 4)
		{
			System.out.println("I see you like pop, how many would you like? >>");
			popOrdered = input.nextInt();
			input.nextLine();
			totalPrice = (popPrice * popOrdered);
			System.out.println("You ordered " + popOrdered + " Pops, that will be $" + (df.format(totalPrice)));
		}
		if(order == 5)
		{
			System.out.println("I see you like chimichangas, how many would you like? >>");
			chimichangaOrdered = input.nextInt();
			input.nextLine();
			totalPrice = (chimichangaPrice * chimichangaOrdered);
			System.out.println("You ordered " + chimichangaOrdered + " Chimichangas, that will be $" + (df.format(totalPrice)));
		}
		if(order == 6)
		{
			System.out.println("I see you like enchiladas, how many would you like? >>");
			enchiladasOrdered = input.nextInt();
			input.nextLine();
			totalPrice = (enchiladasPrice * enchiladasOrdered);
			System.out.println("You ordered " + enchiladasOrdered + " Enchiladas, that will be $" + (df.format(totalPrice)));
		}
		if(order == 7)
		{
			System.out.println("I see you like tamales, how many would you like? >>");
			tamalesOrdered = input.nextInt();
			input.nextLine();
			totalPrice = (tamalesPrice * tamalesOrdered);
			System.out.println("You ordered " + tamalesOrdered + " Tamales, that will be $" + (df.format(totalPrice)));
		}
		if(order == 8)
		{
			System.out.println("I see you like fajitas, how many would you like? >>");
			fajitaOrdered = input.nextInt();
			input.nextLine();
			totalPrice = (fajitaPrice * fajitaOrdered);
			System.out.println("You ordered " + fajitaOrdered + " Fajitas, that will be $" + (df.format(totalPrice)));
		}
		if(order == 9)
		{
			System.out.println("I see you like taco salads, how many would you like? >>");
			tacoSaladOrdered = input.nextInt();
			input.nextLine();
			totalPrice = (tacoSaladPrice * tacoSaladOrdered);
			System.out.println("You ordered " + tacoSaladOrdered + " Taco Salads, that will be $" + (df.format(totalPrice)));
		}
		if(order == 10)
		{
			System.out.println("I see you like water, how many would you like? >>");
			waterOrdered = input.nextInt();
			input.nextLine();
			totalPrice = (waterPrice * waterOrdered);
			System.out.println("You ordered " + waterOrdered + " Water Bottles, that will be $" +  (df.format(totalPrice)));
		}
	}
	
	public static void menu()
	{
		System.out.println("******************************");
		System.out.println("  1.   Tacos Price - 0.99     ");
		System.out.println("  2.   Burrito Price - 1.99   ");
		System.out.println("  3.   Churro Price - 0.99    ");
		System.out.println("  4.   Pop Price - 1.49       ");
		System.out.println("  5.   Chimichangas - 1.49    ");
		System.out.println("  6.   Enchiladas - 5.99      ");
		System.out.println("  7.   Tamales Price - 1.99   ");
		System.out.println("  8.   Fajitas Price - 1.99   ");
		System.out.println("  9. Taco Salad Price - 1.99  ");
		System.out.println(" 10.   Water Price - 0.25     ");
		System.out.println("******************************");
	}
	
	public static void tacoTruck()
	{
		System.out.println("*********************************");
		System.out.println("*   Delgados's Amazing Tacos    ****");
		System.out.println("*       *******************	       ***");
		System.out.println("*       *                 *	  ****   **");
		System.out.println("*       *   O   O   O     *	  *	  *  **");
		System.out.println("*       *  -|- -|- -|-    *   *****	  *******");
		System.out.println("*       *******************	                ***");
		System.out.println("*                       	                  **");
		System.out.println("*       Worlds Best Tacos                      **");
		System.out.println("*     *****                         *****     **");
		System.out.println("******     *************************     ******");
		System.out.println("     *     *                       *     *");
		System.out.println("      *****                         *****");
	}
}
