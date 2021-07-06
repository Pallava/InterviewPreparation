package com.interviews.DesignPattern;

public class FactoryMethodPattern {

	public static void main(String[] args) {
		GetPlan gp = new GetPlan();
		Plan p = gp.getPlan("INS");
		p.getRate();
		p.calculateBill(10);

	}

}

class GetPlan{
	
	public Plan getPlan(String planType) {
		if(planType=="DOM") {
			return new DomesticPlan();
		}else if(planType=="INS") {
			return new InstitutionalPlan();
		}
		
		return null;
	}
}

abstract class Plan{
	protected double rate;
	abstract void getRate();
	
	
	public void calculateBill(int units) {
		System.out.println(rate*units);
	}
}

class DomesticPlan extends Plan{

	@Override
	void getRate() {
		rate = 3;
		
	}

}
class InstitutionalPlan extends Plan{

	@Override
	void getRate() {
		rate = 5;
		
	}

}

