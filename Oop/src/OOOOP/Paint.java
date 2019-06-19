package OOOOP;

public class Paint extends PaintWizard {
	
	public static void main(String[] args) {
		
		
		
	}
	public Paint(String name, int liters, int msqpl, double price) {
		super();
		this.name = name;
		this.liters = liters;
		this.msqpl = msqpl;
		this.price = price;
		
		
	}
	
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	
	private double liters;	
	
	public double getLiters() {
		return liters;
	}
	
	
	
	private double msqpl;
	
	public double getMsqpl() {
		return msqpl;
	}
	
	private double price;
	
	public double getPrice() {
		return price;
	}
	
	
	
	
	
	

}
