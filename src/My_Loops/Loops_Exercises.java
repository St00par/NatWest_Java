package My_Loops;

public class Loops_Exercises {

	public static void main(String[] args) {
		 
		int a = 2000;

		switch (a) {
		case 1:
			if (a > 6000)
			System.out.println("AC");
			break;
		case 2:
			if (a > 4000 && a < 6000)
			System.out.println("ABD");
			break;
		case 3: 
			if (a > 2000 && a < 4000)
			System.out.println("ABE");
			break;
		case 4:
			if (a > 600 & a < 2000)
			System.out.println("135");
			break;
		case 5:
			if (a > 500 && a < 600)
			System.out.println("1346");
			break;
		case 6:
			if (a > 100 && a < 500)
			System.out.println("1347");
			break;
		case 7:
			if (a < 100)
			System.out.println("2");
			break;
		default:
			System.out.println("Your number is either 100, 500, 600, 2000, 4000 or 6000!");
			break;
		}

//		if (a>6000) {
//		System.out.println("AC");
//	} else if (a>4000 && a<6000) {
//		System.out.println("ABD");
//	} else if (a>2000 && a<4000) {
//		System.out.println("ABE");
//	} else if (a>600 & a<2000) {
//		System.out.println("135");
//	} else if (a>500 && a<600) {
//		System.out.println("1346");
//	} else if (a > 100 && a<500) {
//		System.out.println("1347");
//	} else if (a<100) {
//		System.out.println("2");
//	} else {
//		System.out.println("Your number is either 100, 500, 600, 2000, 4000 or 6000!");
//	}
		
	}
}
