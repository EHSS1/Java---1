import java.util.Scanner;
public class Exercicio5LetraB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int A = sc.nextInt();

        System.out.println("Digite o valor de B:");
        int B = sc.nextInt();

        System.out.println("Digite o valor de C:");
        int C = sc.nextInt();

        System.out.println("Digite o valor de D:");
        int D = sc.nextInt();

        int resultado = (A * B) - (C * D);

        System.out.println("Resultado = " + resultado);

	}

}
