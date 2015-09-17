package world;

import java.util.ArrayList;

import entity.EntityBase;

public class World {
	
	ArrayList<EntityBase> entityList = new ArrayList<EntityBase>();
	
	public World(){
		
	}
	
	public void render(){
		
	}
	
	public void spawnEntity(EntityBase entity){
		addEntity(entity);
		
	}
	
	private void addEntity(EntityBase entity){
		entityList.add(entity);
	}
	
	public void update(){
		for(int i = 0; i < entityList.size(); i++){
			
			if(entityList.get(i) != null){
			entityList.get(i).update();
			}
		}
	}

}
