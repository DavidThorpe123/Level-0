 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String MomsBirthday = "June 29th";
		String DadsBirthday = "October 13th";
		String MyBirthday = "December 5th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String question = JOptionPane.showInputDialog("What birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(question);
		// 4. if user asked for "mom"
		if (question.equals("MomsBirthday")) {
			JOptionPane.showMessageDialog(null, ("June29th"));
		}
		else if (question.equals("DadsBirthday")) {
			JOptionPane.showMessageDialog(null, ("October 13th"));
		}
		else if (question.equals("MyBirthday")) {
			JOptionPane.showMessageDialog(null, ("December 5th"));
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");//print mom's birthday
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}