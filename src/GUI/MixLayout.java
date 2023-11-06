package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MixLayout {
	
	JFrame frame = new JFrame("Beispiel Gemischtes Layout");
	JButton btnNorden 	= new JButton("Norden");
	JButton btnSueden 	= new JButton("Süden");
	JButton btnOsten 	= new JButton("Osten");
	JButton btnWesten 	= new JButton("Westen");
	//JButton btnMitte 	= new JButton("Zentrum");
	JPanel pnCenter = new JPanel();

	JButton btn1 = new JButton("Button 1");
	JButton btn2 = new JButton("Button 2");
	JButton btn3 = new JButton("Button 3");
	JButton btn4 = new JButton("Button 4");
	

	public MixLayout() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// nicht zwingend notwendig da JFrame das BorderLayout als standard nutzt:  
		// frame.setLayout(new BorderLayout());

		// beim JPanel gibts keinen Standard Layoutmanager, deshalb festlegen:
		pnCenter.setLayout(new GridLayout(2,2));
		pnCenter.add(btn1);
		pnCenter.add(btn2);
		pnCenter.add(btn3);
		pnCenter.add(btn4);
			
		frame.add(btnNorden, BorderLayout.NORTH);
		frame.add(btnSueden, BorderLayout.SOUTH);
		frame.add(btnOsten, BorderLayout.EAST);
		frame.add(btnWesten, BorderLayout.WEST);
		
		frame.add(pnCenter, BorderLayout.CENTER);
		
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MixLayout();
	}

}
