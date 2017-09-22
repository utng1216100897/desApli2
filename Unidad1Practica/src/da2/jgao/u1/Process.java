package da2.jgao.u1;

import java.io.Serializable;

public class Process implements Serializable {
	
	private double number1;
	private double number2;
	
	public Process(double number1,double number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	public Process() {
		
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	
	public double getProduct(){
		
		return (2*(Math.sqrt(number1))+ (5*Math.sqrt(number2))) + ((3*Math.sqrt(number1)) - (2*Math.sqrt(number2)));
	}
	@Override
	public String toString() {
		return "Process [number1=" + number1 + ", number2=" + number2 + "]";
	}

	
}

