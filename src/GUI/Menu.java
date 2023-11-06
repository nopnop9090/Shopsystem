package GUI;

import java.awt.BorderLayout;

import javax.swing.*;

public class Menu {

	public Menu() {
		JFrame frame = new JFrame("Beispiel Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenu menu = new JMenu();
		JMenuBar menuBar = new JMenuBar();
		JMenuItem mi;
		JMenu subMenu;
		
		// 1. Eintrag in der Menubar
		menu = new JMenu("Datei");

		// 1. Eintrag zu Datei
		mi = new JMenuItem("Neu");
		menu.add(mi);
		
		// 2. Eintrag zu Datei
		mi = new JMenuItem("Speichern");
		menu.add(mi);

		// Trennlinie
		menu.addSeparator();
		
		// 3. Eintrag zu Datei
		//mi = new JMenuItem("Beenden", new ImageIcon("src/GUI/b_drop.png"));
		
		// mittels classloader ist eine bessere methode um den pfad zu bilddateien zu bestimmen:  
		mi = new JMenuItem("Beenden", new ImageIcon(getClass().getResource("/GUI/b_drop.png")));
		menu.add(mi);
		
		// 1. Eintrag "Datei" der Menubar hinzufügen
		menuBar.add(menu);

		// 2. Eintrag in der Menubar
		menu = new JMenu("Artikel");
		mi = new JMenuItem("Katzenkram");
		menu.add(mi);
		
		subMenu = new JMenu("Hundekram");
		
		mi = new JMenuItem("Knochen");
		subMenu.add(mi);
		mi = new JMenuItem("Spielzeug");
		subMenu.add(mi);
		
		menu.add(subMenu);
		
		// 2. Eintrag "Artikel" der Menubar hinzufügen
		menuBar.add(menu);
		
		frame.add(menuBar, BorderLayout.NORTH);
		
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Menu();
	}

}
