// Cria um vetor com 5 números inteiros aleatórios entre 1 e 10. Lê um valor,
// multiplica todos os elementos do vetor por ele e escreve o resultado na
// tela
import java.util.Scanner;

public class Ex06VetorMultiplicacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] valores = new int[5];
		int[] valoresMult = new int[5];
		int mult;

		System.out.println("-- Multiplicação dos elementos de um vetor --\n");

		System.out.print("Vetor original: ");

		for (int i = 0; i < valores.length; i++) {
			valores[i] = (int)(Math.random() * 10 + 1);
			System.out.print(valores[i] + " ");
		}

		System.out.print("\n\nOlá, digite um número para calcular a "
			+ "multiplicação dos elementos: ");
		mult = input.nextInt();

		System.out.print("\nNovo vetor: ");

		for (int k = 0; k < valores.length; k++) {
			valoresMult[k] = valores [k] * mult;
			System.out.print(valoresMult[k] + " ");
		}

		System.out.println();

		input.close();
	}
}
