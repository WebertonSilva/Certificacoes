package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class SampleLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(13);
		list.add(11);
//		list.add(30);
		
		System.out.println(list.removeIf(e -> e % 2 != 0));				
		System.out.println(list);
			
	}

}
