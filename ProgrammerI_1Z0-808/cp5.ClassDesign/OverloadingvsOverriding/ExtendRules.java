package OverloadingvsOverriding;

import java.io.IOException;

public class ExtendRules extends Rules {
		
	
	/*
	 * Em uma sobrecarga uma checked exception nova ou maior 
	 * do que a do método sobrecarregado não deve ser declarada
	 * O tipo também deve ser o mesmo ou um subtipo, de modo 
	 * que a sobrecarga abixo não compilaria	
	 */
	
//	int suply() throws Exception {return 1;}
	
	
//	já essa sobrecarga implementa corretamente o princípio da sobrecarga
	Integer suply() throws RuntimeException{
		return new Integer(1);		
	}

}
