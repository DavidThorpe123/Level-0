import javax.swing.JOptionPane;

public class myages {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you");
int rage =	Integer.parseInt(age);
for (int i = 1; i < rage; i++) {
	System.out.println(i);
	
}
	
}
}
