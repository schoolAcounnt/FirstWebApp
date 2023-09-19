package model;

public class divideClass {
	private double numOne;
	private double numTwo;
	private double Total;
	
	public divideClass(double numOne, double numTwo) {
		super();
		this.numOne = numOne;
		this.numTwo = numTwo;
		calculate(numOne,numTwo);
	}

	public double getNumOne() {
		return numOne;
	}

	public void setNumOne(double numOne) {
		this.numOne = numOne;
	}

	public double getNumTwo() {
		return numTwo;
	}

	public void setNumTwo(double numTwo) {
		this.numTwo = numTwo;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}
	
	public double calculate(double One, double Two) 
	{
		this.Total = One / Two;
		return this.Total;
	}
	@Override
	public String toString() {
		return "divideClass [numOne=" + numOne + ", numTwo=" + numTwo + ", Total=" + Total + "]";
	}
	
	
	
	
}
