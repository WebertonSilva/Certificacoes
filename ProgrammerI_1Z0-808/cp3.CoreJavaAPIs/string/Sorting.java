package string;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] strings = {"A","b", "C", "d", "E", "1", "@", "#","%","&", "*", "$", "-", "_"};
		
		Arrays.sort(strings);
		
		for(String s : strings ){
			
			System.out.println(s);
			
		}
		
		
		/**
		Ordem de Inicialização
		 - Caracter Especiais
		 - Números
		 - @
		 - Letras maíusculas
		 - Underscore
		 - Letras minúsculas   */
		
		String[] strings1 = {"1aBelha", "Abelha1", "Abelha", "aBELHA"};
		
		Arrays.sort(strings1);
		
		for(String s : strings1 ){
			
			System.out.println(s);
			
		}

	}

}
