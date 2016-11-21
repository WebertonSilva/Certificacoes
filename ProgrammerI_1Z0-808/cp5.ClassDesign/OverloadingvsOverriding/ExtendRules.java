package OverloadingvsOverriding;

import java.io.IOException;

public class ExtendRules extends Rules {
		
	
	/*
	 * Em uma sobrecarga uma checked exception nova ou maior 
	 * do que a do m�todo sobrecarregado n�o deve ser declarada
	 * O tipo tamb�m deve ser o mesmo ou um subtipo, de modo 
	 * que a sobrecarga abixo n�o compilaria	
	 */
	
//	int suply() throws Exception {return 1;}
	
	
//	j� essa sobrecarga implementa corretamente o princ�pio da sobrecarga
	Integer suply() throws RuntimeException{
		return new Integer(1);		
	}

}
