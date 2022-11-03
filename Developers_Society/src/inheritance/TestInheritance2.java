package inheritance;

public class TestInheritance2 {
	public static void main(String[] args) {
		babyDog bd = new babyDog();
		bd.weep();
		bd.eat();
		bd.bark();
		
	}

}

class animal{
	void eat() {
		System.out.println("eating...");
	}
}
class Doggy extends animal{
	void bark() {
		System.out.println("barking...");
	}
}
class babyDog extends Doggy{
	void weep() {
		System.out.println("weeping...");
	}
}