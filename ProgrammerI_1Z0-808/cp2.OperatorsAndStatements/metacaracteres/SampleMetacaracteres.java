package metacaracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleMetacaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Esse ^ � o exclus�o, ent�o dado uma condi��o boleana ele
//		exclui a op��o true, por isso a sa�da � false
		System.out.println(true^(false|true));
		
	}

}
