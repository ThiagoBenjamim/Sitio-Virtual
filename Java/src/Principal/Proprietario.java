package Principal;

public class Proprietario {
	private String nome;
	private int CPF;
	private int CNPJ;
	private int[] tel;
	
	public Proprietario(String nome, int CPF, int CNPJ, int[] tel) {
		this.nome = nome;
		this.CPF = CPF;
		this.CNPJ = CNPJ;
		this.tel = tel;
	}
	
	public void exibe() {
		System.out.println("Nome:	" + nome);
		System.out.println("CPF:	" + CPF);
		System.out.println("CNPJ:	" + CNPJ);
		for (int i = 0; i < tel.length; i++) {
			System.out.println("Telefone " + (i + 1) + ":	" + tel[i]);
		}
	}
}
