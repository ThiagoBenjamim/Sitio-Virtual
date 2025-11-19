package Principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		ent.close();
	}
	
	public static Fazenda leCriaFazenda(Scanner ent) {
		System.out.println("Digite o nome da fazenda:");
		String nome = ent.nextLine();
		
		System.out.println("Digite o CNPJ da fazenda:");
		int CNPJ = ent.nextInt();
		
		System.out.println("Digite o CEP da fazenda:");
		int CEP = ent.nextInt();
		
		System.out.println("Digite o nome do proprietário:");
		ent.nextLine();
		String nomeProp = ent.nextLine();
		
		System.out.println("Digite o CPF do proprietário:");
		int CPFProp = ent.nextInt();
		
		System.out.println("Digite a quantidade de números de telefone do proprietário:");
		int numTel = ent.nextInt();
		int telProp[] = new int[numTel];
		for(int i = 0; i < numTel; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			telProp[i] = ent.nextInt();
		}
		
		Proprietario proprietario = new Proprietario(nomeProp, CPFProp, telProp);
		
		System.out.println("Digite a quantidade máxima de plantações da fazenda:");
		Plantacao plantacoes[] = new Plantacao[ent.nextInt()];
		
		System.out.println("Digite a quantidade máxima de criadouros da fazenda:");
		Criadouro criadouros[] = new Criadouro[ent.nextInt()];
		
		Fazenda fazenda = new Fazenda(nome, CEP, CNPJ, proprietario, plantacoes, criadouros);
		
		return fazenda;
	}
	
	public static Plantacao leCriaPlantacao(Scanner ent, Fazenda fazenda) {
		System.out.println("Digite a área da plantação(m²):");
		double area = ent.nextDouble();
		
		System.out.println("Digite o número máximo de funcinários dessa Plantação:");
		Funcionario funcionarios[] = new Funcionario[ent.nextInt()];
		
		System.out.println("Digite o custo de manutenção do local:");
		double custoLocal = ent.nextDouble();
		
		System.out.println("Digite o número máximo de cultivos dessa Plantação:");
		Cultivo cultivos[] = new Cultivo[ent.nextInt()];
		
		Plantacao plantacao = new Plantacao(fazenda.indexPlantacoes, area, funcionarios, custoLocal, cultivos);
		
		return plantacao;
	}
	
	public static Criadouro leCriaCriadouro(Scanner ent, Fazenda fazenda) {
		System.out.println("Digite a área do Criadouro(m²):");
		double area = ent.nextDouble();
		
		System.out.println("Digite o número máximo de funcinários desse Criadouro:");
		Funcionario funcionarios[] = new Funcionario[ent.nextInt()];
		
		System.out.println("Digite o custo de manutenção do local:");
		double custoLocal = ent.nextDouble();
		
		System.out.println("Digite o número máximo de animais desse Criadouro:");
		Animal animais[] = new Animal[ent.nextInt()];
		
		Criadouro criadouro = new Criadouro(fazenda.indexCriadouros, area, funcionarios, custoLocal, animais);
		
		return criadouro;
	}
	
	public static Funcionario leCriaFuncionario(Scanner ent, Setor setor) {
		System.out.println("Digite o nome do funcionário:");
		String nome = ent.nextLine();
		
		System.out.println("Digite o CPF do funcioário:");
		int CPF = ent.nextInt();
		
		System.out.println("Digite o salário do funcionário:");
		double salario = ent.nextDouble();
		
		System.out.println("Digite o setor do funcionário:");
		String setor2 = ent.nextLine();
		
		System.out.println("Digite a função do funcionário:");
		String funcao = ent.nextLine();
		
		System.out.println("Digite a quantidade de números de telefone do funcionário:");
		int numTel = ent.nextInt();
		int telFunc[] = new int[numTel];
		for(int i = 0; i < numTel; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			telFunc[i] = ent.nextInt();
		}
		
		Funcionario funcionario = new Funcionario(nome, setor.indexFuncionarios, CPF, salario, setor2, funcao, telFunc);
		
		return funcionario;
	}
	
	public static Animal leCriaAnimal(Scanner ent, Criadouro criadouro) {
		System.out.println("Digite o nome do animal:");
		String nome = ent.nextLine();
		
		System.out.println("Digite a espécie do animal:");
		String especie = ent.nextLine();
		
		System.out.println("Digite o tipo de espécie do animal:");
		String racao = ent.nextLine();
		
		System.out.println("Digite o preco do animal:");
		double preco = ent.nextDouble();
		
		System.out.println("Digite o custo mensal do animal:");
		double custoMensal = ent.nextDouble();
		
		Animal animal = new Animal(nome, criadouro.indexAnimais, especie, racao, preco, custoMensal);
		
		return animal;
	}
	
	public static Cultivo leCriaCultivo(Scanner ent, Plantacao plantacao) {
		System.out.println("Digite a espécie do cultivo:");
		String especie = ent.nextLine();
		
		System.out.println("Digite o tipo do solo:");
		String solo = ent.nextLine();
		
		System.out.println("Digite o preco do cultivo:");
		double preco = ent.nextDouble();
		
		System.out.println("Digite o custo mensal do cultivo:");
		double custoMensal = ent.nextDouble();
		
		Cultivo cultivo = new Cultivo(plantacao.indexCultivos, especie, solo, preco, custoMensal);
		
		return cultivo;
	}
}
