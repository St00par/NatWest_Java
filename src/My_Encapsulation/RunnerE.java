package My_Encapsulation;

import My_Encapsulation.Encap;

public class RunnerE {
	public static void main(String[] args) {
		
	Encap p = new Encap();

	Encap Bob = new Encap("Bob", 0.53d);
	Encap Jim = new Encap("Jim", 54.10d);
	Encap Harry = new Encap("Harry", 213.12d);
	Encap Steve = new Encap("Jim", 19.96d);
	
	p.addList(Bob);
	p.addList(Jim);
	p.addList(Harry);
	p.addList(Steve);
	p.printAll();
	p.balance();

}
}