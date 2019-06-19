package OOOOP;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Garage {
	
	
	public static void main(String[] args) {
		
		
		Car id1 = new Car("red", "Reno", "e205",2);
		Plane id2 = new Plane("blue", "Txq", "240z", 4);		
		
		
		Garage g = new Garage();

		
		
		g.addVehicle(id1);
		g.addVehicle(id2);
		
		

		System.out.println(g.getVehicle().toString());
		g.bill();
		System.out.println("total cost: "+g.bill2());
		g.removeByType(Car.class);
		System.out.println(g.getVehicle().toString());

			
	}
	private List<Vehicle> hereInMyGarage = new ArrayList<>();
	
	public void addVehicle(Vehicle vehicle) {
		this.hereInMyGarage.add(vehicle);
	}
	
	public List<Vehicle> getVehicle(){
		return this.hereInMyGarage;
	}
	
	public void removeByType(Class<?> clazz) {
		List<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : this.hereInMyGarage) {
			if (v.getClass() == clazz) {
				toRemove.add(v);
			}
		}
		this.hereInMyGarage.removeAll(toRemove);
	}
	
	public void  bill() {
		for(Vehicle i : this.hereInMyGarage) {
			if(i.toString().contains("Car")) {
				if(i.getColour() == "red") {
					System.out.println("id"+(hereInMyGarage.indexOf(i)+1)+" Red car repair costs £2000");
				
				}
				else if(i.getColour() == "blue") {
					System.out.println("id"+(hereInMyGarage.indexOf(i)+1)+"blue car repair costs £1000");
					
				}
				else System.out.println("id"+(hereInMyGarage.indexOf(i)+1)+"repair costs £500");
			
				
			}
			else if(i.toString().contains("Plane")) {
				
				
				if(i.getColour() == "red") {
					System.out.println("id"+(hereInMyGarage.indexOf(i)+1)+" red plane repair costs £20000");
					
				}
				else if(i.getColour() == "blue") {
					System.out.println("id"+(hereInMyGarage.indexOf(i)+1)+" blue plane repair costs £10000");
				}
				else System.out.println("id"+(hereInMyGarage.indexOf(i)+1)+"repair costs £5000");
			}
			
			

	}
	}
	public int  bill2() {
		int total = 0;
		for(Vehicle i : this.hereInMyGarage) {

			if(i.toString().contains("Car")) {
				if(i.getColour() == "red") {
					total =total +2000;
				
				}
				else if(i.getColour() == "blue") {
					total =total +1000;
					
				}
				else total =total +500;
			
				
			}
			else if(i.toString().contains("Plane")) {
				
				
				if(i.getColour() == "red") {
					total =total +20000;
					
				}
				else if(i.getColour() == "blue") {
					total =total +10000;
				}
				else total =total +5000;
			}
			
			

	}
		return total;
	}
	
}
			
	
	

	
	


