package OOOOP;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class  Vehicle extends Garage {
	

	public static void main(String[] args) {
		
		
		
		

	}
	public Vehicle() {
		super();
		
		
	}
	
	public Vehicle(String colour, String maker, String model) {
		super();
		this.colour = colour;
		this.maker = maker;
		this.model = model;
		
	}
	private String colour;
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	private String maker;
	
	public String getMaker() {
		return maker;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	private String model;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	

}
