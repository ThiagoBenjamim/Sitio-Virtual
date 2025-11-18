package Principal;

public class Gerente extends Funcionario {
	private int numFuncionarios;
	
	public Gerente(String nome, int ID, int CPF, double salario, String setor, String funcao, int tel[], int numFuncionarios) {
		super(nome, ID, CPF, salario, setor, funcao, tel);
		this.numFuncionarios = numFuncionarios;
	}
	
	public void exibe() {
		super.exibe();
		System.out.println("Número de Funcionários gerenciados:	" + numFuncionarios);
	}
}
