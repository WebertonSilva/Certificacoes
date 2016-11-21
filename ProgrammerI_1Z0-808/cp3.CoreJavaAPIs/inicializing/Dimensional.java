package inicializing;

import java.util.Arrays;

public class Dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int ints[] = {2,-1,4,5,3};
		Arrays.sort(ints);
		
		//	traz a indice da posição.	
		System.out.println(Arrays.binarySearch(ints, -1));
		
	}

}
