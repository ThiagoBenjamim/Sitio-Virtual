package Principal;

public class Fazenda {
	private String nome;
	private int CNPJ;
	private int CEP;
	private Proprietario proprietario;
	private Plantacao plantacoes[];
	private Criadouro criadouros[];
	
	public Fazenda(String nome, int CEP, int CNPJ, Proprietario proprietario, Plantacao plantacoes[], Criadouro criadouros[]) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.CEP = CEP;
		this.proprietario = proprietario;
		this.plantacoes = plantacoes;
		this.criadouros = criadouros;
	}
	
	public void exibe() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < plantacoes.length; i++) {
			plantacoes[i].exibe();
		}
		for (int i = 0; i < criadouros.length; i++) {
			criadouros[i].exibe();
		}
	}
}
