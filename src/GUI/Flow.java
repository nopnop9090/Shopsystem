package GUI;

import java.awt.FlowLayout;

import javax.swing.*;

public class Flow {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Flowlayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(new FlowLayout());
		for(int i=1; i<=10; i++) {
			JButton button = new JButton("Button " + i);
			panel.add(button);
		}

		frame.add(panel);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);
	}

}
