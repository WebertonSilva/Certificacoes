package index;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SetingIndex {

	public static void main(String[] args) throws 
	IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		/*
		 * O método Set do ArrayList retorna o elemento removido
		 * no index especificado, caso o index especificado não
		 * exista, uma exception indexOfBoud é lançada. 
		 */
		
		System.out.println(list.set(2, "D"));

	}

}
