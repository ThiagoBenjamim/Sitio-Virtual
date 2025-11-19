package Principal;

public class Criadouro extends Setor {
	private Animal animais[];
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
		for (int i = 0; i < animais.length; i++) {
			System.out.print("Animal " + (i + 1) + ":	");
			animais[i].exibe();
		}
	}
}
