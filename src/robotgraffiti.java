import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class robotgraffiti {
public static void main(String[] args) {
	Robot tim = new Robot();
	tim.sparkle();
	tim.setSpeed(10);
	tim.penDown();
	tim.move(500);
	tim.turn(145);
	tim.move(310);
	tim.turn(65);
	tim.move(310);
	tim.turn(235);
	tim.penUp();
	tim.move(350);
	tim.turn(290);
	tim.penDown();
	tim.move(500);
	tim.turn(145);
	tim.move(500);
	tim.turn(180);
	tim.move(250);
	tim.turn(-70);
	tim.move(150);
	JOptionPane.showMessageDialog(null, "I'm Done!");
}
}
