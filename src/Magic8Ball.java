
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random
		// number into this variable using "new Random().nextInt(4)"
		int numb = new Random().nextInt(4);
		// 3. Print out this variable
		System.out.println(numb);
		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Ask me a question");
		// 5. If the random number is 0
		if (numb == 0) {
			// -- tell the user "Yes"
			System.out.println("Yes");
		}
		// 6. If the random number is 1
		if (numb == 1) {
			System.out.println("No");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		if (numb == 2) {
			System.out.println("Maybe you should ask Google?");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		if (numb == 3) {
			System.out.println("Come back later");
		}
		// -- write your own answer

	}
}
