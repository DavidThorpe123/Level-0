import java.util.Scanner;

public class adventure {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		boolean seenNote = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("You look around what should you do?");
		while (true) {

			String line = scanner.nextLine();
			System.out.println(line);
			if (line.equals("Go North")) {
				y += 1;
			}
			if (line.equals("Go South")) {
				y -= 1;
			}
			if (line.equals("Go East")) {
				x += 1;
			}
			if (line.equals("Go West")) {
				x -= 1;
			}
			if (line.equals("Look down")) {
				seenNote = true;
				System.out.println("You see a note");
			}
			if (x == 0 && y == 1) {
				System.out.println("You see a strange cave will go there?");
			}
			else if (x == 0 && y == 2) {
				System.out.println("You see a strange chest. Will you attempt to open it?");
			}
			System.out.println("Your coordinates are " + x + " " + y);
			if (line.equals("Read note") && seenNote) {
				System.out.println("Say Go North or other directions to move. Enjoy your adventure!");

			}
		}
	}
}
