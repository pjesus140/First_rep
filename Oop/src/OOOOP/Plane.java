package OOOOP;

public class Plane extends Vehicle {
	
	private int noOfWings;
	
	public int getNoOfWings() {
		return noOfWings;
	}
	
	public void setNoOfWings(int noOfWings) {
		this.noOfWings = noOfWings;
	}
	
	public Plane(String colour, String maker, String model, int noOfWings) {
		super(colour,  maker,  model);
		this.noOfWings = noOfWings;
	}

}
