import javax.swing.JOptionPane;

public class riddlemethis {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
 String answer = JOptionPane.showInputDialog("Whats a seven letter word with thousands of letters");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
 if(answer.equals("Mailbox")){
	 JOptionPane.showMessageDialog(null, "Correct");
 score ++;
		// 5. Otherwise, say "wrong" and tell them the answer
 }else{
	 JOptionPane.showMessageDialog(null, "Wrong the answer is mailbox");
 }
		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog("What is bright and yellow and brightens moms day?");
if(answer2.equals("School Bus")){
	JOptionPane.showMessageDialog(null, "Correct");
	score++;
}else{
	
}
		// 2. Make a pop up to show the score.
		 JOptionPane.showMessageDialog(null, score);
	}
}
