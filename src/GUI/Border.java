package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Border {
	
	

	public static void main(String[] args) {
		JFrame frame = new JFrame("Beispiel BroderLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNorden 	= new JButton("Norden");
		JButton btnSueden 	= new JButton("Süden");
		JButton btnOsten 	= new JButton("Osten");
		JButton btnWesten 	= new JButton("Westen");
		JButton btnMitte 	= new JButton("Zentrum");
		
		// nicht zwingend notwendig da JFrame das BorderLayout als standard nutzt:  
		// frame.setLayout(new BorderLayout());
		
		frame.add(btnNorden, BorderLayout.NORTH);
		frame.add(btnSueden, BorderLayout.SOUTH);
		frame.add(btnOsten, BorderLayout.EAST);
		frame.add(btnWesten, BorderLayout.WEST);
		frame.add(btnMitte, BorderLayout.CENTER);
		
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);
	}

}