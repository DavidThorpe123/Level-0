import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String myLine = "Are you happy?";
		speak(myLine);
		String quest = JOptionPane.showInputDialog(myLine);
		if (quest.equalsIgnoreCase("Yes")) {
			myLine = "Keep doing whatever you are doing";
			speak(myLine);
			JOptionPane.showMessageDialog(null, myLine);
		} else if (quest.equalsIgnoreCase("No")) {
			myLine = "Do you want to be happy?";
			String quest2 = JOptionPane.showInputDialog(myLine);
			if (quest2.equalsIgnoreCase("Yes")) {
				myLine = "Change something, yes or no?";
				String quest3 = JOptionPane.showInputDialog(myLine);
				if (quest3.equalsIgnoreCase("Yes")) {
					JOptionPane.showMessageDialog(null, "Think about what is making you unhappy and change that!");
				} else if (quest3.equalsIgnoreCase("No")) {
					JOptionPane.showMessageDialog(null, "Have fun living sad.");

				}

			} else if (quest2.equalsIgnoreCase("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
			}
		}

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
