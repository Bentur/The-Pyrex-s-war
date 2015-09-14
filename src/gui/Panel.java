package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel{
	
	JButton buttonPlay ;

	public void paintComponent(Graphics g){
		
		buttonPlay = new JButton("Play");
		
		buttonPlay.setBounds(500, 500, 500, 500);
		buttonPlay.setPreferredSize(new Dimension(400, 400));
		
		this.add(buttonPlay);
		
			
	}
	

}
