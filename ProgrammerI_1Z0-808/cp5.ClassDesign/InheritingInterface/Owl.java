package InheritingInterface;

public class Owl implements Nocturnal, Eat {

	public Owl() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isBlind() { return false; }
	
	public boolean isHerbivore(){return true;}

	public static void main(String[] args) {
		Nocturnal nocturnal = (Nocturnal)new Owl();
		System.out.println(nocturnal.isBlind());

	}

}
