package Statements;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Compila
		for(; ; ) {
			System.out.println("Hello World");
			break; //Necessário se não ocorre Lup infinito.
		}
		
		
//		Compila
		int x = 0;
//		Perceba que a declaração do for loop pode ter variações mas mantendo a mesma estrutura		 
		for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		
//		A seguinte sentença não compila, uma vez que y é uma variável local ao bloco for
//		System.out.print(y); //Não compila		
//		Uma sentança válida seria a exibição de variáveis que estão acessíveis dentro desse escopo ex:
		System.out.println(x);		
		
		
		
//		Não compila
		
//		esse é muito parecido com o anterior, mas perceba que o x já havia sido declarado fora do loop.
//		int x = 0;
//		for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
//		System.out.print(x + " ");
//		}
		
		

		/*
		 * O bloco de inicialização não deve conter duas vezes o tipo, o tipo é presente apenas uma vez e as
		 * variáveis são separadas por vírgulas, ex:
		 * 
		 * for(int y = 0, long j = 4; j < 5 && y<10; j++, y++) {}    // DOES NOT COMPILE 
		 * 
		 * Segue uma solução: */
		
		int y;
		long j;
		for(y = 0, j = 4; j < 5 && y<10; System.out.print("J " + j + " " + "\n"), System.out.print("J " + y + "\n"), teste(), j++, y++) { 
			System.out.println("vai chamar o teste");
		}			
		
		
		for (int i = 0; i < 5; i++, System.out.println(i + ".HHi ")) { // Aqui só vai ser printado a cada interação, 
																		//na primeira vez não tem iteração, mas na última vez quando não atende mais a condição ainda há iteração
			System.out.println(i + ".Hi ");
		}

	}
	
	static void teste(){
		System.out.println("Chamando teste...");
	}

}
