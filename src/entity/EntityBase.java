package entity;

abstract public class EntityBase {
	
	private int xCoord;
	private int yCoord;
	
	public EntityBase(){
		
	}
	
	public abstract void render();
	
	public abstract void update();
	
	
	//getter and setter
	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	
	
	

}
