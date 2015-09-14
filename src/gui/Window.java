package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	private Panel panel = new Panel();
	private JPanel pan = new JPanel();
	
	private int xSize = 1500;
	private int ySize = 1000;

	public Window() {

		//title
		this.setTitle("Pyrex's war");
		//size(x, y)
		this.setSize(xSize, ySize);
		//location relative
		this.setLocationRelativeTo(null);
		//location
		this.setLocation(00, 00);
		//on cross click
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set resizable
		this.setResizable(false);
		//always on top ?
		this.setAlwaysOnTop(false);
		//visible ?
		this.setVisible(true);
		
		//buttonPlay.setLocation(xSize/2 - buttonPlay.getHeight(), ySize/2 - buttonPlay.getWidth());
		

		//pan.add(buttonPlay);
		
		init();
		
		this.setContentPane(pan);
		
		this.setVisible(true);
		
		
	}
	
	private void init(){
		
		//test with gridBagLayout
		
		pan.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JPanel pannelButtonPlay = new JPanel();
		pannelButtonPlay.setPreferredSize(new Dimension(300, 120));
						
		JButton buttonPlay = new JButton("Play");
		
		buttonPlay.setPreferredSize(new Dimension(300, 120));
		buttonPlay.setBounds(300, 120, 0, 0);

		
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.gridheight = 1;
	    gbc.gridwidth = 1;
	    gbc.fill = GridBagConstraints.CENTER;	    
	    gbc.anchor = gbc.CENTER;
	    
	    pannelButtonPlay.add(buttonPlay);    
	    pan.add(pannelButtonPlay, gbc);
		
		/*
		//create first interface : play button
					
				this.setLayout(new GridBagLayout());

				JButton buttonPlay = new JButton();
					
				Font font = new Font("Verdana", Font.BOLD, 50);
				
				buttonPlay.setFont(font);
					
				buttonPlay.setBounds(500, 500, 500, 500);
				buttonPlay.setPreferredSize(new Dimension(400, 400));
				this.add(buttonPlay);
				System.out.println("adding button");
	*/
			
	
		
	}
	private void reload(){
		panel.repaint();
	}
	

}
