package OOOOP;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		List<String> l1 = new ArrayList<String>();
		
		

		p1.setAge(100);
		p1.setName("Jim");
		p1.setJobTitle("Cook");
		
		p2.setAge(10);
		p2.setName("Alex");
		p2.setJobTitle("Doctor");
		
		p3.setAge(1);
		p3.setName("Lenny");
		p3.setJobTitle("Prime Minister");
		
		l1.add(p1.toString());
		l1.add(p2.toString());
		l1.add(p2.toString());
		
		System.out.println(p1.getAge());
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(l1);
		p1.ps1(l1);
		p1.search(l1);

		

		
		
		}
	private void  ps1(List<String> l1){
		List<String> stm = l1.stream().collect(Collectors.toList());
		System.out.println(stm);
		
		

	
	}
	
	private void  search(List<String>l1){
		Scanner s = new Scanner(System.in);
		System.out.println("Search name:");
		String str1 = s.nextLine();
		if(l1.contains(str1)) {
			System.out.println(str1+" is in the list of names.");
			
		}
		
		
		

	

	}

	private  String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	private int age;
	
	public int getAge() {
		return age;
	}	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	private String jobTitle;
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	public String toString() {
		
		return "Name: "+ this.name+ ", Age: "+ this.age +", Job Title: "+ jobTitle;
		
	
		
	}
	
		
	

}
