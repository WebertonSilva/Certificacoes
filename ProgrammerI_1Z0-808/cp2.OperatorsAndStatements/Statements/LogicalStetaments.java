package Statements;

public class LogicalStetaments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int y = 10;
			final int x;
			if (y > 5) {
				x = 2 * y;
			} else {
				x = 3 * y;
				// não compila
				// } else {
			}
		}

		{
			int x1 = 50, x2 = 75;
			boolean b = x1 >= x2;
			if (b = true)
				System.out.println("Success");
			else
				System.out.println("Failure");
		}

		
		{
			
			for (int x = 0; x < 5; x++) {
				System.out.println(x=-1);
			}
			
					
			
		}
		
		
	}

}
