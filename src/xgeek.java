// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class xgeek {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String Dasha = ("Laser Eyes");
String Joan = ("Invisibility");
String Dylan = ("Flying");
String David = ("Breathing Underwater");
		// 2. Ask the user to enter a name. Store their answer in a variable.
String answer = JOptionPane.showInputDialog("Enter a name");
if (answer.equals("Dasha")) {
	JOptionPane.showMessageDialog(null, "Dasha's superpower is" + " " + Dasha);
}
else if (answer.equals("Joan")){
	JOptionPane.showMessageDialog(null, "Joan's superpower is" + " " + Joan);
}
else if (answer.equals("Dylan")){
	JOptionPane.showMessageDialog(null, "Dylan's superpower is" + " " + Dylan);
}
else if (answer.equals("David")){
	JOptionPane.showMessageDialog(null, "David's superpower is" + " " + David);
}
else {
	JOptionPane.showMessageDialog(null, "You do not have a superpower");
}
		// 3. Show the superpower in a pop-up, depending on the name entered. 


	}
}
