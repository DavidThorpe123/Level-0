import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Icon {
	public static void main(String[] args) {

		myMessage("Hi");
		myMessage("Coding");
	}

	static ImageIcon getIcon() {
		return new ImageIcon("image/imgres.png");
	}

	static void myMessage(String message) {
		JOptionPane.showMessageDialog(null, "\n" + message, "test title", 0, getIcon());
	}
}
