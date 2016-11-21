package Finally;


import static java.lang.Math.max;

public class Aritimetic {

	public static void main(String[] args) {
		
		
		try {
			
			metodo();
			
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			System.out.println("Deus ruim");
		}
//		Aqui o Finally est� no metodo main e "J� era" � exibido.
		System.out.println("J� era");
		

	}
	
	public static void metodo()
	{
		try {
			throw new NullPointerException();
		} catch (ClassCastException e) {
			System.out.println("OCA");
		} finally{
			System.out.println("Final");			
		}
		
		/*O finally deve ser único e a última clausula do try/catch, o catch na sequência não compilaria. 
		 * 
		 * catch(RuntimeException e){
			System.out.println(e);
		}		
		*/
		
	
//		Aqui o Finally retorna o fluxo para o metodo main e "acabou"
//		n�o � exibido
		System.out.println("Acabou");		
	}
	
	
	public static int calculate(int a, int b) throws Exception {
		return a/b;
	}

}
