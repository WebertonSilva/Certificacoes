package dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy MM dd");
		
		/*
		 * Para o parse ocorrer sem nenhuma exception, nenhuma informação 
		 * faltante pode ocorrer, ex:
		 */
		
//		LocalDate date = LocalDate.parse("2015 4 17", f); NÃO COMPILA
//		LocalDate date = LocalDate.parse("2015 04 7", f); NÃO COMPILA
//		LocalDate date = LocalDate.parse("15 04 17", f); NÃO COMPILA
		
		LocalDate date = LocalDate.parse("2015 04 17", f);
		  
		System.out.println(date);
		  

	}

}
