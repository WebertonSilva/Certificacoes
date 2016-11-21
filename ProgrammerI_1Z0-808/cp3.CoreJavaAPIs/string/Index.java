package string;

import java.util.ArrayList;
import java.util.List;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Procurar um index inexistente não causa IndexOfBoud
	searchIndex();
//	Acessar um index inexistente causa IndexOfBoud
	acessingIndex();
		
	}
	
	static void searchIndex(){
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("C");
		list.add("B");
		
		int i = list.indexOf("D");
		System.out.println(i);	
	}
	
	static void acessingIndex(){
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("C");
		list.add("B");		
		
		String i  = list.get(3);
		
		System.out.println(i);	
	}

}
