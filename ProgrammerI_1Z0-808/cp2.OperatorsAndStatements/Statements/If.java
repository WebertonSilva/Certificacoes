package Statements;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String out = "0";
		
		int i = -1, j= -5;
		
		if(i<5)
			if(j>0)
				if(i>j)
					out +=1;
				else out +="2";
			else out += "3";
		else out += "4";
		
		System.out.println(out);
		
		
		
		int _6 = 6;
		
		if (_6 > 6)
			System.out.println(">6");
			// Quando usamos if sem {}, apenas a proxima linha é considerada,
			// portanto nesse caso nenhuma linha seguinte é acentável entre o if e o else ou else if
		
			// System.out.println(" or ");  NÃO COMPILA
		else{
			System.out.println("<6");
		}
		
		
		
	}

}
