package com.Oops.Encapsulation;
/*
  Encapsulation ---> The banding of data into single entity is called as Encapsulation.
					Global Variable always private in Encapsulation.
*/
public class Encapsulation {
	
	private int salary;

	public void setSalary(int sal) {
		if (sal > 0) {
			salary = sal;
		} else {
			salary = 0;
		}
	}

	public int getSalary() {
		return salary;
	}

public static void main(String[] args) {
		Encapsulation  Encapsulation= new Encapsulation ();
		Encapsulation.setSalary(-5000);
		System.out.println("salary>>"+Encapsulation.getSalary());
	}
}

