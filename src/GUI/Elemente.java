package GUI;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.*;


public class Elemente {

	public static void main(String[] args) {
		// Erzeugt ein Fenster
		JFrame fenster = new JFrame("Unser Fenster");
		
		// Beim Schliessen des Fensters soll Programm beendet werden
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Erzeugen weiterer Elemente
		// JPanel -> Container -> Vergleichbar mit DIV in HTML
		JPanel panel = new JPanel();

		// Layoutmanager deaktivieren (keine automatische Positionierung von hinzugefuegten Elementen)
		panel.setLayout(null);
		
		// JButton
		JButton button = new JButton("Bitte klicken!");
		// Position und Dimension festlegen (x, y, Breite, Hoehe)
		button.setBounds(20, 20, 200, 50);
		
		// JLabel -  Beschriftung
		JLabel label = new JLabel("Hier steht Text");
		label.setBounds(20, 80, 200, 50);
		
		// JTextField - einzeilige Eingabe
		JTextField text = new JTextField();
		text.setBounds(20, 140, 200, 50);
		
		// JPasswordField
		JPasswordField geheim = new JPasswordField();
		geheim.setBounds(20, 200, 200, 50);
		
		// JTextArea - mehrzeilige Eingabe
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 260, 200, 200);
		
		// JComboBox - Drop-Down-Auswahl
		String auswahl[] = {"Käsekuchen", "Marmorkuchen", "Frankfruert Kranz", "Mettbrötchen"};
		JComboBox<String> box = new JComboBox<>(auswahl);
		box.setBounds(20, 470, 200, 50);
		
		// JList - Auswahlliste
		String[] themen = {"Java", "SQL", "IT-Rechnen", "Wiso ;-)"};
		JList<String> liste = new JList(themen);
		liste.setBounds(20, 530, 200, 100);
		
		// JCheckBox
		JCheckBox checkBox = new JCheckBox("AGB akzeptiert");
		checkBox.setBounds(250, 20, 200, 50);
				
		// JRadioButton
		
		// Elemente dem Hauptpanel hinzufuegen
		panel.add(button);
		panel.add(label);
		panel.add(text);
		panel.add(geheim);
		panel.add(textArea);
		panel.add(box);
		panel.add(liste);
		panel.add(checkBox);
		
		
		// Hauptpanel dem JFrame hinzufuegen
		fenster.add(panel);
		
		// Breite und Hoehe fuer Fenster festlegen
		fenster.setSize(600, 800);

		// Fenster auf dem Bildschirm zentrieren
		//fenster.setLocationRelativeTo(null);
		
		// Fenster auf dem Bildschirm 0 zentrieren
		centerFrameOnScreen(fenster, 0);
		
		
		// Anzeigen des Fensters
		fenster.setVisible(true);
	}
	
	
	
	/**
	 * This method centers a JFrame on a specific screen in a multi-monitor configuration.
	 *
	 * @param frame       The JFrame to be centered.
	 * @param screenIndex The index of the target screen (0 for the first screen, 1 for the second, and so on).
	 */
	public static void centerFrameOnScreen(JFrame frame, int screenIndex) {
	    // Access the graphics environment
	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

	    // Get information about available screens
	    GraphicsDevice[] screenDevices = ge.getScreenDevices();

	    if (screenIndex >= 0 && screenIndex < screenDevices.length) {
	        // Obtain the desired graphics device (screen)
	        GraphicsDevice targetScreen = screenDevices[screenIndex];

	        // Retrieve the display mode for the target screen
	        DisplayMode mode = targetScreen.getDisplayMode();

	        // Calculate the x and y coordinates to center the JFrame on the target screen
	        int x = targetScreen.getDefaultConfiguration().getBounds().x + (mode.getWidth() - frame.getWidth()) / 2;
	        int y = targetScreen.getDefaultConfiguration().getBounds().y + (mode.getHeight() - frame.getHeight()) / 2;

	        // Set the position of the JFrame
	        frame.setLocation(x, y);
	    } else {
	        // Handle the case where the specified screen index is out of bounds
	        System.out.println("Screen index out of bounds: " + screenIndex);

	        // Fallback: Center on the default screen (screen 0)
	        centerFrameOnScreen(frame, 0);
	    }
	}

}
