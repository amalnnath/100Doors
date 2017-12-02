package main;

public class Walk {

	Door[] doors = new Door[100];
	
	public Walk(){
		for(int i = 0; i < 100; i++){
			doors[i] = new Door();
		}
	}
	
	public void doorToggle(int numWalk, int numOfDoors){
		for(int i = 0; i < numOfDoors; i++){
			if((i+1)%(numWalk+1) == 0){
				System.out.println((i+1)%(numWalk+1));
				doors[i].toggle();
			}
		}
	}
	
	public void test(){
		for(int i = 0; i < 100; i++){
			doorToggle(i, 100);
		}
		for(int i = 0; i < 100; i++){
			System.out.println("Door " + (i+1)+ " is open: " + doors[i].getDoorStatus());
		}
	}
	
}
