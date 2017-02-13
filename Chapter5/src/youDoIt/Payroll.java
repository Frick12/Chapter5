package youDoIt;

import java.util.Scanner;
public class Payroll 
{

	public static void main(String[] args) 
	{
		double hoursWorked;
		double rateOfPay;
		double grossPay;
		double netPay;
		final int FULL_WEEK = 32;
		final int OT_RATE = 2;
		final double GovernmentGetHalf = .5;
		double afterTax;
		Scanner input = new Scanner(System.in);
		System.out.println("How many hours did you work?");
		hoursWorked = input.nextDouble();
		System.out.println("What is your Rate of Pay?");
		rateOfPay = input.nextDouble();
		
		if(hoursWorked > FULL_WEEK)
		{
			grossPay = (FULL_WEEK * rateOfPay) * OT_RATE;
			netPay = ((FULL_WEEK * rateOfPay) * OT_RATE) * GovernmentGetHalf;
		}
		else
		{
			grossPay = (hoursWorked * rateOfPay);
			netPay = (hoursWorked * rateOfPay) * GovernmentGetHalf;
		}
		System.out.println("Gross pay is $" + grossPay + ", net pay is $" + netPay);
	}

}
