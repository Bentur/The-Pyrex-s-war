package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	private Panel panel = new Panel(this);
	private JPanel pan = new JPanel();
	
	private int xSize = 1200;
	private int ySize = 800;
	
	private int xOffset;

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
		
		this.setVisible(true);
		
		init();
		gameEngine();
		
		
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
	    
	    this.setContentPane(pan);
		
	}
	
	private void testTranslate(){
		for(int i=0; i<100; i++){
			int UsX = panel.getUserX();
			panel.setUserX(UsX + 1);
			reload();
		    this.setContentPane(panel);
			
			try {
				Thread.sleep(25);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	private void gameEngine(){
		
		this.setContentPane(panel);
		panel.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseMoved(MouseEvent e) {				
			}

			@Override
			public void mouseDragged(MouseEvent e){
				int flag = e.getPoint().x;
								
				int X = e.getX()  - xOffset ;
				int Y = e.getY();
				
				if(X <= 1200 && X >= 0 && Y >= 25 && Y <= 775){
					/*
				System.out.println("X offset      : " + xOffset);
				System.out.println("X event moved : " + e.getX());
				System.out.println("X send        : " + X);
					*/
				panel.translate(X, 0);
				}
			}		
		});
		panel.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				xOffset = e.getX();
				System.out.println("mouse pressed " + e.getX());
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});

		
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
