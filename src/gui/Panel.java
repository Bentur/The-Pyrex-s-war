package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel{
	
	private Window window;
	
	public Panel(Window win){
		window = win;
	}
	
	JButton buttonPlay ;
	
	//the top left X coord of the user view
	private int UsX = 100;
	
	//the top left Y coord of the user view 
	private int UsY = 0;
		

	public void paintComponent(Graphics g){
		
		 try {

			BufferedImage img = ImageIO.read(new File("BackgroundWorldTest.jpg"));

			//img.getSubimage(UsX, UsY, window.getXSize(), window.getYSize());
			//g.setClip(UsX, UsY, window.getXSize() + UsX, window.getYSize());
			g.setClip(UsX, 0, 100 , 100);

			g.drawImage(img, 0, 0, this);

		      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

		    } catch (IOException e) {

		      e.printStackTrace();

		    }
		
			
	}
	

}
