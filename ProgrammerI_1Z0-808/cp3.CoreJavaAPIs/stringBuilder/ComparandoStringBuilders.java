package stringBuilder;

public class ComparandoStringBuilders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s = new StringBuilder("Java");
		
		StringBuilder sb = new StringBuilder("Java");
		
		
		/*
		 * StringBuilder n�o sobreescreve o m�todo Equals();
		 * portanto a seguinte compara��o retorna false
		 */		
		System.out.println(s.equals(sb));
		
		/*
		 * Por�m se um cast para String for feito, o retorno seria
		 * true desde que String's sobreescrevem o m�todo Equals().
		 */
		System.out.println(s.toString().equals(sb.toString()));
		
		System.out.print("print " + sb);
		

	}

}
