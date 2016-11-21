package inicializing;

import java.util.Arrays;

public class Bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int i[][] = new int [3][3];
		
//		Alterei a inicialização da posição 0 do meu array
		i[0] = new int [2];		
		
//		Não compila, constantes de arrays devem ser utilizados apenas na inicialização.
//		i[2] = {1,2,3};		
		
		i[0][0] = 10;
		i[0][1]++;		
		
	
		for (int[] js : i) {
			for (int j : js) {
				System.out.println(j);
			}
		}
		
				
		final int ints[][] = new int [2][];
		
		
//		Métodos da classe Arrays lançama NullPointerException, se a referencia do arrays especificado é null.
		
//		Arrays.sort(ints[0]);  Lança NullPointerException.
		
		ints[0] = new int [3];
		
//		Agora  que a posição 0 do meu array tem uma referencia, ela pode ser sortidas
		Arrays.sort(ints[0]);  
		
		System.out.println(ints[1]);	
		
	}

}
