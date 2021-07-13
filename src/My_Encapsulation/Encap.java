package My_Encapsulation;

import java.util.ArrayList;

public class Encap {
		public String name;
		public double balance;

	
	public ArrayList<Encap> listCust = new ArrayList<>();

	public Encap() {
	
	}

	public Encap(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
		
	@Override
	public String toString() {
		return "Encap [name=" + name + ", balance=" + balance + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public void setListOfCust(ArrayList<Encap> listofCust) {
		this.listCust = listofCust;
	}

	public void addList(Encap p) {
		listCust.add(p);
	}
	
	public void printAll() {
		for (Encap p : listCust) {
			System.out.println(p);
		}
		}
	
//	public double withdraw() {
//		this.withdraw = (balance - withdraw);
//	}
	public void balance() {
		System.out.println(balance);
	}
	
	
	public ArrayList<Encap> getlistCust() {
		return listCust;
	}

	public void setlistCust(ArrayList<Encap> listCust) {
		this.listCust = listCust;
	}
}

