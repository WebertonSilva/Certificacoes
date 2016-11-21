package arrayAndList;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a1 =  {2,-1,4,5,3};		
		int[] a2 =  {2,-1,4,5,3};
		
		System.out.println((a1==a2) + "");
		System.out.println(Arrays.equals(a1,a2) + "");
		
		
//		O método deepEquals analisa dois objetos de arrays e retorna true se forem exatamente iguais, 
//		o código abaixo não compila porque os parametros passados não são objetos:
		
//		System.out.println(Arrays.deepEquals((a1,a2) + "");

			
		Integer[] a11 =  {2,-1,4,5,3};		
		Integer[] a22 =  {2,-1,4,5,3};
		
		
		System.out.println(Arrays.deepEquals(a11, a22 ) + "");
		
	}

}
