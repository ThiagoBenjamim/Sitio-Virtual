package Principal;

public class Proprietario {
	private String nome;
	private String CPF;
	private String[] tel;
	
	public Proprietario(String nome, String CPF, String[] tel) {
		this.nome = nome;
		this.CPF = CPF;
		this.tel = tel;
	}
	
	public void exibe() {
		System.out.println("Nome:	" + nome);
		System.out.println("CPF:	" + CPF);
			for (int i = 0; i < tel.length; i++) {
				if(tel[i] != null) {
					System.out.println("Telefone " + (i + 1) + ":	" + tel[i]);
				}
			}
	}
	
	public void exibeNome() {
		System.out.println("Nome do proprietário:	" + nome);
	}
}
