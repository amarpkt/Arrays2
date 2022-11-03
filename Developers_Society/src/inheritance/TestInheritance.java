package inheritance;

public class TestInheritance {
	public static void main(String[] args) {
		dog d1 = new dog();
		d1.eat();
		d1.bark();
	}

}

class animals {
	void eat() {
		System.out.println("eating...");
	}
}

class dog extends animals{
	void bark() {
		System.out.println("barking...");
	}
}

