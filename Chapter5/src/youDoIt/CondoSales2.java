/**
 * 
 */
package youDoIt;
/**
 * @author SF137412
 *
 */
import javax.swing.JOptionPane;
public class CondoSales2 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int user;
		int user2;
		int totalPrice;
		int parkPrice = 150000;
		int lakePrice = 210000;
		int golfCoursePrice = 170000;
		int parkingGarage = 5000;
		
		user = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like a \n(1) Park View \n(2) Golf Course View \n(3) Lake View "));
		
		if(user == 1)
		{
			JOptionPane.showMessageDialog(null, "You want a Park View. That Will be $" + parkPrice);
			user2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like a \n(1) Parking Space \n(2) Parking Garage"));
			if(user2 == 1)
			{
				totalPrice = parkPrice; 
				JOptionPane.showMessageDialog(null, "You want a Park View with a Parking Space. Your total will be $" + totalPrice);
			}
			else
			{
				totalPrice = parkPrice + parkingGarage;
				JOptionPane.showMessageDialog(null, "You want a Park View with a Parking Garage. Your total will be $" + totalPrice);
			}
		}
		if(user == 2)
		{
			JOptionPane.showMessageDialog(null, "You want a Golf Course View. That will be $" + golfCoursePrice);
			user2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like a \n(1) Parking Space \n(2) Parking Garage"));
			if(user2 == 1)
			{
				totalPrice = golfCoursePrice; 
				JOptionPane.showMessageDialog(null, "You want a Golf Course View with a Parking Space. Your total will be $" + totalPrice);
			}
			else
			{
				totalPrice = golfCoursePrice + parkingGarage;
				JOptionPane.showMessageDialog(null, "You want a Golf Course View with a Parking Garage. Your total will be $" + totalPrice);
			}
		}
		if(user == 3)
		{
			JOptionPane.showMessageDialog(null, "You want a Lake View. That will be $" + lakePrice);
			user2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like a \n(1) Parking Space \n(2) Parking Garage"));
			if(user2 == 1)
			{
				totalPrice = lakePrice; 
				JOptionPane.showMessageDialog(null, "You want a Lake View with a Parking Space. Your total will be $" + totalPrice);
			}
			else
			{
				totalPrice = lakePrice + parkingGarage;
				JOptionPane.showMessageDialog(null, "You want a Lake View with a Parking Garage. Your total will be $" + totalPrice);
			}
		}
	}

}
