package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> alist = new ArrayList<String>();
		
		alist.add("B");
		alist.add("C");
		alist.add("A");
		
		System.out.println(alist.indexOf("C"));
		
		Collections.reverse(alist);
		
		
		/*
		 * Elementos n�o existentes na lista, tem o indice
		 * de retorno -1		 *  
		 */
		System.out.println(alist.indexOf("Z"));

		Collections.sort(alist);
		
		System.out.println(alist.indexOf("A"));
		
	}

}
