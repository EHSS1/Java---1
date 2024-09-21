// Declare uma variável do tipo String para armazenar o nome de um carro;
// Declare uma variável do tipo int para armazenar a velocidade máxima desse carro;
// Declare uma variável do tipo float para armazenar o tempo de aceleração de 0 a 100 desse
//carro;

// Declare uma variável do tipo double para armazenar o preço desse carro;

// Leia pelo teclado o nome, a velocidade máxima, o tempo de aceleração de 0 a 100 e preço
//de um carro, e armazene nas referidas variáveis;

// Mostre uma frase com todas essas informações.

import java.util.Scanner;

public class DeclaracaoVariaveis {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String meuCarro = "Corolla";
		int velocidadeMaxima = 205;
		float tempoAceleracao = 9.2f;
		double preco = 149.000;
		
		System.out.println("Carro = "+meuCarro);
		System.out.println("Velocidade = "+velocidadeMaxima);
		System.out.println("Segundos de 0 a 100 = "+tempoAceleracao);
		System.out.println("Preço = "+preco);
		System.out.println("Meu Corolla é um carro muito foda! Corre pacas, 205Km é mole pra ele, chega de 0 à 100 em 9.2 segundos, só é muito caro, 149.000,00.");
		
		
	}
}

