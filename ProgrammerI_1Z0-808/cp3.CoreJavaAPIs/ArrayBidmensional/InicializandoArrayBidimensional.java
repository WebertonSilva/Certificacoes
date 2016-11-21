package ArrayBidmensional;

public class InicializandoArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int i [][] = {{1,2},{}};
		
		/*Por enquanto só inicializamos a referencia da primeira posição do
		 *array, de modo que se tentarmos acessar a segunda posição um]
		 *indexOfBound ocorrerá.
		 *Ex:*/
		
//		System.out.println(i[1][0]);
		
		/*
		 * Para acessarmos essa posição precisamos inicializar a sua referencia 
		 */
		
		i[1] = new int [1];
		
		/*
		Agora conseguimos acessá-la, porque na segunda posição do meu array
		bidimensional i eu  referenciei outro arry de tamanho 1
		*/
		System.out.println(i[1][0]);
		
		/*
		 * Porém se eu tentar acessar a segunda posição desse array eu tomo um
		 * indexOfBoud, porque eu na inicialização i[1] = new int [1]; 
		 * eu referenciei a um array de uma posição. 
		 *ex:*/
		
//		System.out.println(i[1][1]);
		
		
		
		
		
		
		
	}

}
