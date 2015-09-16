package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel {
	
	private Window window;
	
	public Panel(Window win){
		window = win;
	}
	
	JButton buttonPlay ;
	
	//the base affine transform
	AffineTransform saveAT;
	//the current affine transform 
	
	
	//the top left X coord of the user view
	public int UsX;
	private int lastUsX = 0;
	
	//the top left Y coord of the user view 
	private int UsY = 0;
	
	private int imageWidth = 2000;
	private int imageHeight = 800;
		

	public void paintComponent(Graphics g){
		
		Graphics2D g2d = (Graphics2D)g;
		
		 try {

			BufferedImage img = ImageIO.read(ResourceLoader.load("texture/BackgroundWorldTest.jpg"));
			 
			//URL url = this.getClass().getClassLoader().getResource("resources/texture/BackgroundWorldTest.jpg");

			//BufferedImage img = ImageIO.read(url);
			//Image img = getImage("resources/texture/BackgroundWorldTest.jpg");
			//img.getSubimage(UsX, UsY, window.getXSize(), window.getYSize());
			//g.setClip(0, 0, window.getXSize(), window.getYSize());
			//g.setClip(UsX, 0, 100 , 100);
			
			//g2d.create(-UsX, UsY, 1200, 800);
			//g2d.translate(-UsX, UsY);
			
			AffineTransform AT = new AffineTransform();
			
			if(saveAT == null){
			saveAT = g2d.getTransform();
			}
						
			AT.translate(-UsX, UsY);
			
			if(AT != null){
			g2d.setTransform(AT);
			}
			
			//g2d.setTransform(saveAT);

			//g2d.transform(new AffineTransform(0, 0));

			g2d.drawImage(img, 0, 0, this);
			
			g2d.dispose();

		    } catch (IOException e) {

		      e.printStackTrace();

		    }
		
			
	}
	
	public void setUserX(int x){
		this.UsX = x;
	}
	
	public int getUserX(){
		return this.UsX;
	}
	
	public void translate(int x, int xOffset){		
		
		if(this.UsX + x >= 800){
			this.UsX = 800;
		System.out.println("user X : " + UsX);
		}else if(UsX + x < 0){
			this.UsX = 0;
		System.out.println("user X : " + UsX);
		} else {		
		System.out.println("X user  :" + UsX);
		System.out.println("UsX :" + UsX + ", x sended : " + x + " UsX+x : " + (UsX + x));

			this.UsX = UsX + x;
		System.out.println("X user  :" + UsX);
		}
		
		repaint();
		System.out.println("   " );

	}
	
	//Function from internet :)
	public static Image getImage(final String pathAndFileName) {
	    final URL url = Thread.currentThread().getContextClassLoader().getResource(pathAndFileName);
	    return Toolkit.getDefaultToolkit().getImage(url);
	}

}
