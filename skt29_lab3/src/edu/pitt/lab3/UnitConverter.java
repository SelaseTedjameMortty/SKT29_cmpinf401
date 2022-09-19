package edu.pitt.lab3;
import java.util.Scanner;
import javax.swing.*;
public class UnitConverter {

	public static void main(String[] args)
	{
		double numbers2;
		JFrame f;
		f = new JFrame();
		String measurements = JOptionPane.showInputDialog(f,"Please enter a distance or weight amount with just the numbers.");
		String units = JOptionPane.showInputDialog(f,"Please enter the units for the previous measurement.");
		
		double numbers = Double.parseDouble(measurements);
		
		if (units == "in"){
			numbers2 = numbers * 2.54;
			System.out.println(numbers + " in =" + numbers2 + " cm");
		}
		else if(units == "cm"){
			numbers2 = numbers / 2.54;
			System.out.println(numbers + " cm =" + numbers2 + " in");
		}
		else if(units == "gm"){
			numbers2 = numbers / 28.35;
			System.out.println(numbers + " g =" + numbers2 + " oz");
		}
		else if(units == "oz"){
			numbers2 = numbers * 28.35;
			System.out.println(numbers + " oz =" + numbers2 + " g");
		}
	}
		
}

