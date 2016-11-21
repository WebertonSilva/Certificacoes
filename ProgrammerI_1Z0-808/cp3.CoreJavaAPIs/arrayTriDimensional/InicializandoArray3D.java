package arrayTriDimensional;

public class InicializandoArray3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int i [][][] = new int [3][2][1];
		
		i[1][1][1] = 20;
		
		System.out.println(i[1][1][1]);
	
		/*
		 * Essa inicialização contém 1 Array de Três referências(indice)  
		 * Dentro de cada uma dessas três referencias, outra referencia com tamanho(indice) 1
		 * Dentro de cada uma dessa referencia, outra referencia para um array de tamanho 2.
		 * 
		 * Resumindo, é um array de tamanho 3, dentro de cada posição, uma referencia a outro array de tamanho 1,
		 * dentro de cada array de tamanh 1, uma outra referencia a outro array de tamanho 2.
		 */
		
		
	}

}
