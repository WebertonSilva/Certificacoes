package ArrayBidmensional;

public class InicializandoArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int i [][] = {{1,2},{}};
		
		/*Por enquanto s� inicializamos a referencia da primeira posi��o do
		 *array, de modo que se tentarmos acessar a segunda posi��o um]
		 *indexOfBound ocorrer�.
		 *Ex:*/
		
//		System.out.println(i[1][0]);
		
		/*
		 * Para acessarmos essa posi��o precisamos inicializar a sua referencia 
		 */
		
		i[1] = new int [1];
		
		/*
		Agora conseguimos acess�-la, porque na segunda posi��o do meu array
		bidimensional i eu  referenciei outro arry de tamanho 1
		*/
		System.out.println(i[1][0]);
		
		/*
		 * Por�m se eu tentar acessar a segunda posi��o desse array eu tomo um
		 * indexOfBoud, porque eu na inicializa��o i[1] = new int [1]; 
		 * eu referenciei a um array de uma posi��o. 
		 *ex:*/
		
//		System.out.println(i[1][1]);
		
		
		
		
		
		
		
	}

}
