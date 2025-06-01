// Jogo de adivinhação: Lê um número digitado pela pessoa e verifica se é igual
// ao que foi gerado pelo computador aleatoriamente
import java.util.Scanner;

public class Ex6Aleatorio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int palpitePlayer, numeroBot;

		System.out.println("-- Jogo de adivinhação --\n"
			+ "\n> Você tem 2 chances para adivinhar um número de 1 a 10 "
			+ "escolhido pelo computador");

		numeroBot = (int)(Math.random() * 10 + 1);

		System.out.print("\nDigite o seu primeiro palpite: ");
		palpitePlayer = input.nextInt();

		if (palpitePlayer >= 1 && palpitePlayer <= 10) {
			if (palpitePlayer == numeroBot) {
				System.out.printf("Você acertou de primeira! O número era %d\n",
				numeroBot);
			} else {
				System.out.print("Esse não é o número certo. Você ainda tem um "
					+ "palpite: ");
					palpitePlayer = input.nextInt();

				if (palpitePlayer == numeroBot) {
				System.out.printf("Você acertou na segunda tentativa! O número "
					+ "era %d\n", numeroBot);
				} else {
					System.out.printf("Você não acertou! O número era %d\n",
					numeroBot);
				}
			}
		} else {
			System.out.printf("%d não é um palpite válido. Você tem que digitar "
				+ "um número entre 1 e 10\n", palpitePlayer);
		}

		input.close();
	}
}
