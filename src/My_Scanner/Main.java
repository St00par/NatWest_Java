package My_Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	boolean running = true;
		
	while (running) {
	Scanner scan = new Scanner(System.in);
	Calculator calc = new Calculator();
	
	System.out.println("What would you like to do? Add = 1, Subtract = 2, Multiply = 3, Divide = 4 or Quit = 0");
	int operator = scan.nextInt();
	
	System.out.println("Enter your first number...");
    double num1 = scan.nextDouble();
    
    System.out.println("Enter your second number...");
    double num2 = scan.nextDouble();
   
	switch (operator) {
	
	case 1:
		if (operator==1)
		calc.addTwo(num1, num2);
		break;
	case 2:
		if (operator==2)
		calc.subTwo(num1, num2);
		break;
	case 3: 
		if (operator==3)
		calc.mulTwo(num1, num2);
		break;
	case 4:
		if (operator==4) 
		try {
		calc.divTwo(num1, num2); 
		} catch(IllegalArgumentException divZero) {
	        System.out.println(divZero);}
		break;
	case 0:
		if (operator==0)
		System.out.println("The calculator is closed.  Thank you for using calculator, see you soon!");
		scan.close();
		running = false;
		break;
	default:
		System.out.println("Your calculation cannot be performed.  Please select a valid option (1-4) next time!");
		break;
	}
	}
	}
}


	
	
	

