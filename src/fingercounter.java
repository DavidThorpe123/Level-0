import javax.swing.JOptionPane;

public class fingercounter {
	public static void main(String[] args) {

		simpleaddition();
		JOptionPane.showMessageDialog(null, "Wanna see me do something cool");
		String snum = JOptionPane.showInputDialog("Pick a starting number");
		int hiii = Integer.parseInt(snum);
		String ennum = JOptionPane.showInputDialog("Now pick a ending number");
		int hiiii = Integer.parseInt(ennum);
		String addnum = JOptionPane.showInputDialog("Pick a number you want me to add");
		int hiiiii = Integer.parseInt(addnum);

		int counter = 0;
		for (int i = 0; i < hiii; i++) {
			for (int j = 0; j < hiiii; j++) {

				System.out.println(counter + " + 1 is" + " " + (++counter));

			}
			System.out.println(counter + " is " + (i + 1) + " times");
		}
		for (int i = 0; i < hiiiii; i++) {
			System.out.println(counter + " + 1 is" + " " + (++counter));
		}
		System.out.println(snum + " times " + ennum + " plus " + addnum + "=" + counter);
	}

	private static void simpleaddition() {
		String startnum = JOptionPane.showInputDialog("Please pick one number");
		int hi = Integer.parseInt(startnum);
		String finishnum = JOptionPane.showInputDialog("Please pick a second number");
		int hii = Integer.parseInt(finishnum);
		JOptionPane.showMessageDialog(null, "Ok" + " " + hi);
		for (int i = 0; i < hii; i++) {
			System.out.println(hi + " + 1 is" + " " + (++hi));
		}
		System.out.println(startnum + "+" + hii + "is" + " " + " " + hi);
	}
}
