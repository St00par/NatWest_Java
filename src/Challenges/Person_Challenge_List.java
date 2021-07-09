package Challenges;

import java.util.ArrayList;

public class Person_Challenge_List {
	
public static void main(String[] args) {
		
	Person_Challenge Steve = new Person_Challenge ("Steve", "53", "Technician");
	Person_Challenge Bob = new Person_Challenge ("Bob", "47", "Surgeon");
	Person_Challenge Harry = new Person_Challenge ("Harry", "49", "Draughtsman");
	Person_Challenge John = new Person_Challenge ("John", "41", "Consultant");
	Person_Challenge Stewart = new Person_Challenge ("Stewart", "48", "Software_Engineer");
	
	ArrayList<Person_Challenge> rugbyBoys = new ArrayList<>();

	rugbyBoys.add(Steve);
	rugbyBoys.add(Bob);
	rugbyBoys.add(Harry);
	rugbyBoys.add(John);
	rugbyBoys.add(Stewart);
	

for (Person_Challenge aPerson_Challenge : rugbyBoys) {
		if (aPerson_Challenge == Harry)
		System.out.println(Harry);
	}
	
for (Person_Challenge aPerson_Challenge : rugbyBoys) {
	System.out.println(aPerson_Challenge);
}
	
	
}
}