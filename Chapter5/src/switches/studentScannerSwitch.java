package switches;

import javax.swing.JOptionPane;
public class studentScannerSwitch 
{

	public static void main(String[] args) 
	{
		int studentNumber;
		
		String studentString;
		
		studentString = (String)JOptionPane.showInputDialog(null, "Please scan the students ID >>>", "Enter the User ID #", 
				JOptionPane.QUESTION_MESSAGE, null, null, "");
		studentNumber = Integer.parseInt(studentString);
		
		if (studentNumber >= 100000 || studentNumber <=4000000)
		{
			switch(studentNumber)
			{
				case 274896:
					JOptionPane.showMessageDialog(null, "Andrew McKenzie Java Book, he is in the 10th grade.");
					break;
				case 274885:
					JOptionPane.showMessageDialog(null, "This is Charles Carlstrom");
					break;
				case 316282:
					JOptionPane.showMessageDialog(null, "This is Ress Alzahrani");
					break;
				case 274884:
					JOptionPane.showMessageDialog(null, "This is Tatyana Vaughn");
					break;
				case 133778:
					JOptionPane.showMessageDialog(null, "This is Nick Hasson");
					break;
				case 131457:
					JOptionPane.showMessageDialog(null, "This is Kassie Remley");
					break;
				case 137412:
					JOptionPane.showMessageDialog(null, "This is Sebastian Frick");
					break;
				case 131147:
					JOptionPane.showMessageDialog(null, "This is Zach Dorris");
					break;
				case 274887:
					JOptionPane.showMessageDialog(null, "This is Chase Kress");
					break;
				case 133225:
					JOptionPane.showMessageDialog(null, "This is Isaiah Ponciano");
					break;
				case 137428:
					JOptionPane.showMessageDialog(null, "This is Mason Hancock");
					break;
				default:
					JOptionPane.showMessageDialog(null, "That number does not exist.");
					break;
			}
		}
		
	}

}
