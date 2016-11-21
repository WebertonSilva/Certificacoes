package Main;

public class Main {

	/*
	 * O m�todo Main deve tomar uma das seguintes formas:
	 * 
	 *  public static void main(String[] args) {}
	 * 
	 * 	public static void main(String... args) {
	 * 
	 *  e pode ser final
	 * 
	 */
	
	
	public final static void main(String[] args) {
		System.out.println("Iniciou!!!");
		
		
		new Main().teste();
	}
	
//	N�o � poss�vel dois m�todos main em um program de forma que 
//	o m�todo main abaixo n�o compila.
	
//	public final static void main(String... args) {
//		System.out.println("Iniciou");
//	}
	
	public final static void main(int[] args) {
		System.out.println("Iniciou");
	}
	
	
	public final static void main(String c) {
		System.out.println("Iniciou");
	}
	
	public void teste(){
		
	}
	

}
