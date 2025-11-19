package Principal;

public class Proprietario {
	private String nome;
	private int CPF;
	private String[] tel;
	
	public Proprietario(String nome, int CPF, String[] tel) {
		this.nome = nome;
		this.CPF = CPF;
		this.tel = tel;
	}
	
	public void exibe() {
		System.out.println("Nome:	" + nome);
		System.out.println("CPF:	" + CPF);
		if(tel[0] != null) {
			for (int i = 0; i < tel.length; i++) {
				System.out.println("Telefone " + (i + 1) + ":	" + tel[i]);
			}
		}
	}
	
	public void exibeNome() {
		System.out.println("Nome:	" + nome);
	}
}
