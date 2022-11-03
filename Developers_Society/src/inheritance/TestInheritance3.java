package inheritance;

public class TestInheritance3 {
	public static void main(String[] args) {
		cats c1 = new cats();
		dogs d1 = new dogs();
		
		c1.eat();
		c1.meow();
		d1.eat();
		d1.bark();
		
		//c1.bark(); Compile time error
		
	}

}

class animalia{
	void eat() {
		System.out.println("eating...");
	}
}
class cats extends animalia{
	void meow() {
		System.out.println("meowing...");
	}
}
class dogs extends animalia{
	void bark() {
		System.out.println("barking...");
	}
}