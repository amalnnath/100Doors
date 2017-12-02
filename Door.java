package main;

public class Door {

	boolean isOpen;
	
	public Door() {
		isOpen = false;
	}
	
	public boolean getDoorStatus(){
		return isOpen;
	}
	
	public void toggle(){
		if(isOpen){
			isOpen = false;
		}
		else{
			isOpen = true;
		}
	}
	
}
