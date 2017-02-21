package youDoIt;

import java.util.Random;

import javax.swing.JOptionPane;
public class RockPaperScissors 
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		
		int user;
		final int LOW = 0;
		final int HIGH = 2;
		String msg;
		//String userPick;
		//String computerPick;
		
		int computer = r.nextInt(2);
		user = Integer.parseInt(JOptionPane.showInputDialog(null, "Please pick \n0 for Rock \n1 for Paper \n2 for Scissors."));
		
		if(user == 0 && computer == 0)
		{
			msg = "Tie";
			JOptionPane.showMessageDialog(null, msg);
		}
		if(user == 1 && computer == 1)
		{
			msg = "Tie";
			JOptionPane.showMessageDialog(null, msg);
		}
		if(user == 2 && computer == 2)
		{
			msg = "Tie";
			JOptionPane.showMessageDialog(null, msg);
		}
		if(user == 0 && computer == 2)
		{
			msg = "Rock beats Scissors \nYou Win";
			JOptionPane.showMessageDialog(null, msg);
		}
		if(user == 0 && computer == 1)
		{
			msg = "Paper beats Rock \nYou lose";
			JOptionPane.showMessageDialog(null, msg);
		}
		if(user == 1 && computer == 2)
		{
			msg = "Scissors beat Paper \nYou Lose";
			JOptionPane.showMessageDialog(null, msg);
		}
		if(user == 1 && computer == 0)
		{
			msg = "Paper beats Rock \nYou Win";
			JOptionPane.showMessageDialog(null, msg);
		}
		if(user == 2 && computer == 0)
		{
			msg = "Rock beats Scissors \nYou Lose";
			JOptionPane.showMessageDialog(null, msg);
		}
		if(user == 2 && computer == 1)
		{
			msg = "Scissors beat Paper \nYou Win ";
			JOptionPane.showMessageDialog(null, msg);
		}
	}

}
