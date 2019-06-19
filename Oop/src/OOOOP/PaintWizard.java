package OOOOP;

import java.util.ArrayList;
import java.util.List;

public class  PaintWizard {
	
	public static double msq = 170;
	
	public static void main(String[] args) {
		
		Paint cm = new Paint("CheapoMax", 21, 10,19.99);
		Paint towd = new Paint("ThatOneWithTheDog", 40, 12,34.38);
		Paint aj = new Paint("AverageJoes", 16, 11,17.99);
		Paint dp = new Paint("DuluxourousPaints ", 10 , 22,25);
		
		PaintWizard pw = new PaintWizard();
		
		pw.addPaint(cm);
		pw.addPaint(towd);
		pw.addPaint(aj);
		pw.addPaint(dp);
		
		System.out.println("For painting a size of "+msq+"ms^2");
		System.out.println("least paint wasted using: "+pw.noWaste(msq));
		System.out.println("lowest cost using: "+pw.lp(msq));
		
		
	}
	
	private List<Paint> l1 = new ArrayList<>();
	
	public void addPaint(Paint paint) {
		this.l1.add(paint);
	}
	
	public List<Paint> getpaint(){
			return this.l1;
	}
	
	public String noWaste(double msq) {
		String best = "";
		List<Double> scores = new ArrayList<>();
		
		for(Paint i : l1) {
			
			
			double score = (msq%i.getLiters());
			scores.add(score);
			
			
			if(score == 0) {
				best = i.getName();
				return best;
				
			}
			else if(score <= scores.stream().reduce((a, b) -> Math.min(a, b)).get()) {
				best = i.getName();
				
			}

				
		}
		return best;

	}
	public String lp(double msq) {
		
		
		String best = "";
		
		List<Double> allcost = new ArrayList<>();
		
		for(Paint i : l1) {
			double cost = i.getPrice()*(Math.ceil(msq/(i.getLiters()*i.getMsqpl())));
			allcost.add(cost);
			if(cost <= allcost.stream().reduce((a, b) -> Math.min(a, b)).get()) {
				best = i.getName();
			}
			
			
		}
		
		return best;
	}
	
	



}
