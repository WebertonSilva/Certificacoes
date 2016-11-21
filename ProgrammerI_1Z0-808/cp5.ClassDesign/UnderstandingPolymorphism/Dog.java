package UnderstandingPolymorphism;

public class Dog extends Animal{
	
	public void eat() {System.out.println("Dogs eats");}

	public static void main(String[] args) {
		Animal a = new Dog();
		Dog d = new Dog();
		
		d.eat();
		a.eat();

	}

}
