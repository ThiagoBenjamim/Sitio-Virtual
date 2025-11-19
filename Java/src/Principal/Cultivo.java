package Principal;

public class Cultivo {
	private int ID;
	private String especie;
	private String tipoSolo;
	private double preco;
	private double custoMensal;
	
	public Cultivo(int ID, String especie, String tipoSolo, double preco, double custoMensal) {
		this.ID = ID;
		this.especie = especie;
		this.tipoSolo = tipoSolo;
		this.preco = preco;
		this.custoMensal = custoMensal;
	}
	
	public void exibe() {
		System.out.println("ID:	" + ID);
		System.out.println("Especie:	" + especie);
		System.out.println("Tipo de solo do cultivo:	" + tipoSolo);
		System.out.println("Preço do animal:	" + preco);
		System.out.println("Custo mensal do animal:	" + custoMensal);
	}
	
	public void exibeEspecie() {
		System.out.println("Especie:	" + especie);
	}
}
