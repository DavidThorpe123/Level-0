import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Icon {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "test", "test title", 0, getIcon());
	}

	static ImageIcon getIcon() {
		return new ImageIcon("image/imgres.png");
	}
}
