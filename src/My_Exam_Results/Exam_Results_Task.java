package My_Exam_Results;

public class Exam_Results_Task 

public static double Physics (double Phy){
	return Phy;
	}

public static void Ph (double Phy) {
	if (Phy >90.0) {	
		System.out.println("You have passed Physics!");
	} else { 
		System.out.println("You have failed Physics!");
	}
}

public static double Chemistry (double Chem) {
	return Chem;
	}

public static void Ch (double Chem) {
	if (Chem >90.0) {	
		System.out.println("You have passed Chemistry!");
	} else { 
		System.out.println("You have failed Chemistry!");
	}
}

public static double Biology (double Bio) {
	return Bio;
	}

public static void Bi (double Bio) {
	if (Bio >90.0) {	
		System.out.println("You have passed Biology!");
	} else { 
		System.out.println("You have failed Biology!");
	}
}

public static double addAll (double Phy, double Chem, double Bio){
		return (Phy + Chem + Bio);
	}
		
public static double prct (double Phy, double Chem, double Bio) {
		return addAll(Phy, Chem, Bio)/4.50f;
}	

public static void pct (double Phy, double Chem, double Bio) {
	if ((Phy + Chem + Bio)/4.50f >= 60.0 && Phy >90.0 && Chem >90.0 && Bio >90.0) {	
		System.out.println("You have passed Overall, Congratulations!");
	} else { 
		System.out.println("You have failed Overall, Commiserations.");
	}
}

public static void main(String[] args) {
	
System.out.println("Physics Mark  = " + Physics(103) + " out of 150");
Ph(103);
System.out.println("Chemistry Mark = " + Chemistry(89) + " out of 150");
Ch(89);
System.out.println("Biology Mark = " + Biology(135) + " out of 150");
Bi(135);
System.out.println("Total Mark = " + addAll(103, 91, 135) + " out of 450");
System.out.println("Overall Percentage = " + prct(103, 89, 135) + "%");
pct(103, 89, 135);
	}	
			
//	int Total = (Physics + Chemistry + Biology);
//	float Percentage = (Physics + Chemistry + Biology)/4.50f;

}
