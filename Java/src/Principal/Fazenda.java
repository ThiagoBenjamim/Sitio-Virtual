package Principal;

public class Fazenda {
	private String nome;
	private String CNPJ;
	private String CEP;
	protected Proprietario proprietario;
	protected Plantacao plantacoes[];
	protected Criadouro criadouros[];
	protected int indexPlantacoes;
	protected int indexCriadouros;
	
	public Fazenda(String nome, String CEP, String CNPJ, Proprietario proprietario, Plantacao plantacoes[], Criadouro criadouros[]) {
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
		proprietario.exibeNome();
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
