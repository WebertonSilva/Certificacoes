package ClassesVsFiles;

public class Teste {
	
	static int i;
	
	static{
		i = 10;
	}
	
	

	public static int notValid() {
	
		/*Variavel local, localizada dentro de um método, não 
		tem um valor defult, e eu preciso inicilizá-lo para utilizá-lo.
		*/
		int x;		
		
		//int reply =+ x; // DOES NOT COMPILE, X NÃO INICIALIZADO
		
		x=50;
		int reply =+ x;
		
		return reply;
	}
	
	public static void main(String[] args){	
		
		System.out.println("Variavel de Instancia " + i);
		System.out.println("Variavel Local " + Teste.notValid());
		
		
	}

}

