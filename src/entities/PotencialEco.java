package entities;

public class PotencialEco {

	private String name;
	private int qtde_Dependentes;
	private String cod_Prof;
	private double balance;
	
	public PotencialEco() {
	}
	
	//Este construtor ele vai receber todos os dados
	public PotencialEco(String name, int qtde_Dependentes, String cod_Prof, double initialDeposit) {
		this.name = name;
		this.qtde_Dependentes = qtde_Dependentes;
		this.cod_Prof = cod_Prof;
		updateDeposit(initialDeposit);
	}
	
	//Este construtor ele vai receber apenas o nome e quantidade de dependentes - Construtor Reduzido.
	public PotencialEco(String name, int qtde_Dependentes) {
		this.name = name;
		this.qtde_Dependentes = qtde_Dependentes;
		cod_Prof = "000";  // eh atribuido um valor padrao para o dado.
	}
	
	public String getName() {
		return name;
	}
	
	public String getCod_Prof() {
		return cod_Prof;
	}
	
	public int getQtde_Dependentes() {
		return qtde_Dependentes;
	}
	
	public void setCod_Prof(String cod_Prof) {
		this.cod_Prof = cod_Prof;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQtde_Dependentes(int qtde_Dependentes) {
		this.qtde_Dependentes = qtde_Dependentes;
	}
	
	// updateDeposit(initialDeposit);
	public void updateDeposit(double deposit) {
		balance += deposit;
	}
}
