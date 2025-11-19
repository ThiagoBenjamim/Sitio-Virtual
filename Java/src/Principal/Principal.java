package Principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		boolean encerrar = true;
		int temp, tempAux;
		
		Fazenda fazenda = leCriaFazenda(ent);
		
		while(encerrar) {
			System.out.println("Bem-vindo ao Sitio-Virtual");
			System.out.println("-"
					+ "Digite o número correspondente ao que quer fazer:"
					+ "(0) Adicionar algo.	"
					+ "(1) Remover algo.	"
					+ "(2) Visualizar algo.	"
					+ "(3) Encerrar.	"
					+ "-");
			
			switch(ent.nextInt()) {
			case 0:
				
				System.out.println("-"
						+ "Digite o número correspondente ao que quer fazer:"
						+ "(0) Adicionar Plantação.	"
						+ "(1) Adicionar Criadouro.	"
						+ "(2) Adicionar Funcionário.	"
						+ "(3) Adicionar Animal.	"
						+ "(4) Adicionar Cultivo.	"
						+ "(5) Voltar.	"
						+ "-");
				
				switch(ent.nextInt()) {
				case 0:
					
					fazenda.addPlantacoes(leCriaPlantacao(ent, fazenda));
					
					break;
				case 1:
					
					fazenda.addCriadouros(leCriaCriadouro(ent, fazenda));
					
					break;
				case 2:
					
					System.out.println("-"
							+ "Digite o número correspondente ao que quer fazer:	"
							+ "(0) Adicionar Funcionário a uma plantação.	"
							+ "(1) Adicionar Funcionário a um criadouro.	"
							+ "(2) Voltar.	"
							+ "-");
					
					switch(ent.nextInt()) {
					case 0:
						
						System.out.println("Digite o ID da Plantação:");
						temp = ent.nextInt();
						if(fazenda.plantacoes[temp] != null) {
							fazenda.plantacoes[temp].addFuncionario(leCriaFuncionario(ent, fazenda.plantacoes[temp]));
						}
						else {
							System.out.println("Plantação Inexistente.");
						}
						
						break;
					case 1:
						
						System.out.println("Digite o ID do Criadouro:");
						temp = ent.nextInt();
						if(fazenda.criadouros[temp] != null) {
							fazenda.criadouros[temp].addFuncionario(leCriaFuncionario(ent, fazenda.criadouros[temp]));
						}
						else {
							System.out.println("Criadouro Inexistente.");
						}
						
						break;
					case 2:
						
						break;
					}
					
					break;
				case 3:
					
					System.out.println("Digite o ID do Criadouro:");
					temp = ent.nextInt();
					if(fazenda.criadouros[temp] != null) {
						fazenda.criadouros[temp].addAnimal(leCriaAnimal(ent, fazenda.criadouros[temp]));
					}
					else {
						System.out.println("Criadouro Inexistente.");
					}
					
					break;
				case 4:
					
					System.out.println("Digite o ID da Plantação:");
					temp = ent.nextInt();
					if(fazenda.plantacoes[temp] != null) {
						fazenda.plantacoes[temp].addCultivo(leCriaCultivo(ent, fazenda.plantacoes[temp]));
					}
					else {
						System.out.println("Plantação Inexistente.");
					}
					
					break;
				case 5:
					
					break;
				}
				
				break;
			case 1:
				
				System.out.println("-"
						+ "Digite o número correspondente ao que quer fazer:"
						+ "(0) Remover Plantação.	"
						+ "(1) Remover Criadouro.	"
						+ "(2) Remover Funcionário.	"
						+ "(3) Remover Animal.	"
						+ "(4) Remover Cultivo.	"
						+ "(5) Voltar.	"
						+ "-");
				
				switch(ent.nextInt()) {
				case 0:
					
					System.out.println("Digite o ID da Plantação:");
					temp = ent.nextInt();
					if(fazenda.plantacoes[temp] != null) {
						fazenda.plantacoes[temp] = null;
					}
					else {
						System.out.println("Plantação Inexistente.");
					}
					
					break;
				case 1:
					
					System.out.println("Digite o ID do Criadouro:");
					temp = ent.nextInt();
					if(fazenda.criadouros[temp] != null) {
						fazenda.criadouros[temp] = null;
					}
					else {
						System.out.println("Criadouro Inexistente.");
					}
					
					break;
				case 2:
					
					System.out.println("-"
							+ "Digite o número correspondente ao que quer fazer:	"
							+ "(0) Remover Funcionário de uma plantação.	"
							+ "(1) Remover Funcionário de um criadouro.	"
							+ "(2) Voltar.	"
							+ "-");
					
					switch(ent.nextInt()) {
					case 0:
						
						System.out.println("Digite o ID da Plantação:");
						temp = ent.nextInt();
						if(fazenda.plantacoes[temp] != null) {
							System.out.println("Digite o ID do funcionário:");
							tempAux = ent.nextInt();
							if(fazenda.plantacoes[temp].funcionarios[tempAux] != null) {
								fazenda.plantacoes[temp].funcionarios[tempAux] = null;	
							}
							else {
								System.out.println("Funcionário Inexistente.");
							}
						}
						else {
							System.out.println("Plantação Inexistente.");
						}
						
						break;
					case 1:
						
						System.out.println("Digite o ID do Criadouro:");
						temp = ent.nextInt();
						if(fazenda.criadouros[temp] != null) {
							System.out.println("Digite o ID do funcionário:");
							tempAux = ent.nextInt();
							if(fazenda.criadouros[temp].funcionarios[tempAux] != null) {
								fazenda.criadouros[temp].funcionarios[tempAux] = null;	
							}
							else {
								System.out.println("Funcionário Inexistente.");
							}
						}
						else {
							System.out.println("Criadouro Inexistente.");
						}
						
						break;
					case 2:
						
						break;
					}
					
					break;
				case 3:
					
					System.out.println("Digite o ID do Criadouro:");
					temp = ent.nextInt();
					if(fazenda.criadouros[temp] != null) {
						System.out.println("Digite o ID do animal:");
						tempAux = ent.nextInt();
						if(fazenda.criadouros[temp].animais[tempAux] != null) {
							fazenda.criadouros[temp].animais[tempAux] = null;	
						}
						else {
							System.out.println("Animal Inexistente.");
						}
					}
					else {
						System.out.println("Criadouro Inexistente.");
					}
					
					break;
				case 4:
					
					System.out.println("Digite o ID da Plantação:");
					temp = ent.nextInt();
					if(fazenda.plantacoes[temp] != null) {
						System.out.println("Digite o ID do cultivo:");
						tempAux = ent.nextInt();
						if(fazenda.plantacoes[temp].cultivos[tempAux] != null) {
							fazenda.plantacoes[temp].cultivos[tempAux] = null;	
						}
						else {
							System.out.println("Cultivo Inexistente.");
						}
					}
					else {
						System.out.println("Plantação Inexistente.");
					}
					
					break;
				case 5:
					
					break;
				}
				
				break;
			case 2:
				
				System.out.println("-"
						+ "Digite o número correspondente ao que quer fazer:	"
						+ "(0) Visualizar Fazenda.	"
						+ "(1) Visualizar Proprietário.	"
						+ "(2) Visualizar Plantação.	"
						+ "(3) Visualizar Criadouro.	"
						+ "(4) Visualizar Funcionário.	"
						+ "(5) Visualizar Animais.	"
						+ "(6) Visualizar Cultivos.	"
						+ "(7) Visualizar Animal Específico."
						+ "(8) Visualizar Cultivo Específico."
						+ "(9) Visualizar Custo Mensal de uma Plantação."
						+ "(10) Visualizar Custo Mensal de um Criadouro."
						+ "(11) Visualizar Venda dos Cultivos de uma plantação."
						+ "(12) Visualizar Venda dos Animais de um Criadouro."
						+ "-");
				
				
				switch(ent.nextInt()) {
				case 0:
					
					fazenda.exibe();
					
					break;
				case 1:
					
					fazenda.proprietario.exibe();
					
					break;
				case 2:
					
					System.out.println("Digite o ID da Plantação:");
					temp = ent.nextInt();
					if(fazenda.plantacoes[temp] != null) {
						fazenda.plantacoes[temp].exibe();
					}
					else {
						System.out.println("Plantação Inexistente.");
					}
					
					break;
				case 3:
					
					System.out.println("Digite o ID do Criadouro:");
					temp = ent.nextInt();
					if(fazenda.criadouros[temp] != null) {
						fazenda.criadouros[temp].exibe();
					}
					else {
						System.out.println("Criadouro Inexistente.");
					}
					
					break;
				case 4:
					
					System.out.println("-"
							+ "Digite o número correspondente ao que quer fazer:	"
							+ "(0) Visualizar Funcionário de uma plantação.	"
							+ "(1) Visualizar Funcionário de um criadouro.	"
							+ "(2) Voltar.	"
							+ "-");
					
					switch(ent.nextInt()) {
					case 0:
						
						System.out.println("Digite o ID da Plantação:");
						temp = ent.nextInt();
						if(fazenda.plantacoes[temp] != null) {
							System.out.println("Digite o ID do funcionário:");
							tempAux = ent.nextInt();
							if(fazenda.plantacoes[temp].funcionarios[tempAux] != null) {
								fazenda.plantacoes[temp].funcionarios[tempAux].exibe();;	
							}
							else {
								System.out.println("Funcionário Inexistente.");
							}
						}
						else {
							System.out.println("Plantação Inexistente.");
						}
						
						break;
					case 1:
						
						System.out.println("Digite o ID do Criadouro:");
						temp = ent.nextInt();
						if(fazenda.criadouros[temp] != null) {
							System.out.println("Digite o ID do funcionário:");
							tempAux = ent.nextInt();
							if(fazenda.criadouros[temp].funcionarios[tempAux] != null) {
								fazenda.criadouros[temp].funcionarios[tempAux].exibe();;	
							}
							else {
								System.out.println("Funcionário Inexistente.");
							}
						}
						else {
							System.out.println("Criadouro Inexistente.");
						}
						
						break;
					case 2:
						
						break;
					}
					
					break;
				case 5:
					
					System.out.println("Digite o ID do Criadouro:");
					temp = ent.nextInt();
					if(fazenda.criadouros[temp] != null) {
						fazenda.criadouros[temp].exibeAnimais();
					}
					else {
						System.out.println("Criadouro Inexistente.");
					}
					
					break;
				case 6:
					
					System.out.println("Digite o ID da Plantação:");
					temp = ent.nextInt();
					if(fazenda.plantacoes[temp] != null) {
						fazenda.plantacoes[temp].exibeCultivos();
					}
					else {
						System.out.println("Plantação Inexistente.");
					}
					
					break;
				case 7:
				
				System.out.println("Digite o ID do Criadouro:");
				temp = ent.nextInt();
				if(fazenda.criadouros[temp] != null) {
					System.out.println("Digite o ID do animal:");
					tempAux = ent.nextInt();
					if(fazenda.criadouros[temp].animais[tempAux] != null) {
						fazenda.criadouros[temp].animais[tempAux].exibe();;	
					}
					else {
						System.out.println("Animal Inexistente.");
					}
				}
				else {
					System.out.println("Criadouro Inexistente.");
				}
				
					break;
				case 8:
					
					System.out.println("Digite o ID da Plantação:");
					temp = ent.nextInt();
					if(fazenda.plantacoes[temp] != null) {
						System.out.println("Digite o ID do cultivo:");
						tempAux = ent.nextInt();
						if(fazenda.plantacoes[temp].cultivos[tempAux] != null) {
							fazenda.plantacoes[temp].cultivos[tempAux].exibe();	
						}
						else {
							System.out.println("Cultivo Inexistente.");
						}
					}
					else {
						System.out.println("Plantação Inexistente.");
					}
					
					break;
				case 9:
					
					System.out.println("Digite o ID da Plantação:");
					temp = ent.nextInt();
					if(fazenda.plantacoes[temp] != null) {
						System.out.println(fazenda.plantacoes[temp].custoMensalTotal());
					}
					else {
						System.out.println("Plantação Inexistente.");
					}
					
					break;
				case 10:
					
					System.out.println("Digite o ID do Criadouro:");
					temp = ent.nextInt();
					if(fazenda.criadouros[temp] != null) {
						System.out.println(fazenda.criadouros[temp].custoMensalTotal());
					}
					else {
						System.out.println("Criadouro Inexistente.");
					}
					
					break;
				case 11:
					
					System.out.println("Digite o ID da Plantação:");
					temp = ent.nextInt();
					if(fazenda.plantacoes[temp] != null) {
						System.out.println(fazenda.plantacoes[temp].vendaTotal());
					}
					else {
						System.out.println("Plantação Inexistente.");
					}
					
					break;
				case 12:
					
					System.out.println("Digite o ID do Criadouro:");
					temp = ent.nextInt();
					if(fazenda.criadouros[temp] != null) {
						System.out.println(fazenda.criadouros[temp].vendaTotal());
					}
					else {
						System.out.println("Criadouro Inexistente.");
					}
					
					break;
				}
				
				break;
			case 3:
				
				encerrar = false;
				
				break;
			}
		}
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
