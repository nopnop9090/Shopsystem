package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Flow {

	public static void gibAus() {
		System.out.println("Ich wurde geklickt!");
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Flowlayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(new FlowLayout());
		
		/*
		for(int i=1; i<=10; i++) {
			JButton button = new JButton("Button " + i);
			panel.add(button);
		}
		*/
		
		JButton b1=new JButton("Button 1");
		JButton b2=new JButton("Button 2");
		JButton b3=new JButton("Button 3");
		JButton b4=new JButton("Button 4");
		JButton b5=new JButton("Button 5");
		JButton b6=new JButton("Button 6");
		JButton b7=new JButton("Button 7");

		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 1 wurde geklickt");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 2 wurde geklickt");
			}
		});

		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gibAus();
			}
		});

		
		
		// reihenfolge des hinzufuegens beachten
		panel.add(b1);
		panel.add(b7);	// button 7 
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		
		frame.add(panel);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);
	}

}
