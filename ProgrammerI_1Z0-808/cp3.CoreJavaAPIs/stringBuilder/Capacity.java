package stringBuilder;

public class Capacity {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();		
//		A capacidade default de um ob. String Builder é 16 
		System.out.println(sb.capacity());
		
		
//		Ou ela pode ser definida na inicialização
		StringBuilder s = new StringBuilder(5);
		System.out.println(s.capacity());
//		Se uma string maior for inputada a capacicty aumenta automaticamente.
		s.append("Aumenta Capacidade automaticamente");
		System.out.println(s.capacity());
		
		
		
		/*Quando você inicializa um objeto StringBuilde com uma string
		 * utilizando, a capacidade default é somada com o tamanho dessa
		 * string inicilizada
		 */		
		StringBuilder sb1 = new StringBuilder("CAPACITY");
		System.out.println(sb1.capacity());
		/*
		 * Quando uma nova String é appendida, caso não ultrapasse o
		 * tamanho da capacidade corrente, a mesma permanece inalterada. 
		 */
		sb1.append(" TOTAL");
		System.out.println(sb1.capacity());
		
		
		
		
		
		
		
	}

}
