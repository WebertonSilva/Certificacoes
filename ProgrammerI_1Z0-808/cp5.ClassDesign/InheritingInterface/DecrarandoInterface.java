package InheritingInterface;


/* Por default uma interface é:
 * Publica ou Default, Abstrata
 */
public interface DecrarandoInterface {	
	
	
	/* Por default um Atributo é : Public, Static e Final (Constante), 
	 * (Membros staticos não são herdados e não precisam de uma instância para serem acessados);
	 */
	double n = 10.1;
	
	
	//Por default um método é: Public e  Abstrata, são herdados e devem ser implementados
	int getNumerosInteiros();
	
	
	
	//Métodos de interface podem ser Static (Membros staticos não são herdados, nem implementados e não precisam de uma instância para serem acessados)	
	public static double getNumerosFracionais(){
		return n;
	};
	
	
	//Métodos de interface podem ser Default (são herdados e podem ou não ser implementados)	
	public default int getQualquerNumero() {
		return -1;
	}
	

}

