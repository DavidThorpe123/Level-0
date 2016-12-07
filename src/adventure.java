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
			if (line.equals("Look down")) {
				seenNote = true;
				System.out.println("You see a note");
			}
			if (line.equals("Read note") && seenNote) {
				System.out.println("Note...");
			}
		}
	}
}
