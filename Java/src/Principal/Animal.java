package Principal;

public class Animal {
	private String nome;
	private int ID;
	private String especie;
	private String racao;
	protected double preco;
	protected double custoMensal;
	
	public Animal(String nome, int ID, String especie, String racao, double preco, double custoMensal) {
		this.nome = nome;
		this.ID = ID;
		this.especie = especie;
		this.racao = racao;
		this.preco = preco;
		this.custoMensal = custoMensal;
	}
	
	public void exibe() {
		System.out.println("Nome:	" + nome);
		System.out.println("ID:	" + ID);
		System.out.println("Especie:	" + especie);
		System.out.println("Ração:	" + racao);
		System.out.println("Preço do animal:	" + preco);
		System.out.println("Custo mensal do animal:	" + custoMensal);
	}
	
	public void exibeNome() {
		System.out.println("Nome:	" + nome);
		System.out.println("Especie:	" + especie);
	}
}
