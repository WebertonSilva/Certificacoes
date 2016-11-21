package Statements;

public class Continue {
	
	static int x = 1;

	public static void main(String[] args) {
		
		int[] nums = {0,1,2,3,4};
		int[] nuns1 = new int[2];
		
		//A referencia pode ser copiada desde que o tipo do objeto (array 1D) sejam os mesmos.		
		nums = nuns1;
		
		
		
		
		
		
		
		for (int x : nums) {
			System.out.println(x);
			
			/*
			 * A statement "continue" deve estar dentro de uma condição ou 
			 * ser a última expresão a ser utilizada em um fluxo de controle
			 * */
			
//			continue; NÃO COMPILA
			
			System.out.println(x + Continue.x);
			
			
		}
		
		
		

	}

}
