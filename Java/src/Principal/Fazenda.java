package Principal;

public class Fazenda {
	private String nome;
	private int CNPJ;
	private int CEP;
	private Proprietario proprietario;
	private Plantacao plantacoes[];
	private Criadouro criadouros[];
	protected int indexPlantacoes;
	protected int indexCriadouros;
	
	public Fazenda(String nome, int CEP, int CNPJ, Proprietario proprietario, Plantacao plantacoes[], Criadouro criadouros[]) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.CEP = CEP;
		this.proprietario = proprietario;
		this.plantacoes = plantacoes;
		this.criadouros = criadouros;
		this.indexPlantacoes = 0;
		this.indexCriadouros = 0;
	}
	
	public void addPlantacoes(Plantacao plantacao) {
		plantacoes[indexPlantacoes] = plantacao;
		indexPlantacoes += 1;
	}
	
	public void addCriadouros(Criadouro criadouro) {
		criadouros[indexCriadouros] = criadouro;
		indexCriadouros += 1;
	}
	
	public void exibe() {
		System.out.println("Nome:	" + nome);
		System.out.println("CNPJ:	" + CNPJ);
		System.out.println("CEP:	" + CEP);
		proprietario.exibe();
		if(plantacoes[0] != null) {
			for (int i = 0; i < plantacoes.length; i++) {
				plantacoes[i].exibe();
			}
		}
		if(criadouros[0] != null) {
			for (int i = 0; i < criadouros.length; i++) {
				criadouros[i].exibe();
			}
		}
	}
}
