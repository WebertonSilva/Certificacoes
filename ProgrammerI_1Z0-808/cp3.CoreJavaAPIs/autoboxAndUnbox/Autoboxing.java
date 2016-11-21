package autoboxAndUnbox;

import java.util.List;
import java.util.ArrayList;


public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = Integer.valueOf("5");		
		System.out.println(i);
		
		double y = Integer.parseInt("5");		
		System.out.println(y);
		
		
		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);
		ages.add(null);
		for (int age : ages) System.out.print(age);
		
		
		

	}

}
