package prints;

public class PrintVSPrintLn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*O método Print mantém o cursor na mesma linha
		 * e o parâmetro é obrigatório
		 */
	    System.out.print("JA");
	    System.out.print("VA");
	    
	    
	    System.out.println("\n");
	    /*
	     * Já o método PrintLN move o cursor para uma nova linha
	     * após printar, e argumento não é obrigatórios
	     * 
	     */
	    System.out.println();
	    System.out.println("JA");
	    System.out.println("VA");
	}

}
