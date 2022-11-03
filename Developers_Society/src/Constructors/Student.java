package Constructors;

public class Student {
	
	int id;
	String name;
	int age;
	
	Student(int i, String n){
		this.id = i;
		this.name = n;
	}
	
	Student(int i, String n, int a){
		id = i;
		name = n;
		age = a;
	}
	
	void display() {
		System.out.println(id + " " + name + " " + age);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(112, "Aryan", 25);
		
		s1.display();
		s2.display();
		
	}

}
