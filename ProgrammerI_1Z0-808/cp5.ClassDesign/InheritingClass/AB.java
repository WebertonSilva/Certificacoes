package InheritingClass;

public class AB {

	public static void main(String[] args) {
		A ab = new B();
		ab.print();
		((B) ab).print("C");
		C c = new C();
		
		AB abb = new AB();
		abb.m(c);
	}
	
	public void m(A a) {
		if (a instanceof B)
			((B) a).print("C");
		
		a.print();
	}

}

class C extends A {
	
}