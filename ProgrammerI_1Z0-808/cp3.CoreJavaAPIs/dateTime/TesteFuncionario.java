package dateTime;

import java.util.Date;
public class TesteFuncionario{

	public static void main(String[] args){

		/*
		Funcionario f = new Funcionario();		
		f.nome = "Antônio";
		f.departamento = "Manutenção";
		f.salario = 1500;
		f.dataAdmissao = "01012010";
		f.rg = "123456789";
		f.mostra();
		*/

		Funcionario f1 = new Funcionario();        
        f1.nome = "Danilo";
        f1.salario = 100;
        f1.dataAdmissao = Data.dataAdmissao(01, 01, 2010);

        Funcionario f2 = f1;

        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");        
        }
	}
}

class Funcionario {

	String nome;
	String departamento;
	double salario;
	Date dataAdmissao;
	String rg;

	void aumentaSalario(double aumento){		
		this.salario += aumento; 
	}

	double ganhoAnual(){
		return this.salario * 12;
	}

	void mostra(){
		System.out.println("O nome do Funcionário é : " + this.nome);
		System.out.println("O departamento do " + this.nome + "é o : " + this.departamento);
		System.out.println("O departamento do " + this.nome + "é o : " + this.departamento);
		System.out.println("Foi admitido em : " + this.dataAdmissao);
		System.out.println("O salário do" + this.nome + "é de :" + this.salario);
		System.out.println("O ganho anual é de : " + ganhoAnual());
	}
}

class Data{

	@Deprecated
	static Date dataAdmissao(int dia, int mes, int ano){
		return new Date(ano, mes, dia);
	}
}