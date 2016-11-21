package DeclaracaoVariaveis;

public class ScopoVariableStatic {
	
	
	static int y=0;

	public static void main(String[] args) {
		ScopoVariableStatic scopo = new ScopoVariableStatic();
		
		
//		for (int y = 0;y < 5; y++) {
//			System.out.println(ScopoVariableStatic.y);
//		}
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		//System.out.println(s1 == s2);
		//System.out.println(s1.equals(s2));
		
		
		Pessoa p1 = new Pessoa("Weberton", 28);
		Pessoa p2 = new Pessoa("Weberton", 28);
		System.out.println(p1.equals(p2)); // true
		
		
		Pessoa p3 = scopo.metodoDoido(p1);
		p1.fazerAniversario();
		p1.fazerAniversario(50);
		p1.fazerAniversario(20);
		p3 = p1.fazerAniversario(5);
		System.out.println(p1.equals(p2));
		
		System.out.println("P1: " + p1);
		System.out.println("P2: " + p2);
		System.out.println("P3: " + p3);
		
		
//		p2.fazerAniversario();
//		
//		System.out.println(p1 == p2);
//		System.out.println(p1.equals(p2));
		
		
	}
	
	public Pessoa metodoDoido(Pessoa x) {
		return x.fazerAniversario(); // w28 -> w29
//		x = new Pessoa("Taboao", 24);
//		x.fazerAniversario(); // t24 -> t25
//		return x;
		
	}

}

class Pessoa {
	
	private final String nome;
	private final int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public Pessoa fazerAniversario() {
		Pessoa p = new Pessoa(this.nome, this.idade + 1);
		return p;
	}
	
	public Pessoa fazerAniversario(int numAnos) {
		Pessoa p = new Pessoa(this.nome, this.idade + numAnos);
		return p;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	

	
}
