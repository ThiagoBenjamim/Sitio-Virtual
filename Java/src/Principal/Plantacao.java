package Principal;

public class Plantacao  extends Setor {
	protected Cultivo cultivos[];
	protected int indexCultivos;
	
	public Plantacao(int ID, double area, Funcionario funcionarios[], double custoLocal, Cultivo cultivos[]) {
		super(ID, area, funcionarios, custoLocal);
		this.cultivos = cultivos;
		this.indexCultivos = 0;
	}
	
	public void addCultivo(Cultivo cultivo) {
		cultivos[indexCultivos] = cultivo;
		indexCultivos += 1;
	}
	
	public void exibeCultivos() {
		for (int i = 0; i < indexCultivos; i++) {
			if(cultivos[i] != null) {
				System.out.print("Cultivo " + (i + 1) + ":	");
				cultivos[i].exibeEspecie();
			}
		}
	}
	
	public double custoMensalTotal() {
		double total = custoLocal;
		for (int i = 0; i < indexCultivos; i++) {
			if(cultivos[i] != null) {
				total += cultivos[i].custoMensal;
			}
		}
		return total;
	}
	
	public double vendaTotal() {
		double total = 0;
		for (int i = 0; i < indexCultivos; i++) {
			if(cultivos[i] != null) {
				total += cultivos[i].preco;
			}
		}
		return total;
	}
}
