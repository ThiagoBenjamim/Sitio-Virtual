package Principal;

public abstract class Setor {
	private int ID;
	private double area;
	protected Funcionario funcionarios[];
	protected int indexFuncionarios;
	protected double custoLocal;
	
	public Setor(int ID, double area, Funcionario funcionarios[], double custoLocal) {
		this.ID = ID;
		this.area = area;
		this.funcionarios = funcionarios;
		this.custoLocal = custoLocal;
		this.indexFuncionarios = 0;
	}
	
	public void addFuncionario(Funcionario funcionario) {
		funcionarios[indexFuncionarios] = funcionario;
		indexFuncionarios += 1;
	}
	
	public void exibe() {
		System.out.println("ID:	" + ID);
		System.out.println("Área do local:	" + area);
		System.out.println("Custo do Local:	" + custoLocal);
		if(funcionarios[0] != null) {
			for (int i = 0; i < funcionarios.length; i++) {
				funcionarios[i].exibeNome();
			}
		}
	}
}