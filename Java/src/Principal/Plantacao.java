package Principal;

public class Plantacao  extends Setor {
	private Cultivo cultivos[];
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
		for (int i = 0; i < cultivos.length; i++) {
			System.out.print("Cultivo " + (i + 1) + ":	");
			cultivos[i].exibe();
		}
	}
}
