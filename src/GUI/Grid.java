package GUI;

import java.awt.GridLayout;
import javax.swing.*;

public class Grid {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Beispiel Grid");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 3 Zeilen, 2 Spalten
		JPanel panel = new JPanel(new GridLayout(3, 2));
		
		JButton btn1 = new JButton("Button 1");
		JButton btn2 = new JButton("Button 2");
		JButton btn3 = new JButton("Button 3");
		JButton btn4 = new JButton("Button 4");
		JButton btn5 = new JButton("Button 5");
		JButton btn6 = new JButton("Button 6");
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
	
		
		frame.add(panel);
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);
		
	}

}
