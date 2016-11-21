package arrayDimensional;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Em uma inicialização de um array bidimencional, sepre ao menos o primeiro elemento deve ser informado.
//		int[] array[] = new int []   [10];  ---- Não compila.
		int[] array[] = new int [10] [];
		
		
		
		int[][] twoD = new int[3][2];
		
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " "); // print element
			System.out.println(); // time for a new row
		}
		
		
		

	}

}
