package swing;

import javax.swing.WindowConstants;

public class SwingApplication {

	public static void main(String[] args) {
		MainWindow window = new MainWindow("Swing application");
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setSize(600, 400);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

}
