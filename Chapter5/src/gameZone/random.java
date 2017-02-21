package gameZone;

import java.util.Random;
import javax.swing.JOptionPane;

public class random 
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		final int LOW = 100;
		final int HIGH = 1000;
		String msg;
		int result = r.nextInt(1000) + LOW;//result is the random number generator integer used
		int userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess a number between " + LOW + " and" + HIGH));
		if(userGuess == result)
			msg = "\n Your guess was RIGHT!";
			else
				if(userGuess < result)
					msg = "\n Your Guess was too LOW";
					else
						msg = "\n Your Guess was too High";
			JOptionPane.showMessageDialog(null, "The number is " + result + "." + msg);
	}

}
