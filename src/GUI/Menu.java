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
		
		menu = new JMenu("Datei");
		mi = new JMenuItem("Neu");
		menu.add(mi);
		
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
