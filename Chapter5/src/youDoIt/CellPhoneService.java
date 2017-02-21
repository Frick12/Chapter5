/**
 * 
 */
package youDoIt;

/**
 * @author SF137412
 *
 */
import javax.swing.JOptionPane;
public class CellPhoneService 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int planA = 1;
		int planB = 2;
		int planC = 3;
		int planD = 4;
		int planE = 5;
		int planF = 6;
		int user1;
		
		user1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Here are our plans"
				+ "\n(1)Plan A: <500 minutes of talk, No Text or Data $49 per month"
				+ "\n(2)Plan B: <500 minutes of talk, any text $55 per month"
				+ "\n(3)Plan C: >500 minutes of talk, 100 texts $61 per month"
				+ "\n(4)Plan D: >500 minutes of talk, 100+ texts $70 per month"
				+ "\n(5)Plan E: Plan D + 2 gigabytes of data, $79 per month"
				+ "\n(6)Plan F: PLan D + 2+ gigabytes of data, $87 per month"));
		
		if (user1 == 1)
		{
			JOptionPane.showMessageDialog(null,"You chose Plan A \nThat will be $49 per month.");
		}
		if (user1 == 2)
		{
			JOptionPane.showMessageDialog(null,"You chose Plan B \nThat will be $55 per month.");
		}
		if (user1 == 3)
		{
			JOptionPane.showMessageDialog(null,"You chose Plan C \nThat will be $61 per month.");
		}
		if (user1 == 4)
		{
			JOptionPane.showMessageDialog(null,"You chose Plan D \nThat will be $70 per month.");
		}
		if (user1 == 5)
		{
			JOptionPane.showMessageDialog(null,"You chose Plan E \nThat will be $79 per month.");
		}
		if (user1 == 6)
		{
			JOptionPane.showMessageDialog(null,"You chose Plan F \nThat will be $87 per month.");
		}
	}

}
