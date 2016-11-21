package InheritingInterface;

public class RulesInterfaceJava8 {
	
	public static void main(String args[]){
		
		move.print();
		
	}	
	
	interface move {
		
		/*
		 * A partir do java 8 é permitido métodos státicos em interface
		 * como o método main é statico ele compila normalmente
		 */
		
		public static void main(String[] args){
			System.out.println("Move");			
		}
		
		public static void print(){
			
		}
		
	}

}
