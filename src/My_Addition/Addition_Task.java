package My_Addition;

public class Addition_Task {

	public static void main(String[] args) {
		System.out.println(addTwo(10.5423456d, 150.46465d));
//		System.out.println(addTwo(2354467, 20000));
//		System.out.println(addTwo(1343, 345646));
//		System.out.println(subTwo(10, 20));// -10
//		System.out.println(subTwo(30, 20));
//		System.out.println(divTwo(10, 3));
		System.out.println(mulTwo(5.5, 11));
		divTwo(10, 4);


	}// END

	// methods - outside of the main method
	public static double addTwo(double number1, double number2) {
		return number1 + number2;
	}

	public static double subTwo(double number1, double number2) {
		return number1 - number2;
	}

	public static double mulTwo(double number1, double number2) {
		return number1 * number2;
	}

	public static void divTwo(double number1, double number2) {
		if (number1 < number2) {
			double result = number1 / number2;
			System.out.println(result);
        } else {
            System.out.println("Calculation cannot be completed");
		}
	}

}
