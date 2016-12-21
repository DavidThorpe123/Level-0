import java.util.Random;
import java.util.Scanner;

public class adventure {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int health = 100;
		int bosshealth = 100;

		boolean foundBoss = false;
		boolean seenNote = false;
		boolean foundKey = false;
		int boss = new Random().nextInt(4);
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
			} else if (x == 0 && y == 2) {
				System.out.println("You see a strange chest. Will you attempt to open it?");
			}
			if (line.equals("Yes") && !foundKey) {
				System.out.println("You need a key");
			}
			if (x == 2 && y == 4) {
				foundBoss = true;
				System.out.println("Key Keeper found.");
			}
			if (foundBoss == true) {

				boss = new Random().nextInt(5);
				if (boss == 1 || boss == 3) {
					health = health - 25;
				}
				if (boss == 2 || boss == 4) {
					bosshealth = bosshealth - 25;
				}
				System.out.println("The current boss health is " + bosshealth);
			}
			if (health == 0) {
				System.out.println("You have died. Restart?");
			}
			if (bosshealth == 0) {
				foundKey = true;
				System.out.println("Congrats! Go collect your prize with the key");
			}
			if (line.equals("Yes") && foundKey) {
				System.out.println("Congrats you found the totem and have beaten this game");
			}
			System.out.println("Your current health is " + health);
			System.out.println("Your coordinates are " + x + " " + y);
			if (line.equals("Read note") && seenNote) {
				System.out.println("Say Go North or other directions to move. Enjoy your adventure!");

			}
		}
	}
}
