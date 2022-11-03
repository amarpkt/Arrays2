package inheritance;

public class c extends B {
	public static void main(String[] args) {
		
		c obj = new c();
		c.msg();
		
	}

}
class A {
	static void msg() {
		System.out.println("Hello");
	}
}

class B {
	static void msg() {
		System.out.println("Welcome");
	}
}