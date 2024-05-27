package com.stream;

import java.util.Objects;

class Empolyee extends Object{
	String name;
	int salary;
	int age;
	public Empolyee(String name, int salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empolyee other = (Empolyee) obj;
		return age == other.age && Objects.equals(name, other.name) && salary == other.salary;
	}
}

public class CheckingEqualsMethod {

	public static void main(String[] args) {
		Empolyee e1= new Empolyee("Ravi",12,30000);
		Empolyee e2= new Empolyee("Ravi",12,30000);
		
		System.out.println(e1.equals(e2));

	}
}

