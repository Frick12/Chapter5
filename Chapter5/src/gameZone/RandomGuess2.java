package gameZone;

import java.util.Random;

import javax.swing.JOptionPane;
public class RandomGuess2 
{

	public static void main(String[] args) 
	{
		Random r1 = new Random();
		Random r2 = new Random();
		Random r3 = new Random();
		
		final int LOW = 1;
		final int HIGH = 10;
		int winnings;
		
		String msg;
		String msg1;
		String msg2;
		String mesg3;
		
		int result1 = r1.nextInt(9) + LOW;//result is the random number generator integer used
		int userGuess1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess a number between " + LOW + " and" + HIGH));
		int result2 = r2.nextInt(9) + LOW;
		int userGuess2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess a second number between " + LOW + " and" + HIGH));
		int result3 = r3.nextInt(9) + LOW;
		int userGuess3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess a third number between " + LOW + " and" + HIGH));
		
		if(userGuess1 == result1 && userGuess2 == result2 && userGuess3 == result3)
		{
			msg = "\n You win a million darn dollars!";
		}	
		if (userGuess1 == result1 && userGuess2 != result2 && userGuess3 != result3)
		{	
			msg = "\nYou got the first guess right.";
		}
		if (userGuess1 != result1 && userGuess2 == result2 && userGuess3 != result3)
		{	
			msg = "\nYou got the second guess right.";
		}
		if (userGuess1 != result1 && userGuess2 != result2 && userGuess3 == result3)
		{	
			msg = "\nYou got the third guess right.";
		}
		else
			msg = "\n You're a loser keep gambling and \nloose more money please.";
		
		JOptionPane.showMessageDialog(null, "The numbers are " + result1 + ", " + result2 + ", and " + result3 + msg);
	}

}
