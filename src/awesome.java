import javax.swing.JOptionPane;

public class awesome {
public static void main(String[] args) {
	for (int i = 0; i < 1000; i++){
		String Answer = JOptionPane.showInputDialog("What is awesome");
		JOptionPane.showMessageDialog(null, Answer + " is awesome!");
	
	}
	
}
}
