package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu implements ActionListener {

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
		mi.setMnemonic('N');
		mi.addActionListener(this);
		menu.add(mi);
		
		// 2. Eintrag zu Datei
		mi = new JMenuItem("Speichern");
		mi.setMnemonic('S');
		mi.addActionListener(this);
		menu.add(mi);

		// Trennlinie
		menu.addSeparator();
		
		// 3. Eintrag zu Datei
		//mi = new JMenuItem("Beenden", new ImageIcon("src/GUI/b_drop.png"));
		
		// mittels classloader ist eine bessere methode um den pfad zu bilddateien zu bestimmen:  
		mi = new JMenuItem("Beenden", new ImageIcon(getClass().getResource("/GUI/b_drop.png")));
		mi.setMnemonic('B');
		mi.addActionListener(this);
		menu.add(mi);
		
		// 1. Eintrag "Datei" der Menubar hinzufügen
		menuBar.add(menu);

		// 2. Eintrag in der Menubar
		menu = new JMenu("Artikel");
		mi = new JMenuItem("Katzenkram");
		mi.addActionListener(this);
		menu.add(mi);
		
		subMenu = new JMenu("Hundekram");
		
		mi = new JMenuItem("Knochen");
		mi.addActionListener(this);
		subMenu.add(mi);
		mi = new JMenuItem("Spielzeug");
		mi.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand() + " geklickt!");
		
		if(e.getActionCommand().equalsIgnoreCase("speichern")) {
			System.out.println("Speichern!");
		}

		if(e.getActionCommand().equalsIgnoreCase("beenden")) {
			System.out.println("Raus!");
		}
	}

}
