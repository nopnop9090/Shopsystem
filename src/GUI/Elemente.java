package GUI;

import java.awt.DisplayMode;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
				
		// JRadioButton / ButtonGroup
		JRadioButton rb1 = new JRadioButton("AWE");
		JRadioButton rb2 = new JRadioButton("FiSi");
		rb1.setBounds(250, 80, 100, 50);
		rb2.setBounds(360, 80, 100, 50);
		
		// JRadioButtons gruppieren/ zusammengehörig
		ButtonGroup beruf = new ButtonGroup();
		beruf.add(rb1);
		beruf.add(rb2);
		
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String eingabe = text.getText();
				System.out.println(eingabe);
				
				char[] passwort = geheim.getPassword();
				System.out.println("Passwort: " + new String(passwort));
				
				String vielText = textArea.getText();
				System.out.println(vielText);
				
				boolean checked = checkBox.isSelected();
				if(checked) {
					System.out.println("mit AGB einverstanden");
				} else {
					System.out.println("sorry, erst AGB akzeptieren");
				}
				
				System.out.println(checkBox.isSelected() ? "AGB akzeptiert" : "geht nicht weiter");

				// nummer des ausgewaehlten eintrags:
				int comboIndex = box.getSelectedIndex();
				System.out.println(comboIndex);
				
				// text des ausgewaehlten eintrags
				String comboText = box.getSelectedItem().toString();
				System.out.println(comboText);
			
				String radio = rb1.isSelected() ? "AWE" : "FiSi";
				System.out.println(radio);
				
				label.setText("Ich verändere mich nach Klick");
				
				// fehlende JList kommt beim nächsten mal :)
			}
			
		});
		
		
		// Elemente dem Hauptpanel hinzufuegen
		panel.add(button);
		panel.add(label);
		panel.add(text);
		panel.add(geheim);
		panel.add(textArea);
		panel.add(box);
		panel.add(liste);
		panel.add(checkBox);
		panel.add(rb1);
		panel.add(rb2);
		
		// Hauptpanel dem JFrame hinzufuegen
		fenster.add(panel);
		
		// Breite und Hoehe fuer Fenster festlegen
		fenster.setSize(600, 800);

		// Fenster auf dem Bildschirm zentrieren
		//fenster.setLocationRelativeTo(null);
		
		// Fenster auf dem Bildschirm 0 zentrieren
		//centerFrameOnScreen(fenster, 0);
		
		
		// Mauspfeil-Position abfragen und JFrame auf dem Monitor zentrieren der den Mauspfeil zeigt
        Point mousePosition = MouseInfo.getPointerInfo().getLocation();
        centerFrameOnMonitorWithMousePointer(fenster, mousePosition);
		
		
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
	
	
	/**
	 * Centers a JFrame on the monitor that contains the specified mouse pointer position.
	 *
	 * @param frame          The JFrame to be centered.
	 * @param mousePosition  The position of the mouse pointer in screen coordinates.
	 */
	public static void centerFrameOnMonitorWithMousePointer(JFrame frame, Point mousePosition) {
	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    GraphicsDevice[] screenDevices = ge.getScreenDevices();

	    for (GraphicsDevice device : screenDevices) {
	        GraphicsConfiguration config = device.getDefaultConfiguration();
	        Rectangle bounds = config.getBounds();

	        if (bounds.contains(mousePosition)) {
	            // If the monitor contains the mouse pointer, center the frame on that monitor
	            int x = bounds.x + (bounds.width - frame.getWidth()) / 2;
	            int y = bounds.y + (bounds.height - frame.getHeight()) / 2;
	            frame.setLocation(x, y);
	            return; // Exit the loop
	        }
	    }
	}

}
