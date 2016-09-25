// Copyright Wintriss Technical Schools 2013
import java.util.jar.JarOutputStream;

import javax.swing.JOptionPane;

public class sleepyhead {

	public static void main(String[] args) {
		
		boolean isWeekday, isVacation;
		
		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
	int hi = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "",
				JOptionPane.YES_NO_OPTION);
	System.out.println(hi);
if (hi==1){
	JOptionPane.showMessageDialog(null, "Sleep In!");
}
else if (hi==0){
	JOptionPane.showMessageDialog(null, "Get up lazybones!");
}

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}
