package InheritingInterface;

public class RulesInterfaceJava8 {
	
	public static void main(String args[]){
		
		move.print();
		
	}	
	
	interface move {
		
		/*
		 * A partir do java 8 � permitido m�todos st�ticos em interface
		 * como o m�todo main � statico ele compila normalmente
		 */
		
		public static void main(String[] args){
			System.out.println("Move");			
		}
		
		public static void print(){
			
		}
		
	}

}
