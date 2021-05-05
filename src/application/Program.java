package application;
import java.util.Locale;
import java.util.Scanner;
import entities.PotencialEco;

public class Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter user id of the program:");
		String name = sc.nextLine();
		System.out.println("userid: " + name);
		System.out.print("\n");
		
		System.out.println("Defina quantidade de dependentes do cliente:");
		int qtdeDependentes = sc.nextInt(); sc.nextLine();
		System.out.println("Dependentes: " + qtdeDependentes);
		System.out.print("\n");
		
		System.out.println("Enter cod_Prof of the customer:");
		String cod_Prof = sc.nextLine();
		System.out.println("cod_Prof: " + cod_Prof);
		
		
		System.out.println("Enter with the initial value of the customer:");
		double initialValue = sc.nextDouble();
		System.out.println("Initial Value: " + initialValue);
		
		// ------------------------------//
		//    Chamada de PotencialEco    //
		// ------------------------------//
		
		// declaracao do Titular, codigo de profissao igual a 325.
		PotencialEco myPotencialTitular = new PotencialEco(name, qtdeDependentes);
		System.out.println("Codigo de Profissao Titular Conta: " + myPotencialTitular.getCod_Prof());
		
		// declaracao do Cotitular, codigo de profissao igual a 100.
		PotencialEco myPotencialCotitular = new PotencialEco(name, qtdeDependentes, cod_Prof, initialValue);
		System.out.println("Codigo de Profissao CoTitular Conta: " + myPotencialCotitular.getCod_Prof());
		
		sc.close();

	}
}
