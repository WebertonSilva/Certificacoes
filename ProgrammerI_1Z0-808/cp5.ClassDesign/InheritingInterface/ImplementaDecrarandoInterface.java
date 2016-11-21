package InheritingInterface;

public class ImplementaDecrarandoInterface implements DecrarandoInterface {
	
	
	//Métodos default(Abstratos) devem ser implementados.	
	public int getNumerosInteiros(){
		return 10;
	}
	
	public int getQualquerNumero(){
		return -10;
	}

	public static void main(String[] args) {
		

		// Acesso direto a membros staticos		
		System.out.println(DecrarandoInterface.n);
		
		ImplementaDecrarandoInterface i = new ImplementaDecrarandoInterface();		
		
		
		//Método default podem ser sobreescritos.		
		System.out.println(i.getQualquerNumero());
		

	}

}
