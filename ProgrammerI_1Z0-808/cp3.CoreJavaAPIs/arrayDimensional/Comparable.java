package arrayDimensional;

import java.util.Arrays;

public class Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] strings = {{"A", "Z"},{"C","D","S", "y"},{"L"}};
		
		
		
//		O m�todo sort tenta fazer um cast para comparable, por�m arrays bidimensionais n�o s�o comparable 
//		por isso uma ClasCastException � lan�ada
		
//		Arrays.sort(strings);
		
		
		System.out.println(strings.length);
		
		for (String[] str : strings) {
			for (String s : str) {
				System.out.println(s);
			}
		}
		
		
	}

}
