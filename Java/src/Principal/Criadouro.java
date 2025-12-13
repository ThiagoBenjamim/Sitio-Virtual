package Principal;

public class Criadouro extends Setor {
	protected Animal animais[];
	protected int indexAnimais;
	
	public Criadouro(int ID, double area, Funcionario funcionarios[], double custoLocal, Animal animais[]) {
		super(ID, area, funcionarios, custoLocal);
		this.animais = animais;
		this.indexAnimais = 0;
	}
	
	public void addAnimal(Animal animal) {
		animais[indexAnimais] = animal;
		indexAnimais += 1;
	}
	
	public void exibeAnimais() {
		for (int i = 0; i < indexAnimais; i++) {
			if(animais[i] != null) {
				System.out.print("Animal " + (i + 1) + ":	");
			animais[i].exibeNome();
			}
		}
	}
	
	public double custoMensalTotal() {
		double total = custoLocal;
		for (int i = 0; i < indexAnimais; i++) {
			if(animais[i] != null) {
				total += animais[i].custoMensal;
			}
		}
		return total;
	}
	
	public double vendaTotal() {
		double total = 0;
		for (int i = 0; i < indexAnimais; i++) {
			if(animais[i] != null) {
				total += animais[i].preco;
			}
		}
		return total;
	}
}
