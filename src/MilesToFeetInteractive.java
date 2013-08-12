import java.util.Scanner;

import javax.swing.JOptionPane;

public class MilesToFeetInteractive {

	public static void main(String[] args) {

		//Declare and initialize named constant FEET_PER_MILE
		final int FEET_PER_MILE = 5280;
		
		//Declare and initialize variables
		float uncleMiles, uncleFeet;
		Scanner sc = new Scanner(System.in);
		
		//User input 
		System.out.println("Please enter distance in Miles: ");
		uncleMiles = sc.nextFloat(); 
		
		//Conversion miles to feet 
		uncleFeet = uncleMiles * FEET_PER_MILE; 
		
		//Display output in dialog box
		JOptionPane.showMessageDialog(null, "The distance to your uncle's house is: " + uncleMiles + " Miles Thats: " + uncleFeet + " feet.");

	}

}
