package Constructors;

public class Programmer extends Employee{
	int bonus = 10000;
	
	public static void main(String[] args) {
		
		Programmer p1 = new Programmer();
		System.out.println("Salary of Programmer is : " + p1.salary);
		System.out.println("Bonus of Programmer is  : " + p1.bonus);
	}

}

class Employee{
	int salary = 40000;
}
