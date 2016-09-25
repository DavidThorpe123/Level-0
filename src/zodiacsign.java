import javax.swing.JOptionPane;

public class zodiacsign {
	public static void main(String[] args) {
		for (int i = 0; i < 12; i++) {
			
		
		String quest = JOptionPane.showInputDialog("What is your zodiac sign?");
		if (quest.equals("Aquarius")) {
			JOptionPane.showMessageDialog(null, "You will find $20 on the floor today");
		}

		else if (quest.equals("Pisces")) {
			JOptionPane.showMessageDialog(null, "You will fall of a cliff");
		} else if (quest.equals("Aries")) {
			JOptionPane.showMessageDialog(null, "You will go to the beach today");
		} else if (quest.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "You will eat a burger today");

		} else if (quest.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "You will buy a trampoline today");
		} else if (quest.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, "You will find a lost puppy!");
		} else if (quest.equals("Leo")) {
			JOptionPane.showMessageDialog(null, "You will die today");
		} else if (quest.equals("Virgo")) {
			JOptionPane.showMessageDialog(null, "Get a better birthday");
		} else if (quest.equals("Libra")) {
			JOptionPane.showMessageDialog(null, "Ask google");
		} else if (quest.equals("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Ummmm... IDEK");
		} else if (quest.equals("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "You literally have the best one and you are the cooles person ever");
		} else if (quest.equals("Capricorn")) {
			JOptionPane.showMessageDialog(null, "You are going to get many presents on your birthday!");
		}
	
	}
	}
}
