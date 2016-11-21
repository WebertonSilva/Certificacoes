package string;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//O indice, inicia no index e vai até uma posição anterior ao index final
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7, 8));
		System.out.println(numbers.substring(7));
		
		
		//O mesmo ocorre pro delete
		System.out.println("\n");
		StringBuilder b = new StringBuilder("rumble");
		b.append(4);
		b.deleteCharAt(3);
		b.delete(3, b.length()-1);
		System.out.println(b);
		
		System.out.println("\n");
		
		/**Lembre-se que as cordas são imutáveis e literais são reunidas. O JVM criado apenas um literal na memória. 
		 * X e Y ambos apontam para a mesma localização na memória; Portanto, a declaração produz verdadeiro. 
		 * Ele fica ainda mais complicado. Considere este código:*/
		
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y); // true
		
		System.out.println("\n");
		
		/**Embora x e z acontecer para avaliar a mesma cadeia, um é calculado em
		tempo de execução. Uma vez que não é o mesmo em tempo de compilação, um novo objeto String é criado.*/
		
//		Compara o Objeto
		String r = "Hello World";
		String z = " Hello World".trim();
		System.out.println(r == z); // false
		
		System.out.println("\n");
		
//		Compara a referencia
		String v = "Hello World";
		String w = " Hello World     ".trim();		
		System.out.println(v.equals(w)); // true
		
		/**Desde que você tenha solicitado especificamente um objeto String diferente,
		 *  o valor agrupado não é compartilhado.*/
		
//		Compara objetos que são diferentes
		System.out.println("\n");
		String o = new String("Hello World");
		String p = "Hello World";
		System.out.println(o == p); // false
		
//		Compara referencia dos objetos em memória que são iguais
		System.out.println("\n");
		String m = new String("Hello World");
		String n = "Hello World";
		System.out.println(m.equals(n)); // true
		

	}

}
