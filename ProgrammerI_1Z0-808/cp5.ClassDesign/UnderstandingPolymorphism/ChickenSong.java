package UnderstandingPolymorphism;

class Chicken {
}

interface HenHouse {
	public java.util.List<Chicken> getChickens();
}

public class ChickenSong {
	public static void main(String[] args) {
		HenHouse house = (HenHouse) new Chicken();
				Chicken chicken = house.getChickens().get(0);
		for(int i=0; i<house.getChickens().size();
				chicken = house.getChickens().get(i++)) {
			System.out.println("Cluck");
		} 
	}
}
