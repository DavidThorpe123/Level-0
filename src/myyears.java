import javax.swing.JOptionPane;

public class myyears {
public static void main(String[] args) {
	String Year = JOptionPane.showInputDialog("What year where you born");
	int num = Integer.parseInt(Year);
	for (int i = num; i < 2017; i++) {
		System.out.println(i);
	}
	
}
}
