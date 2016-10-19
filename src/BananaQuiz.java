
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String question = JOptionPane.showInputDialog("Do you like bananas?");
		// 2. if they say no,
		if (question.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null, "You are crazy!");
		}
		// tell them they are crazy
		// and end quiz
		// 3. if they say yes
		else if (question.equalsIgnoreCase("Yes")) {
			String question2 = JOptionPane.showInputDialog("What is your favorite hobby");
			JOptionPane.showMessageDialog(null, question2 + " " + "is better than bananas");
		} else {
			JOptionPane.showMessageDialog(null, "You are bananas!");
		}
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"

		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”

	}

}