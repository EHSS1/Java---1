import java.util.Scanner;
public class Exercicio5LetraC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vendedor = "Carlos";
		double salarioBase = 2.500;
		int totalVendas = 50;
		double comissao = 0.5*salarioBase;
		double salarioLiquido = salarioBase + comissao;
		
		
		System.out.println("Salário Líquido de " + salarioLiquido);

	}

}
