package CalculatorTask;

final public class Calculator {

	public double addition(double num1, double num2) {
		return num1 + num2;
	}

	public double divide(double num1, double num2) throws DivideByZeroException {
		if (num2 == 0) {
			throw new DivideByZeroException("Can't Divide by zero!");
		}
		return num1 / num2;
	}

	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public double subtract(double num1, double num2) {
		return num1 - num2;
	}

}
