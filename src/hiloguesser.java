import java.util.Random;

import javax.swing.JOptionPane;

public class hiloguesser {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Pick a number between 1-100.");

		int numguess = 10;
		int guess = 50;
		int highestGuess = 100;
		int lowestGuess = 1;
		int ran = new Random().nextInt(101);
		for (int i = 0; i < numguess; i++) {
			int ans = JOptionPane.showConfirmDialog(null, "Is this your number?" + ran);
			if (ans == 0) {
				JOptionPane.showMessageDialog(null, "I guessed it!");
				System.exit(0);
			} else {
				String hilo = JOptionPane.showInputDialog("Is it higher or lower?");

				if (hilo.equalsIgnoreCase("higher")) {
					System.out.println("I want to guess higher than" + ran);
					lowestGuess = ran;
					int diff = highestGuess - ran;
					int shift = new Random().nextInt(diff);
					ran += shift;
				} else {
					System.out.println("I want to guess lower than" + ran);
					highestGuess = ran;
					int diff2 = ran - lowestGuess;
					int shift2 = new Random().nextInt(diff2);
					ran -= shift2;
				}

			}
		}

	}
}

// yes is 0
// no is 1
// cancel is -1