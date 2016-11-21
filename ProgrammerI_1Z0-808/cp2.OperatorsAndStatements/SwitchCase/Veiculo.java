package SwitchCase;

public class Veiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int rodas = 4;
		
		switch(rodas){
		
		case 8 : System.out.println("É um caminhão"); break;
		
		case 4 : System.out.println("É um carro"); break;
		
		case 2 : System.out.println("É uma bicicleta");	break;	
			
		}
				
		
//		Esse exemplo não é valido, pois no switch os cases devem ser comparados a constantes. 
//		String carro = "Carro";
//		String bicicleta = "Bicicleta";
		
		
//		Para utiliza-las, o modificador final deve ser acrescentado.
		final String carro = "Carro";
		final String bicicleta = "Bicicleta";
		
		
		switch("Carro"){
		case carro : System.out.println("Tem quatro rodas"); break; 
		case bicicleta : System.out.println("Tem duas rodas"); break;
		}
		
		int w = 2;
		int z = 2;
		
		System.out.println(m( ((w+z) % 2 == 0) ? ((w > 0 && w < 10) ? (z==0 ? 1 : 5) : w) : z));
		
	}
	
	public static int m(int a) {
		return a * 2;
	}

}
