package DeclaracaoVariaveis;

public class Scopo {
	
	
	static int x = 1;
	
	static int y = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
//		Se uma variável int x fosse declarado dentro desse scopo uma checked exception seria lançada.
		Scopo s = new Scopo();
		x = 10;
		s.x = 5;
		
		int c = x/s.x;
		System.out.println(c);
		
		
		int[] nums = {0,1,2,3,4};
		for (int x : nums) {
			System.out.println(x);			
		}
		
		
		for (int y = 0;y < 5; y++) {
			System.out.println(y);
		}
		
		
	}

}

class Scopo2{
	
	public static void main(String[] args) {

		
		int i = 1;
		
		do{
			
//			Se o int fosse declarado aqui dentro não estaria visível ao escop do while e uma checked exception seria lançada.
//			int i = 1;
			System.out.println(i++ + "");
		}while(i <=5);
		
		
		
	}
	
	
}
