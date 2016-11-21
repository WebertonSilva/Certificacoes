package DeclaracaoVariaveis;

public class Primitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Em literais, range dentro de valor int,
		 * s�o considerados int implicitamente, por isso
		 * a necessidade do identificador 
		 */
		Long l =3l;
		
		Double d = 10d;
		
		Double dd = 10.1;
		
		Float f = 1.3f;
		
		Float ft = 1f;
		
		
		/*Em literais, range de quebrados s�o cosiderados 
		 * Doubles, por isso n�o h� necessidade quando se trata
		 * do tipo Double.
		 */
		
		Double db = 1.0;
		
		
		
		/*Valores quebrado podem ser feito o cast para inteiros, 
		 * por�m o valor � truncado.		  
		 */
		
		int i = (int) 1.9;
		System.out.println(i);
		
		
		double dddd = 6;
		System.out.println(dddd);
		
	}

}
