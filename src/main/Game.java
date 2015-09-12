package main;

public class Game {
	
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
		//open window
		
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
