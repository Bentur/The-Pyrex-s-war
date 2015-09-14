package main;

import gui.Window;

public class Game {
	
	//initialize the window
	private Window win;
	
	
	//does the game is running ?
	public boolean running;
	
	
	public Game(){		
	}
	
	public void startGame(){
		init();
		gameLoop();
		dispose();
	}
	
	
	//initialisation
	private void init(){
		System.out.println("init");
		//open window
		win = new Window();
		
		//loading ressources
		
		//post init
		
		running = true;
		
	}
	
	//game loop
	private void gameLoop(){
		
		/*
		while (running) {
			//calculating
	        input();
	        //updating
	        update();
	        //rendering
	        render();
	    }
	    */
		
	}
	
	//dispose
	private void dispose(){
		//free ressources
		
	}
	

}
