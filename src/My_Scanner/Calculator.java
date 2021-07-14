package My_Scanner;

public class Calculator {
	
	public void addTwo(double num1, double num2) {
		System.out.println("The answer is " +(num1 + num2));
	}
	
	public void subTwo(double num1, double num2) {
		System.out.println("The answer is " +(num1 - num2));
	}

	public void mulTwo(double num1, double num2) {
		System.out.println("The answer is " +(num1 * num2));
		}
	
	public void divTwo(double num1, double num2) throws IllegalArgumentException {
		if(num2 == 0) 
			throw new IllegalArgumentException("Cannot divide by Zero!");	
			System.out.println("The answer is " +(num1 / num2));
	}

}	
	
	
	
	
	
	
	
	
	


