package Principal;

public class Funcionario {
	private String nome;
	private int ID;
	private String CPF;
	private double salario;
	private String setor;
	private String funcao;
	private int tel[];
	
	public Funcionario(String nome, int ID, String CPF, double salario, String setor, String funcao, int tel[]) {
		this.nome = nome;
		this.ID = ID;
		this.CPF = CPF;
		this.salario = salario;
		this.setor = setor;
		this.funcao = funcao;
		this.tel = tel;
	}
	
	public void exibe() {
		System.out.println("Nome:	" + nome);
		System.out.println("ID:	" + ID);
		System.out.println("CPF:	" + CPF);
		System.out.println("Salario:	" + salario);
		System.out.println("Setor:	" + setor);
		System.out.println("Função:	" + funcao);
		if(tel[0] != 0) {
			for (int i = 0; i < tel.length; i++) {
				System.out.println("Telefone " + (i + 1) + ":	" + tel[i]);
			}
		}
	}
	
	public void exibeNome() {
		System.out.println("Nome:	" + nome);
	}
}