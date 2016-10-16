import javax.swing.JOptionPane;

public class simplenumbersorter {
public static void main(String[] args) {
	String one = JOptionPane.showInputDialog("What three numbers do you want. Give me your first number");
	int hi = Integer.parseInt(one);
	String two = JOptionPane.showInputDialog("Your second number");
	int hii = Integer.parseInt(two);
	String three = JOptionPane.showInputDialog("Your third number");
	int hiii = Integer.parseInt(three);
	if (hi < hii && hi < hiii) {
		System.out.println(hi + ", " + hii + ", " + hiii);
		System.out.println(hiii + ", " + hii + ", " + hi);
	}
	else if (hii < hiii && hii < hi) {
		System.out.println(hii + ", " + hiii + ", " + hi);
		System.out.println(hi + ", " + hiii + ", " + hi);
	}
	else if (hiii < hi && hiii < hii) {
		System.out.println(hiii + ", " + hi + ", " + hii);	
		System.out.println(hii + ", " + hi + ", " + hiii);
	}

}
}
