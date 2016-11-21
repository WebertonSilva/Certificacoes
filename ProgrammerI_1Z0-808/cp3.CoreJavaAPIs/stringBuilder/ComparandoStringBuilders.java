package stringBuilder;

public class ComparandoStringBuilders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s = new StringBuilder("Java");
		
		StringBuilder sb = new StringBuilder("Java");
		
		
		/*
		 * StringBuilder não sobreescreve o método Equals();
		 * portanto a seguinte comparação retorna false
		 */		
		System.out.println(s.equals(sb));
		
		/*
		 * Porém se um cast para String for feito, o retorno seria
		 * true desde que String's sobreescrevem o método Equals().
		 */
		System.out.println(s.toString().equals(sb.toString()));
		
		System.out.print("print " + sb);
		

	}

}
