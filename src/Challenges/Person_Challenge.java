package Challenges;

import java.util.ArrayList;

public class Person_Challenge {

	public String name;
	public String age;
	public String job_title;
	
	public Person_Challenge() {
	
	}

	public Person_Challenge(String name, String age, String job_title) {
		this.name = name;
		this.age = age;
		this.job_title = job_title;
	}

	@Override
	public String toString() {
		return "My name is " + name + ", I am " + age + " years old" + ", I work as a " + job_title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
		

	}
	for (Person_Challenge p : rugbyBoys) {
	if (p.getName() == name);
	System.out.println(p);
}	
	
	
}
