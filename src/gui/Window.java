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
	
	private Panel panel = new Panel(this);
	private JPanel pan = new JPanel();
	
	private int xSize = 1200;
	private int ySize = 800;

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
		
		init();
		
		this.setContentPane(panel);
		
		this.setVisible(true);
		
		
	}
	
	private void init(){		
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
		
	}
	
	private void gameEngine(){
		
	}
	
	
	private void reload(){
		panel.repaint();
	}
	
	public int getXSize(){
		return this.xSize;
	}
	
	public int getYSize(){
		return this.ySize;
	}

}
