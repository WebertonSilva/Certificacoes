package SwitchCase;

public class Alfabeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String ss;
		ss = "a";
		
		
		String s = "B";		
		
		/*
		 * Quando utilizamos primitivos ou variáveis do tipo referência, como constantes no SwitchCase, 
		 * elas devem ser constantes (basicamente marcadas como final).
		 */
		
		final String c1 = "A";
		final String c2 = "B";
		final String c3 = "C";		
		
		
		switch(s) {		
		case c1 : {System.out.println("A");};
		case c3 : {System.out.println("C");}
		default : {System.out.println("Defaul");}		
		case c2 : {System.out.println("B");};
		}
		
		final int i = 3;
		final int y = 6;
		final int z = 9;
		
		switch(i+y) {		
		case i : {System.out.println(i); }break;		
		case y : {System.out.println(y);}break;
		case z : {System.out.println(z);}break;
		default : {System.out.println("Defaul");}
		
		}

//		Array não podem ser utilizados no case, pois apesar de ser constante (final), seus elementos podem ter o valor alterados.
		final int [] arr = new int[] {1,2,3};
		arr[0] = 4;
		

		
	}

}
