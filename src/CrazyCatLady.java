import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		String video = "https://www.youtube.com/watch?v=XyNlqQId-nk";
		String videotwo = "https://www.youtube.com/watch?v=SKRgktzRvZ0";
		// 1. Ask the user how many cats they have
String cats = JOptionPane.showInputDialog("How many cats do you owm?");
		// 2. Convert their answer into an int
String three = "3";
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
int num = Integer.parseInt(cats);
if (num >= 3) {
	JOptionPane.showMessageDialog(null, "You are a Crazy Cat Lady");
}
		// 4. If they have 3 or less, call the method below to show them a cat video
else if (num <= 3) {
	playVideo(video);
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		if (num == 0) {
			playVideo(videotwo);
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
