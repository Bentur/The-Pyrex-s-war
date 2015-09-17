package main;

import gui.Window;
import world.World;

public class Game {
	
	//initialize the window
	private Window win;
	private World world;
	
	private int flag = 0;
	
	
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
		
		win.init();
		
		//loading ressources
		
		//post init
		
		running = true;
		
	}
	
	//game loop
	private void gameLoop(){		
		
		
		while (running) {
			//calculating
	        	//input();
	        //updating
	        	//update();
	        //rendering
	        render();
	        /*
	        try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        */
	    }
	    
		//world.spawnEntity(new EntityClubMan());
	}
	
	//dispose
	private void dispose(){
		//free ressources
		
	}
	
	public boolean isRunning(){
		return running;
	}
	
	private void update(){
		
		world.update();
		
	}
	
	private void render(){
		if(flag == 0){
		win.gameEngine();
		flag ++;
		}
	}

}
