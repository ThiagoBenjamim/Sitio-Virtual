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
			System.out.println("-------------------------------------------------------\n"
					+ "Digite o número correspondente ao que quer fazer:\n"
					+ "(0) Adicionar algo.\n"
					+ "(1) Remover algo.\n"
					+ "(2) Visualizar algo.\n"
					+ "(3) Encerrar.\n"
					+ "-------------------------------------------------------");
			
			switch(ent.nextInt()) {
			case 0:
				
				System.out.println("-------------------------------------------------------\n"
						+ "Digite o número correspondente ao que quer fazer:\n"
						+ "(0) Adicionar Plantação.\n"
						+ "(1) Adicionar Criadouro.\n"
						+ "(2) Adicionar Funcionário.\n"
						+ "(3) Adicionar Animal.\n"
						+ "(4) Adicionar Cultivo.\n"
						+ "(5) Voltar.\n"
						+ "-------------------------------------------------------");
				
				switch(ent.nextInt()) {
				case 0:
					
					fazenda.addPlantacoes(leCriaPlantacao(ent, fazenda));
					
					break;
				case 1:
					
					fazenda.addCriadouros(leCriaCriadouro(ent, fazenda));
					
					break;
				case 2:
					
					System.out.println("-------------------------------------------------------\n"
							+ "Digite o número correspondente ao que quer fazer:\n"
							+ "(0) Adicionar Funcionário a uma plantação.\n"
							+ "(1) Adicionar Funcionário a um criadouro.\n"
							+ "(2) Voltar.\n"
							+ "-------------------------------------------------------");
					
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
				
				System.out.println("-------------------------------------------------------\n"
						+ "Digite o número correspondente ao que quer fazer:\n"
						+ "(0) Remover Plantação.\n"
						+ "(1) Remover Criadouro.\n"
						+ "(2) Remover Funcionário.\n"
						+ "(3) Remover Animal.\n"
						+ "(4) Remover Cultivo.\n"
						+ "(5) Voltar.\n"
						+ "-------------------------------------------------------");
				
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
					
					System.out.println("-------------------------------------------------------\n"
							+ "Digite o número correspondente ao que quer fazer:\n"
							+ "(0) Remover Funcionário de uma plantação.\n"
							+ "(1) Remover Funcionário de um criadouro.\n"
							+ "(2) Voltar.\n"
							+ "-------------------------------------------------------");
					
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
				
				System.out.println("-------------------------------------------------------\n"
						+ "Digite o número correspondente ao que quer fazer:\n"
						+ "(0) Visualizar Fazenda.\n"
						+ "(1) Visualizar Proprietário.\n"
						+ "(2) Visualizar Plantação.\n"
						+ "(3) Visualizar Criadouro.\n"
						+ "(4) Visualizar Funcionário.\n"
						+ "(5) Visualizar Animais.\n"
						+ "(6) Visualizar Cultivos.\n"
						+ "(7) Visualizar Animal Específico.\n"
						+ "(8) Visualizar Cultivo Específico.\n"
						+ "(9) Visualizar Custo Mensal de uma Plantação.\n"
						+ "(10) Visualizar Custo Mensal de um Criadouro.\n"
						+ "(11) Visualizar Venda dos Cultivos de uma plantação.\n"
						+ "(12) Visualizar Venda dos Animais de um Criadouro.\n"
						+ "-------------------------------------------------------");
				
				
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
					
					System.out.println("-------------------------------------------------------\n"
							+ "Digite o número correspondente ao que quer fazer:\n"
							+ "(0) Visualizar Funcionário de uma plantação.\n"
							+ "(1) Visualizar Funcionário de um criadouro.\n"
							+ "(2) Voltar.\n"
							+ "-------------------------------------------------------");
					
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
		String CNPJ = ent.nextLine();
		
		System.out.println("Digite o CEP da fazenda:");
		String CEP = ent.nextLine();
		
		System.out.println("Digite o nome do proprietário:");
		String nomeProp = ent.nextLine();
		
		System.out.println("Digite o CPF do proprietário:");
		String CPFProp = ent.nextLine();
		
		System.out.println("Digite a quantidade de números de telefone do proprietário:");
		int numTel = ent.nextInt();
		ent.nextLine();
		String telProp[] = new String[numTel];
		for(int i = 0; i < numTel; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			telProp[i] = ent.nextLine();
		}
		
		Proprietario proprietario = new Proprietario(nomeProp, CPFProp, telProp);
		
		System.out.println("Digite a quantidade máxima de plantações da fazenda:");
		Plantacao plantacoes[] = new Plantacao[ent.nextInt()];
		ent.nextLine();
		
		System.out.println("Digite a quantidade máxima de criadouros da fazenda:");
		Criadouro criadouros[] = new Criadouro[ent.nextInt()];
		ent.nextLine();
		
		Fazenda fazenda = new Fazenda(nome, CEP, CNPJ, proprietario, plantacoes, criadouros);
		
		return fazenda;
	}
	
	public static Plantacao leCriaPlantacao(Scanner ent, Fazenda fazenda) {
		ent.nextLine();
		
		System.out.println("Digite a área da plantação(m²):");
		double area = ent.nextDouble();
		ent.nextLine();
		
		System.out.println("Digite o número máximo de funcinários dessa Plantação:");
		Funcionario funcionarios[] = new Funcionario[ent.nextInt()];
		ent.nextLine();
		
		System.out.println("Digite o custo de manutenção do local:");
		double custoLocal = ent.nextDouble();
		ent.nextLine();
		
		System.out.println("Digite o número máximo de cultivos dessa Plantação:");
		Cultivo cultivos[] = new Cultivo[ent.nextInt()];
		ent.nextLine();
		
		Plantacao plantacao = new Plantacao(fazenda.indexPlantacoes, area, funcionarios, custoLocal, cultivos);
		
		return plantacao;
	}
	
	public static Criadouro leCriaCriadouro(Scanner ent, Fazenda fazenda) {
		ent.nextLine();
		
		System.out.println("Digite a área do Criadouro(m²):");
		double area = ent.nextDouble();
		ent.nextLine();
		
		System.out.println("Digite o número máximo de funcinários desse Criadouro:");
		Funcionario funcionarios[] = new Funcionario[ent.nextInt()];
		ent.nextLine();
		
		System.out.println("Digite o custo de manutenção do local:");
		double custoLocal = ent.nextDouble();
		ent.nextLine();
		
		System.out.println("Digite o número máximo de animais desse Criadouro:");
		Animal animais[] = new Animal[ent.nextInt()];
		ent.nextLine();
		
		Criadouro criadouro = new Criadouro(fazenda.indexCriadouros, area, funcionarios, custoLocal, animais);
		
		return criadouro;
	}
	
	public static Funcionario leCriaFuncionario(Scanner ent, Setor setor) {
		ent.nextLine();
		
		
		System.out.println("Digite o nome do funcionário:");
		String nome = ent.nextLine();
		
		System.out.println("Digite o CPF do funcioário:");
		String CPF = ent.nextLine();
		
		System.out.println("Digite o salário do funcionário:");
		double salario = ent.nextDouble();
		ent.nextLine();
		
		System.out.println("Digite o setor do funcionário:");
		String setor2 = ent.nextLine();
		
		System.out.println("Digite a função do funcionário:");
		String funcao = ent.nextLine();
		
		System.out.println("Digite a quantidade de números de telefone do funcionário:");
		int numTel = ent.nextInt();
		ent.nextLine();
		String telFunc[] = new String[numTel];
		for(int i = 0; i < numTel; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			telFunc[i] = ent.nextLine();
		}
		
		Funcionario funcionario = new Funcionario(nome, setor.indexFuncionarios, CPF, salario, setor2, funcao, telFunc);
		
		return funcionario;
	}
	
	public static Animal leCriaAnimal(Scanner ent, Criadouro criadouro) {
		ent.nextLine();
		
		
		System.out.println("Digite o nome do animal:");
		String nome = ent.nextLine();
		
		System.out.println("Digite a espécie do animal:");
		String especie = ent.nextLine();
		
		System.out.println("Digite o tipo de ração do animal:");
		String racao = ent.nextLine();
		
		System.out.println("Digite o preco do animal:");
		double preco = ent.nextDouble();
		ent.nextLine();
		
		System.out.println("Digite o custo mensal do animal:");
		double custoMensal = ent.nextDouble();
		ent.nextLine();
		
		Animal animal = new Animal(nome, criadouro.indexAnimais, especie, racao, preco, custoMensal);
		
		return animal;
	}
	
	public static Cultivo leCriaCultivo(Scanner ent, Plantacao plantacao) {
		ent.nextLine();
		
		
		System.out.println("Digite a espécie do cultivo:");
		String especie = ent.nextLine();
		
		System.out.println("Digite o tipo do solo:");
		String solo = ent.nextLine();
		
		System.out.println("Digite o preco do cultivo:");
		double preco = ent.nextDouble();
		ent.nextLine();
		
		System.out.println("Digite o custo mensal do cultivo:");
		double custoMensal = ent.nextDouble();
		ent.nextLine();
		
		Cultivo cultivo = new Cultivo(plantacao.indexCultivos, especie, solo, preco, custoMensal);
		
		return cultivo;
	}
}
