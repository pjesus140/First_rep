package OOOOP;



public class Car extends Vehicle {
	
	public static void main(String[] args) {
		
		
		
		
		
	}
	public Car(String colour, String maker, String model,int getNoSunRoofs) {
		super(colour,  maker,  model);
		this.noOfSunRoofs = noOfSunRoofs;
		
	}
	
	private int noOfSunRoofs;
	
	public int getNoOfSunRoofs() {
		return noOfSunRoofs;
	}
	
	public void setNoOfSunRoofs(int noOfSunRoofs) {
		this.noOfSunRoofs = noOfSunRoofs;
	}


}
