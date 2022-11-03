package Constructors;

public class DefaultConstructor {
	public static void main(String[] args) {
//		
//		ABC obj1 = new ABC();
//		System.out.println(obj1.num);
//		System.out.println(obj1.name);
//		System.out.print("\n");
		
		ABC obj2 = new ABC(29, "Pathak");
		System.out.println(obj2.num);
		System.out.println(obj2.name);
		
		}

}

class ABC{
	int num = 30;
	String name = "amar";
	
//	ABC() {
//		System.out.println("Constructor Called");
//		}
	
	public ABC(int num, String name){
		this.name = name;
		this.num = num;
		System.out.println("Parameterized Constructor Called");
	}
}


